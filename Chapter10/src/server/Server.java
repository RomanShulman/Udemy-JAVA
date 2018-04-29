/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author Hobbitus Ryzen
 */
public class Server extends JFrame
{
    private JTextField userText;
    private JTextArea chatWindow;
    private ObjectOutputStream output;
    private ObjectInputStream input;
    private ServerSocket server;
    private Socket connection;

    public Server()
    {
        super("SERVER");
        /******* Setting the chat history area ******/
        userText = new JTextField();
        userText.setEditable(false);
        
        userText.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent event)
                    {
                        sendMessage(event.getActionCommand());
                        userText.setText("");
                    }                    
                });
        add(userText, BorderLayout.SOUTH);
        /******* Setting the chat window ******/
        chatWindow = new JTextArea();
        chatWindow.setEditable(false);
        /******* Setting the ability to scroll to chat window ******/
        add(new JScrollPane(chatWindow));
        setSize(1280, 720);

    }
    
    
    
    
    
    
    
    
}
