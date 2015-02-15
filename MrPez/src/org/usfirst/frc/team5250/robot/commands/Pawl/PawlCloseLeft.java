package org.usfirst.frc.team5250.robot.commands.Pawl;

import org.usfirst.frc.team5250.robot.Constants;
import org.usfirst.frc.team5250.robot.RobotMap;
import org.usfirst.frc.team5250.robot.commands.CommandBase;

public class PawlCloseLeft extends CommandBase {
	boolean finished = false;
	
	public PawlCloseLeft() {
		requires(pawlLeft);
	}
	
	protected void execute() {
		System.out.println("PawlCloseLeft");
		while(RobotMap.digitalInput1.get()==true) {
			pawlLeft.set(Constants.pawlSpeed);
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