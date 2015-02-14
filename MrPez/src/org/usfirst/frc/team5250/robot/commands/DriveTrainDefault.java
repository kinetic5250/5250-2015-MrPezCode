package org.usfirst.frc.team5250.robot.commands;
import org.usfirst.frc.team5250.robot.OI;

public class DriveTrainDefault extends CommandBase {
	
	public DriveTrainDefault() {
		requires(driveTrain);
	}
	
	protected void execute() {
		driveTrain.arcadeDrive(OI.joystick0.getRawAxis(1),OI.joystick0.getRawAxis(4));
	}
	
	protected boolean isFinished() {
		return false;
	}
}