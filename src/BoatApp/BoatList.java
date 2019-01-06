/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoatApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author micah
 */
public class BoatList 
{
    public static void main(String args[]) throws FileNotFoundException
    {
        String fileName = "commands.txt";
        File fileObject = new File(fileName);
        PrintWriter out = new PrintWriter(fileName);                
        //Writes all elements in ArrayList "text" to txt file        
        out.println("power on");
        out.println("power off");
        out.println("speed up");
        out.println("slow down");
        out.println("turn left");
        out.println("turn right");
        out.close();
    }
}
