package org.usfirst.frc.team5250.robot;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.DigitalInput;

public class RM {

	public static CANJaguar driveTrainLeftFrontMotor;
	public static CANJaguar driveTrainRightFrontMotor;
	public static CANJaguar driveTrainLeftRearMotor;
	public static CANJaguar driveTrainRightRearMotor;
	public static CANJaguar pezElevatorMotor;
	
	public static CANJaguar armArmMotor;
	public static CANJaguar armClawMotor;
	public static CANJaguar armWristMotor;
	

	public static RobotDrive robotDrive;

	public static Talon pawlLeftMotor;
	public static Talon pawlRightMotor;

	public static DigitalInput pawlLeftOpenLimit;
	public static DigitalInput pawlLeftCloseLimit;
	public static DigitalInput pawlRightOpenLimit;
	public static DigitalInput pawlRightCloseLimit;

	public static void init() {

		driveTrainLeftRearMotor = new CANJaguar(21); //left rear
		driveTrainRightRearMotor = new CANJaguar(22); //right rear
		driveTrainLeftFrontMotor = new CANJaguar(23); //left front
		driveTrainRightFrontMotor = new CANJaguar(24); //right front
		pezElevatorMotor = new CANJaguar(25); //Pez
		armArmMotor = new CANJaguar(26); //Pez
		armClawMotor = new CANJaguar(27); //Claw
		armWristMotor = new CANJaguar(28); //Wrist
		
		robotDrive = new RobotDrive(driveTrainLeftFrontMotor, driveTrainLeftRearMotor,
		driveTrainRightFrontMotor, driveTrainRightRearMotor); //Basic DriveTrain

		pawlLeftMotor = new Talon(0); //Pawl left w/ limit switches
		pawlRightMotor = new Talon(1); //Pawl right w/ limit switches

		pawlLeftOpenLimit = new DigitalInput(Constants.leftOpenLimitID); //Left open
		pawlLeftCloseLimit = new DigitalInput(Constants.leftCloseLimitID); //Left close
		pawlRightOpenLimit = new DigitalInput(Constants.rightOpenLimitID); //Right open
		pawlRightCloseLimit = new DigitalInput(Constants.rightCloseLimitID); //Right close

		driveTrainRightFrontMotor.setVoltageRampRate(Constants.driveTrainRampRate);
		driveTrainLeftFrontMotor.setVoltageRampRate(Constants.driveTrainRampRate);
		driveTrainRightRearMotor.setVoltageRampRate(Constants.driveTrainRampRate);
		driveTrainLeftRearMotor.setVoltageRampRate(Constants.driveTrainRampRate);

		robotDrive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
		robotDrive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
		robotDrive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
		robotDrive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
		robotDrive.isSafetyEnabled();
		robotDrive.setExpiration(250);
	}
}