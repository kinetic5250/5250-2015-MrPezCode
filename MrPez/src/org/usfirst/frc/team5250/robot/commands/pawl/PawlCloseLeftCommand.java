package org.usfirst.frc.team5250.robot.commands.pawl;

import org.usfirst.frc.team5250.robot.Constants;
import org.usfirst.frc.team5250.robot.RM;
import org.usfirst.frc.team5250.robot.commands.CommandBase;

public class PawlCloseLeftCommand extends CommandBase {
	public PawlCloseLeftCommand() {
		requires(pawlLeft);
	}
	
	protected void execute() {
		pawlLeft.set(Constants.pawlSpeed*Constants.clockWise);
		
	}
	protected boolean isFinished() {
		return !(RM.pawlLeftCloseLimit.get());
	}
	
	protected void interrupted() {
		end();
	}
	
	protected void end() {
		pawlLeft.set(0);
	}
}