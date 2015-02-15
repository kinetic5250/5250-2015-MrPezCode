package org.usfirst.frc.team5250.robot.commands.Pawl;

import org.usfirst.frc.team5250.robot.RobotMap;
import org.usfirst.frc.team5250.robot.commands.CommandBase;
import org.usfirst.frc.team5250.robot.Constants;

public class PawlOpenLeft extends CommandBase {
	boolean finished = false;
	
	public PawlOpenLeft() {
		requires(pawlLeft);
	}
	
	protected void execute() {
		pawlLeft.set(-1*Constants.pawlSpeed);	
	}
	protected boolean isFinished() {
		return !(RobotMap.digitalInput0.get());
	}
	
	protected void interrupted() {
		end();
	}
	
	protected void end() {
		pawlLeft.set(0);
	}
}