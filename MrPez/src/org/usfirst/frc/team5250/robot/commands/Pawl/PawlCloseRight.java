package org.usfirst.frc.team5250.robot.commands.Pawl;

import org.usfirst.frc.team5250.robot.Constants;
import org.usfirst.frc.team5250.robot.RobotMap;
import org.usfirst.frc.team5250.robot.commands.CommandBase;

public class PawlCloseRight extends CommandBase {
	boolean finished = false;
	
	public PawlCloseRight() {
		requires(pawl);
	}
	
	protected void execute() {
		System.out.println("PawlClose");
		while(RobotMap.digitalInput3.get()==true) {
			pawl.setRightPawl(-1*Constants.pawlSpeed);
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