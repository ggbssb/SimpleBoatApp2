/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoatApp;

import java.util.Formatter;

/**
 *
 * @author micah
 */
public class TextFile 
{
    public static void main(String args [])
    {
        try{
        Formatter x = new Formatter("C:\\Users\\micah\\OneDrive\\Documents\\My Documents\\Education\\UCLA ext\\Week 8\\MicahNewsumProject8\\commands.txt");
            }catch (Exception e){
                System.out.println("Error");
            }
    }
}
