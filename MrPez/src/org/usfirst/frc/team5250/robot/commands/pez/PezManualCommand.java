package org.usfirst.frc.team5250.robot.commands.pez;

import org.usfirst.frc.team5250.robot.Constants;
import org.usfirst.frc.team5250.robot.OI;
import org.usfirst.frc.team5250.robot.commands.CommandBase;
import org.usfirst.frc.team5250.util.Util;

public class PezManualCommand extends CommandBase {
	public PezManualCommand() {
		requires(pez);
		System.out.println("PezManualCommand");
	}

	protected void initialize() {
		pez.setPercentMode();
	}

	protected void execute() {
		pez.set(Util.trim(
		OI.driverJoystick.getRawAxis(Constants.XBoxAxisType.RightTrigger) 
		- OI.driverJoystick.getRawAxis(Constants.XBoxAxisType.LeftTrigger),
		-1.0, 1.0)*-1);
	}

	protected boolean isFinished() {
		return false;
	}
	
	protected void end() {}
	
	protected void interrupted() {
		end();
	}
}