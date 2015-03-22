package org.usfirst.frc.team5250.robot.commands.pawl;

import org.usfirst.frc.team5250.robot.commands.CommandBase;

public class LeftPawlManual extends CommandBase {
	double output;
	public LeftPawlManual(double output) {
		requires(pawlLeft);
		this.output=output;
		System.out.println("LeftPawlManualCommand");
	}
	
	protected void execute() {
		pawlLeft.set(output);
	}
	
	protected boolean isFinished() {
		return false;
	}
	
	protected void interrupted() {
		end();
	}
	
	protected void end() {
		pawlLeft.set(0);
	}
}