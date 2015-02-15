package org.usfirst.frc.team5250.robot.commands.pawl;

import org.usfirst.frc.team5250.robot.Constants;
import org.usfirst.frc.team5250.robot.RobotMap;
import org.usfirst.frc.team5250.robot.commands.CommandBase;

public class PawlCloseRight extends CommandBase {
	boolean finished = false;
	
	public PawlCloseRight() {
		requires(pawlRight);
	}
	
	protected void execute() {
		pawlRight.set(-1*Constants.pawlSpeed);
	}
	protected boolean isFinished() {
		return !(RobotMap.digitalInput3.get());
	}
	
	protected void interrupted() {
		end();
	}
	
	protected void end() {
		pawlRight.set(0);
	}
}