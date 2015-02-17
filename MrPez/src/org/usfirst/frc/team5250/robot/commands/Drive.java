package org.usfirst.frc.team5250.robot.commands;

import org.usfirst.frc.team5250.robot.OI;

public class Drive extends CommandBase {
	
	public Drive() {
		requires(driveTrain);
	}
	
	protected void execute() {
		driveTrain.arcadeDrive(OI.joystick0.getRawAxis(1)*-1,OI.joystick0.getRawAxis(0)*-1);
	}
	
	protected boolean isFinished() {
		return false;
	}
}