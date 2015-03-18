package org.usfirst.frc.team5250.robot.commands.pawl;

import org.usfirst.frc.team5250.robot.RobotMap;
import org.usfirst.frc.team5250.robot.commands.CommandBase;
import org.usfirst.frc.team5250.robot.Constants;

public class PawlOpenRightCommand extends CommandBase {
	boolean finished = false;
	
	public PawlOpenRightCommand() {
		requires(pawlRight);
	}
	
	protected void execute() {
		pawlRight.set(Constants.pawlSpeed);
	}
	protected boolean isFinished() {
		return !(RobotMap.pawlRightOpenLimit.get());
	}
	
	protected void interrupted() {
		end();
	}
	
	protected void end() {
		pawlRight.set(0);
	}
}