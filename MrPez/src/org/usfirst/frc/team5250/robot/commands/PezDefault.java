package org.usfirst.frc.team5250.robot.commands;

import org.usfirst.frc.team5250.robot.OI;

public class PezDefault extends CommandBase {
	public PezDefault() {
		requires(pez);
	}
	
	protected void initialize() {
	}
	
	protected void execute() {
		pez.setPez(OI.joystick0.getRawAxis(5)*5);
	}
	
	protected boolean isFinished() {
		return false;
	}
}
