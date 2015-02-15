package org.usfirst.frc.team5250.robot.commands.Pawl;

import org.usfirst.frc.team5250.robot.Constants;
import org.usfirst.frc.team5250.robot.RobotMap;
import org.usfirst.frc.team5250.robot.commands.CommandBase;

public class PawlCloseRight extends CommandBase {
	boolean finished = false;
	
	public PawlCloseRight() {
		requires(pawlRight);
	}
	
	protected void execute() {
		System.out.println("PawlCloseRight");
		while(RobotMap.digitalInput3.get()==true) {
			pawlRight.set(-1*Constants.pawlSpeed);
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