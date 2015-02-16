package org.usfirst.frc.team5250.robot;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Jaguar;
import java.lang.Math;

public class Robot extends IterativeRobot {
	public static PowerDistributionPanel powerDistributionPanel0;
	public static CANJaguar canJaguar21;
	public static CANJaguar canJaguar22;
	public static CANJaguar canJaguar23;
	public static CANJaguar canJaguar24;
	public static CANJaguar canJaguar25;
	public static CANJaguar canJaguar26;
	public static CANJaguar canJaguar27;
	
	public static RobotDrive robotDrive;
	
	public static Talon talon0;
	public static Talon talon1;
	public static Talon talon2;
	
	public static DigitalInput digitalInput0;
	public static DigitalInput digitalInput1;
	public static DigitalInput digitalInput2;
	public static DigitalInput digitalInput3;
	
	public static AnalogInput analogInput0;
	
	public static Joystick joystick0;
	public static CameraServer cameraServer;
	
    public void robotInit() {
    	powerDistributionPanel0 = new PowerDistributionPanel();
		canJaguar21 = new CANJaguar(21); //left front
		canJaguar22 = new CANJaguar(22); //right front
		canJaguar23 = new CANJaguar(23); //left rear
		canJaguar24 = new CANJaguar(24); //right rear
		canJaguar25 = new CANJaguar(25); //Pez
		canJaguar26 = new CANJaguar(26); //Arm Mover
		canJaguar27 = new CANJaguar(27); //Claw Mover
		
		robotDrive = new RobotDrive(canJaguar21, canJaguar23, canJaguar22, canJaguar24); //Basic DriveTrain
		
		canJaguar25.setPositionMode(CANJaguar.kQuadEncoder, 1, 10.0, 0, 0);
		//canJaguar25.setPositionMode(tag, codesPerRev, p, i, d);
		
		talon0 = new Talon(0); //Pawl left w/ limit switches
		talon1 = new Talon(1); //Pawl right w/ limit switches
		talon2 = new Talon(2); //Claw w/ limit switches
		
		digitalInput0 = new DigitalInput(0); //Left open
		digitalInput1 = new DigitalInput(1); //Left close
		digitalInput2 = new DigitalInput(2); //Right open
		digitalInput3 = new DigitalInput(3); //Right close
		
    	joystick0 = new Joystick(0);
		cameraServer = CameraServer.getInstance();
    	cameraServer.startAutomaticCapture("cam0");
    }
    
    public void teleopPeriodic() {
		long counter=0;
    	long feet=0;
    	long inch=0;
    	//double currentPosition = 0.0;
    	//double timeFPGAinSec;
    	//double timeFPGAinMilSec;
    	robotDrive.setSafetyEnabled(true);
    	while (isOperatorControl() && isEnabled()) {
        	//timeFPGAinSec=Timer.getFPGATimestamp();
        	//timeFPGAinMilSec=1000*timeFPGAinSec;
    		//currentPosition = canJaguar25.getPosition();
    		talon0.set(joystick0.getRawAxis(4));
        }
    }
    
    public void testPeriodic() {}
}
