package org.usfirst.frc.team5250.robot.commands.arm;

import org.usfirst.frc.team5250.robot.OI;
import org.usfirst.frc.team5250.robot.commands.CommandBase;

public class ClawCommand extends CommandBase {
	double speed = 0.0;
	
	public ClawCommand(double speed) {
		requires(claw);
		this.speed = speed;
		System.out.println("ClawCommand");
	}
	
	protected void initialize() {
		System.out.println("ClawCommand");
	}
	
	protected void execute() {
		claw.set(speed);
	}
	protected boolean isFinished() {
		return (OI.driverJoystick.getPOV()==-1|OI.driverJoystick.getPOV()==0|OI.driverJoystick.getPOV()==180);
	}
	
	protected void interrupted() {
		end();
	}
	
	protected void end() {
		claw.set(0);
	}
}