package org.usfirst.frc.team5250.robot.commands;
import org.usfirst.frc.team5250.robot.Constants;
import org.usfirst.frc.team5250.robot.OI;
//import java.lang.Math;
//import org.usfirst.frc.team5250.util.Util;

public class FastDriveCommand extends CommandBase {
	public FastDriveCommand() {
		requires(driveTrain);
		System.out.println("FastDriveCommand");
	}
	
	protected void initialize() {
	}
	protected void execute() {
		driveTrain.arcadeDrive(OI.driverJoystick.getRawAxis(1)*0.6, OI.driverJoystick.getRawAxis(0)*Constants.driveTrainFast);
	}
	protected boolean isFinished() {
		return false;
	}
	protected void interrupted() {
		end();
	}
	protected void end() {
		driveTrain.arcadeDrive(0, 0);
	}
}