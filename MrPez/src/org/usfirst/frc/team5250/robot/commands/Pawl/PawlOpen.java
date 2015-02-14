package org.usfirst.frc.team5250.robot.commands.Pawl;

import org.usfirst.frc.team5250.robot.RobotMap;
import org.usfirst.frc.team5250.robot.commands.CommandBase;

public class PawlOpen extends CommandBase {
	boolean finished = false;
	
	protected void execute() {
		if(RobotMap.digitalInput0.get()==true){
			pawl.setLeftPawl(-0.6);
		}
		if(RobotMap.digitalInput2.get()==true) {
			pawl.setRightPawl(0.6);
		}
		if(!RobotMap.digitalInput0.get()&&!RobotMap.digitalInput2.get()) {
			finished = true;
		}
	}
	protected boolean isFinished() {
		return finished;
	}
}