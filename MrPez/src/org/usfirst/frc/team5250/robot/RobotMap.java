package org.usfirst.frc.team5250.robot;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.DigitalInput;
//import edu.wpi.first.wpilibj.AnalogInput;

public class RobotMap {

	public static CANJaguar driveTrainLeftFrontMotor;
	public static CANJaguar driveTrainRightFrontMotor;
	public static CANJaguar driveTrainLeftRearMotor;
	public static CANJaguar driveTrainRightRearMotor;
	public static CANJaguar pezElevatorMotor;

	public static RobotDrive robotDrive;

	public static Talon pawlLeftMotor;
	public static Talon pawlRightMotor;

	public static DigitalInput pawlLeftOpenLimit;
	public static DigitalInput pawlLeftCloseLimit;
	public static DigitalInput pawlRightOpenLimit;
	public static DigitalInput pawlRightCloseLimit;

	public static void init() {

		driveTrainLeftFrontMotor = new CANJaguar(Constants.driveTrainLeftFrontID); //left front
		driveTrainRightFrontMotor = new CANJaguar(Constants.driveTrainRightFrontID); //right front
		driveTrainLeftRearMotor = new CANJaguar(Constants.driveTrainLeftRearID); //left rear
		driveTrainRightRearMotor = new CANJaguar(Constants.driveTrainRightRearID); //right rear
		pezElevatorMotor = new CANJaguar(Constants.pezElevatorID); //Pez

		robotDrive = new RobotDrive(driveTrainLeftFrontMotor, driveTrainRightFrontMotor,
		driveTrainLeftRearMotor, driveTrainRightRearMotor); //Basic DriveTrain

		pawlLeftMotor = new Talon(0); //Pawl left w/ limit switches
		pawlRightMotor = new Talon(1); //Pawl right w/ limit switches

		pawlLeftOpenLimit = new DigitalInput(0); //Left open
		pawlLeftCloseLimit = new DigitalInput(1); //Left close
		pawlRightOpenLimit = new DigitalInput(2); //Right open
		pawlRightCloseLimit = new DigitalInput(3); //Right close

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