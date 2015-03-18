package org.usfirst.frc.team5250.robot.commands.arm;

import org.usfirst.frc.team5250.robot.commands.CommandBase;

public class WristCommand extends CommandBase {
	double speed = 0.0;
	
	public WristCommand(double speed) {
		this.speed = speed;
	}
	
	protected void initialize() {
		System.out.println("WristCommand");
	}
	
	protected void execute() {
		wrist.set(speed);
	}
	protected boolean isFinished() {
		return false;
	}
	
	protected void interrupted() {
		end();
	}
	
	protected void end() {
		wrist.set(0);
	}
}