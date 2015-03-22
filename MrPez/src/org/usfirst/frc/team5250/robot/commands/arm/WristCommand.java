package org.usfirst.frc.team5250.robot.commands.arm;

import org.usfirst.frc.team5250.robot.OI;
import org.usfirst.frc.team5250.robot.commands.CommandBase;

public class WristCommand extends CommandBase {
	double speed = 0.0;
	
	public WristCommand(double speed) {
		requires(wrist);
		this.speed = speed;
		System.out.println("WristCommand");
	}
	
	protected void initialize() {
		System.out.println("WristCommand");
	}
	
	protected void execute() {
		wrist.set(speed);
	}
	protected boolean isFinished() {
		return (OI.driverJoystick.getPOV()==-1|OI.driverJoystick.getPOV()==90|OI.driverJoystick.getPOV()==270);
	}
	
	protected void interrupted() {
		end();
	}
	
	protected void end() {
		wrist.set(0);
	}
}