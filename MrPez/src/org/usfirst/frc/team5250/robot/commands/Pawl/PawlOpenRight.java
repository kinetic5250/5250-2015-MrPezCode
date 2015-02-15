package org.usfirst.frc.team5250.robot.commands.pawl;

import org.usfirst.frc.team5250.robot.RobotMap;
import org.usfirst.frc.team5250.robot.commands.CommandBase;
import org.usfirst.frc.team5250.robot.Constants;

public class PawlOpenRight extends CommandBase {
	boolean finished = false;
	
	public PawlOpenRight() {
		requires(pawlRight);
	}
	
	protected void execute() {
		pawlRight.set(Constants.pawlSpeed);
	}
	protected boolean isFinished() {
		return !(RobotMap.digitalInput2.get());
	}
	
	protected void interrupted() {
		end();
	}
	
	protected void end() {
		pawlRight.set(0);
	}
}