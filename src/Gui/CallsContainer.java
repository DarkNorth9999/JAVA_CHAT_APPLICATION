package Gui;

import javax.swing.*;
import java.awt.*;

public class CallsContainer {
    private JScrollPane scrollPane;
    private static JPanel mainPanel;
    private static CallsContainer singleInstance;
    public static CallsContainer getInstance(){
        if(singleInstance == null){
            singleInstance = new CallsContainer();
        }
        return singleInstance;
    }
    public JScrollPane getCallsContainer(){
        return scrollPane;
    }

    private CallsContainer(){
        mainPanel = new JPanel();
        mainPanel.setBackground(Color.yellow);
        scrollPane = new JScrollPane();
        scrollPane.setViewportView(mainPanel);
        scrollPane.setBounds(0,110,600,640);
        mainPanel.setLayout(null);


    }

}
