package org.usfirst.frc.team5250.robot;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.CameraServer;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static CameraServer cameraServer;
	
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
	
	public static void init() {
		
		powerDistributionPanel0 = new PowerDistributionPanel();
		canJaguar21 = new CANJaguar(21); //left front
		canJaguar22 = new CANJaguar(22); //right front
		canJaguar23 = new CANJaguar(23); //left rear
		canJaguar24 = new CANJaguar(24); //right rear
		canJaguar25 = new CANJaguar(25); //Pez
		canJaguar26 = new CANJaguar(26); //Arm Mover
		canJaguar27 = new CANJaguar(27); //Claw Mover
		
		robotDrive = new RobotDrive(canJaguar21, canJaguar23,
				                     canJaguar22, canJaguar24); //Basic DriveTrain
		
		talon0 = new Talon(0); //Pawl left w/ limit switches
		talon1 = new Talon(1); //Pawl right w/ limit switches
		talon2 = new Talon(2); //Claw w/ limit switches

		cameraServer = CameraServer.getInstance();
    	cameraServer.startAutomaticCapture("cam0");
	}
}