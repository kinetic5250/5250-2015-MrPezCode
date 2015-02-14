package org.usfirst.frc.team5250.robot;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.Talon;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	public static PowerDistributionPanel powerDistributionPanel0;
	public static CANJaguar canJaguar1;
	public static CANJaguar canJaguar2;
	public static CANJaguar canJaguar3;
	public static CANJaguar canJaguar4;
	public static CANJaguar canJaguar5;
	public static CANJaguar canJaguar6;
	public static CANJaguar canJaguar7;
	
	public static RobotDrive robotDrive;
	
	public static Talon talon0;
	public static Talon talon1;
	public static Talon talon2;
	
	public static void init() {
		powerDistributionPanel0 = new PowerDistributionPanel();
		canJaguar1 = new CANJaguar(1); //left front
		canJaguar2 = new CANJaguar(2); //right front
		canJaguar3 = new CANJaguar(3); //left rear
		canJaguar4 = new CANJaguar(4); //right rear
		canJaguar5 = new CANJaguar(5); //Pez
		canJaguar6 = new CANJaguar(6); //Arm Mover
		canJaguar7 = new CANJaguar(7); //Claw Mover
		
		robotDrive = new RobotDrive(canJaguar1, canJaguar2,
				                     canJaguar3, canJaguar4); //Basic DriveTrain
		
		talon0 = new Talon(0); //Pawl left w/ limit switches
		talon1 = new Talon(1); //Pawl right w/ limit switches
		talon2 = new Talon(2); //Claw w/ limit switches
	}
}