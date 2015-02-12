package org.usfirst.frc.team5250.robot;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.PowerDistributionPanel;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	protected static PowerDistributionPanel powerDistributionPanel0;
	protected static CANJaguar canJaguar1;
	protected static CANJaguar canJaguar2;
	protected static CANJaguar canJaguar3;
	protected static CANJaguar canJaguar4;
	protected static CANJaguar canJaguar5;
	protected static CANJaguar canJaguar6;
	protected static CANJaguar canJaguar7;
	protected static CANJaguar canJaguar8;
	
	protected static RobotDrive robotDrive;
	
	public static void init() {
		powerDistributionPanel0 = new PowerDistributionPanel();
		canJaguar1 = new CANJaguar(1);
		canJaguar2 = new CANJaguar(2);
		canJaguar3 = new CANJaguar(3);
		canJaguar4 = new CANJaguar(4);
		canJaguar5 = new CANJaguar(5);
		canJaguar6 = new CANJaguar(6);
		canJaguar7 = new CANJaguar(7);
		canJaguar8 = new CANJaguar(8);
		
		robotDrive = new RobotDrive(canJaguar1, canJaguar2,
				                     canJaguar3, canJaguar4);
	}
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}