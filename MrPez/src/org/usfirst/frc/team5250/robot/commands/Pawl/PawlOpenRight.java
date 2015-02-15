package org.usfirst.frc.team5250.robot.commands.Pawl;

import org.usfirst.frc.team5250.robot.RobotMap;
import org.usfirst.frc.team5250.robot.commands.CommandBase;
import org.usfirst.frc.team5250.robot.Constants;

public class PawlOpenRight extends CommandBase {
	boolean finished = false;
	
	public PawlOpenRight() {
		requires(pawlRight);
	}
	
	protected void execute() {
		System.out.println("PawlOpenRight");
		while(RobotMap.digitalInput2.get()==true) {
			pawlRight.set(Constants.pawlSpeed);
		}
		pawlRight.set(0);
			finished = true;	
	}
	protected boolean isFinished() {
		return finished;
	}
	
	protected void interrupted() {
		end();
	}
}