package org.usfirst.frc.team5250.robot.commands;
import org.usfirst.frc.team5250.robot.Constants;
import org.usfirst.frc.team5250.robot.OI;
//import java.lang.Math;
//import org.usfirst.frc.team5250.util.Util;
public class SlowDriveCommand extends CommandBase {
	public SlowDriveCommand() {
		requires(driveTrain);
		System.out.println("SlowDriveCommand");
	}
	
	protected void initialize() {
	}
	protected void execute() {
		driveTrain.arcadeDrive(OI.driverJoystick.getRawAxis(1)*Constants.driveTrainSlow, OI.driverJoystick.getRawAxis(0)*Constants.driveTrainSlow);
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