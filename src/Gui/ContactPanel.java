package Gui;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

public class ContactPanel {
    private JPanel mainPanel;
    public JPanel getContactPanel(){
        return mainPanel;
    }
    ContactPanel (int num, String contactNumber, String contactName, String contactAbout, BufferedImage image){
        RelativeLayout r1 = new RelativeLayout(RelativeLayout.X_AXIS);
        r1.setFill(true);

        mainPanel = new JPanel();
        mainPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Opened ConversationPanel");
            }
        });

        mainPanel.setBorder(new MatteBorder(0,0,1,0,(Color) Color.LIGHT_GRAY));
        mainPanel.setBackground(Color.white);
        mainPanel.setBounds(0,50*(num-1),600,50);

        JPanel leftPanel = new JPanel() ;
        leftPanel.setBackground(Color.white);
        leftPanel.setLayout(new BorderLayout(0,0));
        JLabel label = new JLabel("");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        label.setIcon(new ImageIcon(image));
        leftPanel.add(label);
        mainPanel.add(leftPanel, new Float(25));

        RelativeLayout r2 = new RelativeLayout(RelativeLayout.Y_AXIS);
        r2.setFill(true);

        JPanel rightPanel = new JPanel(r2);
        rightPanel.setBackground(Color.white);
        JLabel name = new JLabel(contactName);
        name.setVerticalAlignment(SwingConstants.BOTTOM);
        name.setForeground(Color.black);
        name.setFont(new Font("Tahoma",Font.BOLD,15));
        rightPanel.add(name, new Float(50));

        JLabel about = new JLabel(contactAbout);
        about.setFont(new Font("Roboto",Font.PLAIN,12));
        about.setForeground(Color.black);
        rightPanel.add(about,new Float(50));

        mainPanel.add(rightPanel,new Float(75));

    }
}
