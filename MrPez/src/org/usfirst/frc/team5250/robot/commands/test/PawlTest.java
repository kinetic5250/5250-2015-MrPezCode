package org.usfirst.frc.team5250.robot.commands.test;

import org.usfirst.frc.team5250.robot.OI;
import org.usfirst.frc.team5250.robot.commands.CommandBase;

public class PawlTest extends CommandBase {
	public PawlTest() {
		requires(pawlLeft);
		requires(driveTrain);
	}
	
	protected void execute() {
		System.out.println("PawlTest");
		pawlLeft.set(OI.joystick0.getRawAxis(1));
		pawlRight.set(-1*OI.joystick0.getRawAxis(5));
	}
	protected boolean isFinished() {
		return false;
	}
	
	protected void isInterrupted(){
		end();
	}
}