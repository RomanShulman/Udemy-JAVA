/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Hobbitus Ryzen
 */
public class Client extends JFrame {

    private JTextField userText;
    private JTextArea chatWindow;
    private ObjectOutputStream output;
    private ObjectInputStream input;
    private Socket connection;
    private String serverIP;

    public Client(String host) {
        super("CLIENT");
        serverIP = host;
//        ******* Setting the chat history area ******
        userText = new JTextField();
        userText.setEditable(false);
//        ******* Keeping chat line empty after every action (such as sending message) ******
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
        add(new JScrollPane(chatWindow), BorderLayout.CENTER);
        setSize(1280, 720);
        setVisible(true);

    }

    public void startRunning2() {
        try {
            Connection();
            Setup();
            Chatting();
        } catch (EOFException e) {
            showMessage("\n Client ended the connection! ");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeAll();
        }
    }

    private void Connection() throws IOException {
        showMessage("Connecting ...\n");
        connection = new Socket(InetAddress.getByName(serverIP), 3000);
        showMessage("Connected to " + connection.getInetAddress().getHostName() + "\n");

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

    private void Chatting() throws IOException {
        String message = "Connected!";
        sendMessage(message);
//      ************  Locking the client-server channel so clients can communicate with server only 1 at a time. ************
        canType(true);
        do {
//       ************ If user sends something that is not a String ************
            try {
                message = (String) input.readObject();
                showMessage(message + "\n");
            } catch (ClassNotFoundException e) {
                showMessage("Command not recognized.\n");
            }
        } //      ************  Chat works until the server types "SERVER - END". ************
        while (!message.equals("SERVER - END"));
    }

    private void closeAll() {
        showMessage("Closing connection...\n");
        canType(false);
//        ************ Closing INPUT and OUTPUT streams and socket CONNECTION. ************
        try {
            output.close();
            input.close();
            connection.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sendMessage(String message) {
        try {
            output.writeObject("CLIENT - " + message);
            output.flush();
//          ************  Showing the message in our chat window. ************
            showMessage("CLIENT - " + message + "\n");
        } catch (IOException e) {
            chatWindow.append("Error - Message cannot be sent.");
        }
    }

    private void showMessage(final String text) {
        SwingUtilities.invokeLater(
                new Runnable() {
            public void run() {
                chatWindow.append(text);
            }
        }
        );
    }

    private void canType(final boolean tof) {
        SwingUtilities.invokeLater(
                new Runnable() {
            public void run() {
                userText.setEditable(tof);
            }
        }
        );
    }

}
