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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Hobbitus Ryzen
 */
public class Server extends JFrame {

    private JTextField userText;
    private JTextArea chatWindow;
    private ObjectOutputStream output;
    private ObjectInputStream input;
    private ServerSocket server;
    private Socket connection;

    public Server() {
        super("SERVER");
//        ******* Setting the chat history area ******
        userText = new JTextField();
        userText.setEditable(false);

        userText.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                        sendMessage(event.getActionCommand());
                userText.setText("");
            }
        });
        add(userText, BorderLayout.SOUTH);
//        ****** Setting the chat window ******
        chatWindow = new JTextArea();
        chatWindow.setEditable(false);
//        ******* Setting the ability to scroll to chat window *****
        add(new JScrollPane(chatWindow));
        setSize(1280, 720);
        setVisible(true);
    }

    public void startRunning() {
        try {
            server = new ServerSocket(3000, 20);

            while (true) {
                try 
                {
                    Connection();
                    Setup();
                Chatting();
                } catch (EOFException e) 
                {
                    showMessage("\n Server ended the connection! ");
                } finally {
                    closeAll();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void Connection() throws IOException {
        showMessage("Waiting for a connection ...\n");
        connection = server.accept();
        showMessage(connection.getInetAddress().getHostName() +  " connected.\n");

    }

    private void Setup() throws IOException {
//       ********** Initialization of OUTPUT stream with reference to our connected client.************
        output = new ObjectOutputStream(connection.getOutputStream());
//       ************ Making sure our OUTPUT stream is empty on start. ************
        output.flush();
//      ************  Initialization of INPUT stream with reference to our connected client. ************
        input = new ObjectInputStream(connection.getInputStream());
        showMessage("Everything is setup!\n");
    }
    
    private void Chatting() throws IOException
    {
        String message = "Connected!";
        sendMessage(message);
//      ************  Locking the client-server channel so clients can communicate with server only 1 at a time. ************
        canType(true);
        do
        {
//       ************ If user sends something that is not a String ************
            try
            {
                message = (String) input.readObject();
                showMessage(message + "\n");
            }
            catch (ClassNotFoundException e)
            {
                showMessage("Command not recognized.\n");
            }
        }
//      ************  Chat works until the user types "CLIENT - END". ************
        while(!message.equals("CLIENT - END"));
    }
    
    private void closeAll()
    {
        showMessage("Closing connection...\n");
        canType(false);
//        ************ Closing INPUT and OUTPUT streams and socket CONNECTION. ************
        try
        {
            output.close();
            input.close();
            connection.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

}
