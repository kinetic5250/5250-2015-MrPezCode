package org.usfirst.frc.team5250.robot.commands;

import org.usfirst.frc.team5250.robot.OI;

public class PawlTest extends CommandBase {
	boolean finished = false;
	
	public PawlTest() {
		requires(pawlLeft);
	}
	
	protected void execute() {
		System.out.println("PawlTest");
		pawlLeft.set(OI.joystick0.getRawAxis(5));
		
	}
	protected boolean isFinished() {
		return finished;
	}
	
	protected void isInterrupted(){
		end();
	}
}