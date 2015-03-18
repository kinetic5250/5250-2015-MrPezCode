package org.usfirst.frc.team5250.robot;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.AnalogInput;

public class RobotMap {
	
	public static CANJaguar driveTrainLeftFront;
	public static CANJaguar driveTrainRightFront;
	public static CANJaguar driveTrainLeftRear;
	public static CANJaguar driveTrainRightRear;
	public static CANJaguar pezElevator;
	
	public static RobotDrive robotDrive;
	
	public static Talon talon0;
	public static Talon talon1;
	public static Talon talon2;
	
	public static DigitalInput digitalInput0;
	public static DigitalInput digitalInput1;
	public static DigitalInput digitalInput2;
	public static DigitalInput digitalInput3;
	
	public static AnalogInput analogInput0;
	
	public static void init() {
		
		driveTrainLeftFront = new CANJaguar(Constants.driveTrainLeftFrontID); //left front
		driveTrainRightFront = new CANJaguar(Constants.driveTrainRightFrontID); //right front
		driveTrainLeftRear = new CANJaguar(Constants.driveTrainLeftRearID); //left rear
		driveTrainRightRear = new CANJaguar(Constants.driveTrainRightRearID); //right rear
		pezElevator = new CANJaguar(Constants.pezElevatorID); //Pez
		
		robotDrive = new RobotDrive(driveTrainLeftFront, driveTrainRightFront,
			driveTrainLeftRear, driveTrainRightRear); //Basic DriveTrain
		
		talon0 = new Talon(0); //Pawl left w/ limit switches
		talon1 = new Talon(1); //Pawl right w/ limit switches
		
		digitalInput0 = new DigitalInput(0);//Left open
		digitalInput1 = new DigitalInput(1);//Left close
		digitalInput2 = new DigitalInput(2);//Right open
		digitalInput3 = new DigitalInput(3);//Right close
		
		analogInput0 = new AnalogInput(0);

		driveTrainRightFront.setVoltageRampRate(Constants.driveTrainRampRate);
		driveTrainLeftFront.setVoltageRampRate(Constants.driveTrainRampRate);
		driveTrainRightRear.setVoltageRampRate(Constants.driveTrainRampRate);
		driveTrainLeftRear.setVoltageRampRate(Constants.driveTrainRampRate);
		
		robotDrive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
		robotDrive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
		robotDrive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
		robotDrive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
		robotDrive.isSafetyEnabled();
		robotDrive.setExpiration(250);
	}
}