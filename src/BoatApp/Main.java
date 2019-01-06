/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoatApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author micah
 */
public class Main 
{
    private static String validName;
    private static String validCommand;
    private static String validFormat;
    static ArrayList<String> boatList = new ArrayList<>();
    static ArrayList<Boat> boats = new ArrayList<>();
    
    public static void main(String args[]) throws FileNotFoundException
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Please provide input (Boat name,command): ");
        console.useDelimiter(",");
        while (console.hasNextLine())
        {
            String line = console.nextLine();           
            String boat = "";
            String command = "";
            validFormat = "";
            for (int i = 0; i < line.length(); i++)
            {
                if (line.charAt(i) == ',')
                {
                    boat = line.substring(0, i);
                    command = line.substring(i+1); 
                    validFormat = "YES";
                }
            }
            checkInput(boat,command);                   
        }              
    }
    
    static void checkInput(String boat, String command) throws FileNotFoundException
    {
            if (validFormat.equals("YES"))
            {
               checkBoat(boat); 
            }
            else
            {
                System.out.println("The input format is an incorrect.");
                return;
            }
            
            if (validName.equals("YES"))
            {
                checkCommand(command); 
            }
            else 
            {
                System.out.println("The boat name entered does not exist.");
                return;
            }
            if (!validCommand.equals("YES"))
            {
                System.out.println("Input command is invalid.");
            }
            else
            {
                processInput(boat,command);
            }
    }
    
    public static void checkBoat(String boat) throws FileNotFoundException
    {
        String fileName = "boats.txt";
        File fileObject = new File(fileName);
        Scanner in = new Scanner(fileObject);
        validName = "";
        while (in.hasNextLine())
        {
            String boatName = in.nextLine();
            if (boat.equals(boatName))
            {
                validName = "YES";            
            }
        }
    }
    
    public static void checkCommand(String newCommand) throws FileNotFoundException
    {
        String fileName = "commands.txt";
        File fileObject = new File(fileName);
        Scanner in = new Scanner(fileObject);
        validCommand = "";
        while (in.hasNextLine())
        {
            String command = in.nextLine();
            if (command.equals(newCommand))
            {
                validCommand = "YES";            
            }
        }
    }    
    public static void processInput(String boat, String command)
    {
        if (boatList.contains(boat))
        {
            int i = boatList.indexOf(boat);
            setCommand(i, command);
        }
        else
        {
            boatList.add(boat);
            Boat newBoat = new Boat(boat, command);
            boats.add(newBoat);
        }
    }
    
    static void setCommand(int i, String command)
    {
        boats.get(i).executeCommand(command);
    }
}
