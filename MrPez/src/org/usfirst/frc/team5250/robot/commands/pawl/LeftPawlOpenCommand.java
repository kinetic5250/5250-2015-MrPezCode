package org.usfirst.frc.team5250.robot.commands.pawl;

import org.usfirst.frc.team5250.robot.RM;
import org.usfirst.frc.team5250.robot.commands.CommandBase;
import org.usfirst.frc.team5250.robot.Constants;

public class LeftPawlOpenCommand extends CommandBase {
	public LeftPawlOpenCommand() {
		requires(pawlLeft);
		System.out.println("LeftPawlOpenCommand");
	}
	
	protected void execute() {
		pawlLeft.set(Constants.pawlSpeed*Constants.counterClockWise);
	}
	
	protected boolean isFinished() {
		return !(RM.pawlLeftOpenLimit.get());
	}
	
	protected void interrupted() {
		end();
	}
	
	protected void end() {
		pawlLeft.set(0);
	}
}