package org.usfirst.frc.team5250.robot.commands.arm;

import org.usfirst.frc.team5250.robot.commands.CommandBase;

public class ArmCommand extends CommandBase {
	double speed = 0.0;
	
	public ArmCommand(double speed) {
		this.speed = speed;
	}
	
	protected void execute() {
		arm.set(speed);
	}
	protected boolean isFinished() {
		return false;
	}
	
	protected void interrupted() {
		end();
	}
	
	protected void end() {
		arm.set(0);
	}
}