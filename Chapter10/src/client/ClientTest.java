/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import javax.swing.JFrame;
/**
 *
 * @author Hobbitus Ryzen
 */
public class ClientTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Client homeAddress = new Client("10.100.102.5");
        homeAddress.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeAddress.startRunning2();
    }
    
}
