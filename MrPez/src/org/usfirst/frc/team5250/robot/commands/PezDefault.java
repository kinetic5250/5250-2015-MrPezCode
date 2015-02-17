package org.usfirst.frc.team5250.robot.commands;

import org.usfirst.frc.team5250.robot.OI;
import org.usfirst.frc.team5250.robot.RobotMap;

public class PezDefault extends CommandBase {
	public PezDefault() {
		requires(pez);
	}
	
	protected void initialize() {
		pez.setPezPercentMode();
	}
	
	protected void execute() {
		RobotMap.canJaguar25.set(OI.joystick0.getRawAxis(5));
	}
	
	protected boolean isFinished() {
		return false;
	}
}
