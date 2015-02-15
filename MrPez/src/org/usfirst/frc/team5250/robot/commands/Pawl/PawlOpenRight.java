package org.usfirst.frc.team5250.robot.commands.Pawl;

import org.usfirst.frc.team5250.robot.RobotMap;
import org.usfirst.frc.team5250.robot.commands.CommandBase;
import org.usfirst.frc.team5250.robot.Constants;

public class PawlOpenRight extends CommandBase {
	boolean finished = false;
	
	public PawlOpenRight() {
		requires(pawl);
	}
	
	protected void execute() {
		System.out.println("PawlOpen");
		while(RobotMap.digitalInput2.get()==true) {
			pawl.setRightPawl(Constants.pawlSpeed);
		}
		pawl.setRightPawl(0);
			finished = true;	
	}
	protected boolean isFinished() {
		return finished;
	}
	
	protected void interrupted() {
		end();
	}
}