package Gui;

import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ribbon {

    private static Ribbon singleInstance;
    public static Ribbon getInstance(){
        if(singleInstance == null){
            singleInstance = new Ribbon();
        }
        return singleInstance;
    }

    private JPanel mainPanel;
    JPanel upperPanel;
    JPanel lowerPanel;
    JLabel contacts,calls,chats,groupChat;

    public JPanel getRibbon(){
        return mainPanel;
    }

    private Ribbon(){
        mainPanel = new JPanel();
        mainPanel.setBackground(Color.darkGray);
        mainPanel.setBounds(0,0,600,110);
        mainPanel.setLayout(null);

        upperPanel = new JPanel();
        upperPanel.setBackground(new Color(160,32,240));
        upperPanel.setBounds(0,0,600,50);
        upperPanel.setLayout(null);

        JLabel whatsapp = new JLabel("WhatsApp");
        whatsapp.setForeground(Color.white);
        whatsapp.setBounds(12,5,600,22);
        whatsapp.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
        upperPanel.add(whatsapp);
        mainPanel.add(upperPanel);

        lowerPanel = new JPanel();
        lowerPanel.setBounds(0,50,600,60);
        lowerPanel.setBackground(new Color(160,32,240));
        lowerPanel.setLayout(null);


        chats = new JLabel("CHATS");
        chats.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                switchTab(1);
            }
        });
        chats.setForeground(Color.white);
        chats.setBounds(5,0,120,50);
        chats.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        chats.setHorizontalAlignment(SwingConstants.CENTER);
        lowerPanel.add(chats);

        calls =  new JLabel("CALLS");
        calls.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                switchTab(2);
            }
        });
        calls.setForeground(Color.white);
        calls.setBounds(130,0,120,50);
        calls.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        calls.setHorizontalAlignment(SwingConstants.CENTER);
        lowerPanel.add(calls);

        contacts =  new JLabel("CONTACTS");
        contacts.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                switchTab(3);
            }
        });
        contacts.setForeground(Color.white);
        contacts.setBounds(255,0,120,50);
        contacts.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        contacts.setHorizontalAlignment(SwingConstants.CENTER);
        lowerPanel.add(contacts);

        groupChat =  new JLabel("GROUP");
        groupChat.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                switchTab(4);
            }
        });
        groupChat.setForeground(Color.white);
        groupChat.setBounds(380,0,120,50);
        groupChat.setFont(new Font("SAN_SERIF", Font.BOLD, 15));
        groupChat.setHorizontalAlignment(SwingConstants.CENTER);
        lowerPanel.add(groupChat);

        mainPanel.add(lowerPanel);


    }

    public void switchTab(int num){
        if(num == 1){
                chats.setBorder(new MatteBorder(0,0,6,0, (Color) new Color(255,255,255)));
                calls.setBorder(null);
                groupChat.setBorder(null);
                contacts.setBorder(null);
                MainFrame.getInstance().activateChatsContainer();
        }
        if(num == 2){
            calls.setBorder(new MatteBorder(0,0,6,0, (Color) new Color(255,255,255)));
            contacts.setBorder(null);
            groupChat.setBorder(null);
            chats.setBorder(null);
            MainFrame.getInstance().activateCallsContainer();
        }
        if(num == 3){
            contacts.setBorder(new MatteBorder(0,0,6,0, (Color) new Color(255,255,255)));
            calls.setBorder(null);
            groupChat.setBorder(null);
            chats.setBorder(null);
            MainFrame.getInstance().activateContactsContainer();
        }
        if(num == 4){
            groupChat.setBorder(new MatteBorder(0,0,6,0, (Color) new Color(255,255,255)));
            calls.setBorder(null);
            contacts.setBorder(null);
            chats.setBorder(null);
            MainFrame.getInstance().activateGroupChatContainer();
        }
    }
}
