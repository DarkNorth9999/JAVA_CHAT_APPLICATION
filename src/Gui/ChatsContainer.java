package Gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ChatsContainer {
    private JScrollPane scrollPane;
    private static JPanel mainPanel;
    private int i = 1;
    private static ChatsContainer singleInstance;
    public static ChatsContainer getInstance(){
        if(singleInstance == null){
            singleInstance = new ChatsContainer();
        }
        return singleInstance;
    }
    public JScrollPane getChatsContainer(){
        return scrollPane;
    }

    private ChatsContainer(){
        mainPanel = new JPanel();
        mainPanel.setBackground(Color.BLUE);
        scrollPane = new JScrollPane();
        scrollPane.setViewportView(mainPanel);
        scrollPane.setBounds(0,110,600,640);
        mainPanel.setLayout(null);

    }

    private JPanel addChatPanel(int num,String chatName, String time, String chat, String number, String about, BufferedImage image){
        ChatPanel cp = new ChatPanel(num, chatName, time,chat, number,about,image);
        JPanel temp = cp.getChatPanel();
        return temp;
    }
    public void setChatonGui(String chatName, String time, String chat, String number, String about){
        BufferedImage dummyImage;
        try{
            dummyImage = ImageIO.read(ChatsContainer.class.getResource("/img/chatDp.jpeg"));
            mainPanel.add(addChatPanel(i,chatName,time,chat, number, about,dummyImage);
            i++;
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
