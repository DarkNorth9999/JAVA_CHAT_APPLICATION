package Gui;

import javax.swing.*;
import java.awt.*;

public class GroupChatContainer {
    private JScrollPane scrollPane;
    private static JPanel mainPanel;
    private static GroupChatContainer singleInstance;
    public static GroupChatContainer getInstance(){
        if(singleInstance == null){
            singleInstance = new GroupChatContainer();
        }
        return singleInstance;
    }
    public JScrollPane getGroupChatContainer(){
        return scrollPane;
    }

    private GroupChatContainer(){
        mainPanel = new JPanel();
        mainPanel.setBackground(Color.red);
        scrollPane = new JScrollPane();
        scrollPane.setViewportView(mainPanel);
        scrollPane.setBounds(0,110,600,640);
        mainPanel.setLayout(null);


    }

}
