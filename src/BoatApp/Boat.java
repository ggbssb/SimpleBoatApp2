/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoatApp;

/**
 *
 * @author micah
 */
public class Boat 
{
    protected String name;
    protected int speed;
    protected int angle;
    protected boolean power;
    
    public Boat(String newBoatName, String command)
    {
        name = newBoatName;
        executeCommand(command);
    }
    
    void executeCommand(String command)
    {
        if (command.equals("power on"))
        {
            power = true;
            setPower();
        }
        if (command.equals("power off"))
        {
            power = false;
            setPower();
        }
        if (command.equals("speed up"))
        {
            this.speed = this.speed + 2;
            setSpeed();
        }
        
        if (command.equals("slow down"))
        {
            if (this.speed > 1){this.speed = this.speed - 2;}
            setSpeed();
        }
        
        if (command.equals("turn left"))
        {
            this.angle = this.angle - 5;
            setAngle();
        }
        if (command.equals("turn right"))
        {
            this.angle = this.angle + 5;
            setAngle();
        }
    }
    public void setPower()
    {
        if (power == true)
        {
            System.out.println(this.name+" is pointing in the direction of "+this.angle+" deg angle.");
        }
        
        if (power == false)
        {
            System.out.println(this.name+" is powered off.");
        }
    }
    
    public void setSpeed()
    {
        System.out.println(this.name+" is moving in "+this.angle+" deg angle at the speed of "+this.speed+" mph.");
    }
    
    public void setAngle()
    {
        System.out.println(this.name+" is in "+this.angle+" deg angle.");
    }
}
