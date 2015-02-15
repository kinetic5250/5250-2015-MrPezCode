package org.usfirst.frc.team5250.robot.commands.Pawl;

import org.usfirst.frc.team5250.robot.Constants;
import org.usfirst.frc.team5250.robot.RobotMap;
import org.usfirst.frc.team5250.robot.commands.CommandBase;

public class PawlCloseLeft extends CommandBase {
	boolean finished = false;
	
	public PawlCloseLeft() {
		requires(pawlLeft);
	}
	
	protected void execute() {
		pawlLeft.set(Constants.pawlSpeed);
		
	}
	protected boolean isFinished() {
		return !(RobotMap.digitalInput1.get());
	}
	
	protected void interrupted() {
		end();
	}
	
	protected void end() {
		pawlLeft.set(0);
	}
}