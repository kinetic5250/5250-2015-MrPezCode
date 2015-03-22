package org.usfirst.frc.team5250.robot.commands.pawl;

import org.usfirst.frc.team5250.robot.commands.CommandBase;

public class RightPawlManual extends CommandBase {
	double output;
	public RightPawlManual(double output) {
		requires(pawlRight);
		this.output=output;
		System.out.println("RightPawlManual");
	}
	
	protected void execute() {
		pawlRight.set(output);
	}
	
	protected boolean isFinished() {
		return false;
	}
	
	protected void interrupted() {
		end();
	}
	
	protected void end() {
		pawlRight.set(0);
	}
}