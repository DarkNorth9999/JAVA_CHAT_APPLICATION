package Gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame {

    private static MainFrame singleInstance;
    public static MainFrame getInstance(){
        if(singleInstance == null){
            singleInstance = new MainFrame();
        }
        return singleInstance;
    }


    JFrame frame;
    JPanel panel;

    public MainFrame(){

        frame = new JFrame();
        frame.setTitle("Whatsapp");
        frame.setBounds(20,20,500,750);
        frame.setBackground(Color.black);
        frame.setForeground(Color.black);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setResizable(false);

        panel = new JPanel();
        panel.setBackground(Color.GRAY);
        frame.getContentPane().add(panel);
        panel.setBounds(0,0,600,800);
        panel.setLayout(null);


        frame.repaint();
       frame.setVisible(true);
    }

    public void addRibbon(){
        panel.add(Ribbon.getInstance().getRibbon());
    }
// Adding Containers to the panel


    public void addContactsContainer(){
        panel.add(ContactsContainer.getInstance().getContactsContainer());
    }
    public void addCallsContainer(){
        panel.add(CallsContainer.getInstance().getCallsContainer());
    }
    public void addGroupChatContainer(){
        panel.add(GroupChatContainer.getInstance().getGroupChatContainer());
    }
    public void addChatContainer(){
        panel.add(ChatsContainer.getInstance().getChatsContainer());
    }
// Activating the different Containers

    public void activateContactsContainer(){
        Ribbon.getInstance().getRibbon().setVisible(true);
        ChatsContainer.getInstance().getChatsContainer().setVisible(false);
        GroupChatContainer.getInstance().getGroupChatContainer().setVisible(false);
        CallsContainer.getInstance().getCallsContainer().setVisible(false);
        ContactsContainer.getInstance().getContactsContainer().setVisible(true);
    }

    public void activateCallsContainer(){
        Ribbon.getInstance().getRibbon().setVisible(true);
        ChatsContainer.getInstance().getChatsContainer().setVisible(false);
        GroupChatContainer.getInstance().getGroupChatContainer().setVisible(false);
        CallsContainer.getInstance().getCallsContainer().setVisible(true);
        ContactsContainer.getInstance().getContactsContainer().setVisible(false);
    }

    public void activateGroupChatContainer(){
        Ribbon.getInstance().getRibbon().setVisible(true);
        ChatsContainer.getInstance().getChatsContainer().setVisible(false);
        GroupChatContainer.getInstance().getGroupChatContainer().setVisible(true);
        CallsContainer.getInstance().getCallsContainer().setVisible(false);
        ContactsContainer.getInstance().getContactsContainer().setVisible(false);
    }

    public void activateChatsContainer(){
        Ribbon.getInstance().getRibbon().setVisible(true);
        ChatsContainer.getInstance().getChatsContainer().setVisible(true);
        GroupChatContainer.getInstance().getGroupChatContainer().setVisible(false);
        CallsContainer.getInstance().getCallsContainer().setVisible(false);
        ContactsContainer.getInstance().getContactsContainer().setVisible(false);
    }

    public static void main(String[] args) {

        MainFrame mf = MainFrame.getInstance();
        mf.addRibbon();
        mf.addCallsContainer();
        mf.addChatContainer();
        mf.addContactsContainer();
        mf.addGroupChatContainer();

        ChatsContainer.getInstance().setChatonGui("Mr. Advisor","10:45","Hey!!","1234","I am advisor");
        ChatsContainer.getInstance().setChatonGui("Mr. Editor","11:45","Hello!!","4321","I am editor");
        //Contacts---
        ContactsContainer.getInstance().setContactOnGui("Mr. Advisor","1234","I am advisor");
        ContactsContainer.getInstance().setContactOnGui("Mr. Editor","4321","I am editor");
        ContactsContainer.getInstance().setContactOnGui("Sam","5678","Welcome to LBA.");
        mf.frame.setVisible(true);
    }
}
