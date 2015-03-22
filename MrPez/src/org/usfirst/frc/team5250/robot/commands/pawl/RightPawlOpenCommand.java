package org.usfirst.frc.team5250.robot.commands.pawl;

import org.usfirst.frc.team5250.robot.RM;
import org.usfirst.frc.team5250.robot.commands.CommandBase;
import org.usfirst.frc.team5250.robot.Constants;

public class RightPawlOpenCommand extends CommandBase {
	public RightPawlOpenCommand() {
		requires(pawlRight);
		System.out.println("RightPawlOpenCommand");
	}
	
	protected void execute() {
		pawlRight.set(Constants.pawlSpeed*Constants.clockWise);
	}
	protected boolean isFinished() {
		return !(RM.pawlRightOpenLimit.get());
	}
	
	protected void interrupted() {
		end();
	}
	
	protected void end() {
		pawlRight.set(0);
	}
}