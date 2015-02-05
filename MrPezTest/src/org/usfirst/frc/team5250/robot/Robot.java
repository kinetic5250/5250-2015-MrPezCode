package org.usfirst.frc.team5250.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Jaguar;



import java.lang.Math;

public class Robot extends IterativeRobot {
    
	Talon talon0; // rearLeft motor
	Talon talon1; // rearRight motor
	Jaguar jaguar3;
	RobotDrive robotDrive;
	Joystick joystick1;
	CameraServer cameraServer0;
	DigitalInput digitalInput0;
	AnalogInput analogInput0;
	
    public void robotInit() {
    	talon0 = new Talon(0);
    	talon1 = new Talon(1);
    	jaguar3 = new Jaguar(3);
		robotDrive = new RobotDrive(talon0,talon1);
    	robotDrive.setExpiration(0.1);
    	robotDrive.setInvertedMotor(RobotDrive.MotorType.kRearLeft,true);
    	robotDrive.setInvertedMotor(RobotDrive.MotorType.kRearRight,true);
    	joystick1= new Joystick(0);
    	//Joystick stick2 = new Joystick(1);
    	cameraServer0 = CameraServer.getInstance();
    	cameraServer0.setQuality(25);
    	cameraServer0.startAutomaticCapture("cam0");
    	digitalInput0 = new DigitalInput(0); //Hall Effect Sensor
    	analogInput0 = new AnalogInput(0); //Sonar
    }
    
    public void teleopPeriodic() {
    	/* NOTE: Warning

		When using the IterativeRobot as your Robot class, you should avoid doing the following operations in the xxxPeriodic functions or 
		functions that have xxxPeriodic in the call stack:

		Never use Timer.delay as you will momentarily lose control of your robot during the delay, and it will not be as responsive.
		Avoid using loops, as unexpected conditions may cause you to lose control of your robot.
    	*/
		
		//most Java.lang.Math params require long types
		long counter=0;
    	long feet=0;
    	long inch=0;
    	//double timeFPGAinSec;
    	//double timeFPGAinMilSec;
    	robotDrive.setSafetyEnabled(true);
    	while (isOperatorControl() && isEnabled()) {
        	//timeFPGAinSec=Timer.getFPGATimestamp();
        	//timeFPGAinMilSec=1000*timeFPGAinSec;
            robotDrive.arcadeDrive(joystick1);
			jaguar3.set(joystick1.getRawAxis(4));
            if((counter%1000)==1) {
            	feet=Math.round(analogInput0.getAverageVoltage()*1000/9.766)/12;
                inch=Math.round(analogInput0.getAverageVoltage()*1000/9.766)%12;
            	System.out.println("Hall Effect: "+digitalInput0.get()+feet+" feet "+inch+" inch ");
            }
            counter++;
        }
    }
    
    public void testPeriodic() {}
}
