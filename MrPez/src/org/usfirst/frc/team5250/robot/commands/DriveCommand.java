package org.usfirst.frc.team5250.robot.commands;
import org.usfirst.frc.team5250.robot.Constants;
import org.usfirst.frc.team5250.robot.OI;
import java.lang.Math;
import org.usfirst.frc.team5250.util.Util;
public class DriveCommand extends CommandBase {
	public double XOutput = 0.0;
	public double joystickXAxis = 0.0;
	public double YOutput = 0.0;
	public double joystickYAxis = 0.0;
	public DriveCommand() {
		requires(driveTrain);
	}
	
	protected void initialize() {
		System.out.println("DriveCommand");
	}
	protected void execute() {
		joystickXAxis = Util.calculateDeadband(OI.driverJoystick.getRawAxis(Constants.XBoxAxisType.kLeftX), Constants.driveTrainDeadband);
		joystickYAxis = Util.calculateDeadband(OI.driverJoystick.getRawAxis(Constants.XBoxAxisType.kLeftY), Constants.driveTrainDeadband);
		XOutput = (joystickXAxis > 0) ? Math.pow(Math.abs(joystickXAxis), Constants.driveTrainExponent) : Math.pow(Math.abs(joystickXAxis), Constants.driveTrainExponent) * -1;
		YOutput = joystickYAxis;
		driveTrain.arcadeDrive(YOutput, XOutput);
	}
	protected boolean isFinished() {
		return false;
	}
}