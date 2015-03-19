package org.usfirst.frc.team5250.robot.commands.pawl;

import org.usfirst.frc.team5250.robot.Constants;
import org.usfirst.frc.team5250.robot.RM;
import org.usfirst.frc.team5250.robot.commands.CommandBase;

public class PawlCloseRightCommand extends CommandBase {
	public PawlCloseRightCommand() {
		requires(pawlRight);
	}
	
	protected void execute() {
		pawlRight.set(Constants.pawlSpeed*Constants.counterClockWise);
	}
	protected boolean isFinished() {
		return !(RM.pawlRightCloseLimit.get());
	}
	
	protected void interrupted() {
		end();
	}
	
	protected void end() {
		pawlRight.set(0);
	}
}