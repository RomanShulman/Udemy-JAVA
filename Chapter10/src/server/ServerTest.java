/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import javax.swing.JFrame;

/**
 *
 * @author Hobbitus Ryzen
 */
public class ServerTest {
    
    public static void main(String[] args)
    {
        Server Host = new Server();
        
        Host.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Host.startRunning();
    }
    
}
