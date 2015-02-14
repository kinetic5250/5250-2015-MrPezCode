package org.usfirst.frc.team5250.robot.commands.Pawl;

import org.usfirst.frc.team5250.robot.RobotMap;
import org.usfirst.frc.team5250.robot.commands.CommandBase;

public class PawlClose extends CommandBase {
	boolean finished = false;
	
	protected void execute() {
		if(RobotMap.digitalInput1.get()==true){
			pawl.setLeftPawl(0.6);
		}
		if(RobotMap.digitalInput3.get()==true) {
			pawl.setRightPawl(-0.6);
		}
		if(!RobotMap.digitalInput1.get()&&!RobotMap.digitalInput3.get()) {
			finished = true;
		}
	}
	protected boolean isFinished() {
		return finished;
	}
}