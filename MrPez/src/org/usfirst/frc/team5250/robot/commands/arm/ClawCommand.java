package org.usfirst.frc.team5250.robot.commands.arm;

import org.usfirst.frc.team5250.robot.commands.CommandBase;

public class ClawCommand extends CommandBase {
	double speed = 0.0;
	
	public ClawCommand(double speed) {
		this.speed = speed;
	}
	
	protected void initialize() {
		System.out.println("ClawCommand");
	}
	
	protected void execute() {
		claw.set(speed);
	}
	protected boolean isFinished() {
		return false;
	}
	
	protected void interrupted() {
		end();
	}
	
	protected void end() {
		claw.set(0);
	}
}