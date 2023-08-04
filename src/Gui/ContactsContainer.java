package Gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ContactsContainer {
    private JScrollPane scrollPane;
    private static JPanel mainPanel;
    private int i = 1;
    private static ContactsContainer singleInstance;
    public static ContactsContainer getInstance(){
        if(singleInstance == null){
            singleInstance = new ContactsContainer();
        }
        return singleInstance;
    }
    public JScrollPane getContactsContainer(){
        return scrollPane;
    }

    private ContactsContainer(){
        mainPanel = new JPanel();
        mainPanel.setBackground(Color.BLUE);
        scrollPane = new JScrollPane();
        scrollPane.setViewportView(mainPanel);
        scrollPane.setBounds(0,110,600,640);
        mainPanel.setLayout(null);

    }

    private JPanel addContactPanel(int num, String number, String name, String about, BufferedImage image){
        ContactPanel cp = new ContactPanel(num,number,name,about,image);
        JPanel temp = cp.getContactPanel();
        return temp;
    }
    public void setContactOnGui(String name,String number,String about)
    {
        BufferedImage dummyImage;
        try
        {
            dummyImage = ImageIO.read(ContactsContainer.class.getResource("/img/contactDP.jpeg"));
            mainPanel.add(addContactPanel(i,number,name,about,dummyImage));
            i++;
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
