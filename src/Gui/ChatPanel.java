package Gui;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

public class ChatPanel {
    private JPanel mainPanel;
    public JPanel getChatPanel(){
        return mainPanel;
    }
    ChatPanel (int num, String chatName, String time, String chat, String number , String about, BufferedImage image){
        RelativeLayout r1 = new RelativeLayout(RelativeLayout.X_AXIS);
        r1.setFill(true);

        mainPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(SwingUtilities.isRightMouseButton(e) || e.isControlDown()){
                    JOptionPane.showMessageDialog(null,"Right Click!");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Left Click!");
                }
            }
        });

        mainPanel.setBackground(Color.white);
        mainPanel.setBounds(0,80*(num-1),600,80);

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.white);
        leftPanel.setLayout(new BorderLayout(0,0));
        JLabel profileIcon = new JLabel("");
        profileIcon.setHorizontalAlignment(SwingConstants.CENTER);
        profileIcon.setIcon(new ImageIcon(image));
        mainPanel.add(leftPanel,new Float(25));

        JPanel middlePanel = new JPanel();
        middlePanel.setLayout(null);
        middlePanel.setBackground(Color.white);
        middlePanel.setBorder(new MatteBorder(0,0,1,0, (Color) Color.lightGray));

        JLabel name = new JLabel(chatName);
        name.setForeground(Color.black);
        name.setFont(new Font("Tohama",Font.BOLD,15));
        name.setBounds(10,12,139,25);
        middlePanel.add(name);

        JLabel recentMsg = new JLabel(chat);
        recentMsg.setForeground(Color.black);
        recentMsg.setBounds(10,40,163,14);
        recentMsg.setFont(new Font("Roboto", Font.BOLD,12));
        middlePanel.add(recentMsg);
        mainPanel.add(middlePanel,new Float(55));

        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(null);
        rightPanel.setBackground(Color.white);
        rightPanel.setBorder(new MatteBorder(0,0,1,0, (Color) Color.lightGray));

        JLabel timeLabel = new JLabel(time);
        timeLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        timeLabel.setFont(new Font("Roboto", Font.BOLD,12));
        timeLabel.setForeground(Color.black);
        timeLabel.setBounds(44,15,104,14);
        rightPanel.add(timeLabel);
        mainPanel.add(rightPanel,new Float(20));

    }


}
