package org.usfirst.frc.team5250.robot.commands.Pawl;

import org.usfirst.frc.team5250.robot.RobotMap;
import org.usfirst.frc.team5250.robot.commands.CommandBase;
import org.usfirst.frc.team5250.robot.Constants;

public class PawlOpenLeft extends CommandBase {
	boolean finished = false;
	
	public PawlOpenLeft() {
		requires(pawlLeft);
	}
	
	protected void execute() {
		System.out.println("PawlOpenLeft");
		while(RobotMap.digitalInput0.get()==true) {
			pawlLeft.set(-1*Constants.pawlSpeed);
		}
			pawlLeft.set(0);
			finished = true;	
	}
	protected boolean isFinished() {
		return finished;
	}
	
	protected void interrupted() {
		end();
	}
}