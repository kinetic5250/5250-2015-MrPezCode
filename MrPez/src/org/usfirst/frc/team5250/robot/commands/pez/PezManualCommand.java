package org.usfirst.frc.team5250.robot.commands.pez;

import org.usfirst.frc.team5250.robot.Constants;
import org.usfirst.frc.team5250.robot.OI;
import org.usfirst.frc.team5250.robot.commands.CommandBase;
import org.usfirst.frc.team5250.util.Util;

public class PezManualCommand extends CommandBase {
	public PezManualCommand() {
		requires(pez);
	}

	protected void initialize() {
		pez.setPercentMode();
	}

	protected void execute() {
		pez.setPez(Util.trim(
		OI.driverJoystick.getRawAxis(Constants.XBoxAxisType.kRightTrigger) 
		- OI.driverJoystick.getRawAxis(Constants.XBoxAxisType.kLeftTrigger),
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