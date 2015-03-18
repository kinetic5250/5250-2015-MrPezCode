package org.usfirst.frc.team5250.robot.commands.pawl;

import org.usfirst.frc.team5250.robot.Constants;
import org.usfirst.frc.team5250.robot.RobotMap;
import org.usfirst.frc.team5250.robot.commands.CommandBase;

public class PawlCloseLeftCommand extends CommandBase {
	boolean finished = false;
	
	public PawlCloseLeftCommand() {
		requires(pawlLeft);
	}
	
	protected void execute() {
		pawlLeft.set(Constants.pawlSpeed);
		
	}
	protected boolean isFinished() {
		return !(RobotMap.pawlLeftCloseLimit.get());
	}
	
	protected void interrupted() {
		end();
	}
	
	protected void end() {
		pawlLeft.set(0);
	}
}