package org.usfirst.frc.team5250.robot.commands.arm;

import org.usfirst.frc.team5250.robot.Constants;
import org.usfirst.frc.team5250.robot.OI;
import org.usfirst.frc.team5250.robot.commands.CommandBase;
import org.usfirst.frc.team5250.util.Util;

public class ArmManualCommand extends CommandBase {
	public ArmManualCommand() {
		requires(arm);
		System.out.println("ArmManualCommand");
	}

	protected void initialize() {}

	protected void execute() {
		arm.set(Util.calculateDeadband(
				OI.driverJoystick.getRawAxis(Constants.XBoxAxisType.RightY), 
				Constants.armDeadband));
	}

	protected boolean isFinished() {
		return false;
	}
	
	protected void end() {}
	
	protected void interrupted() {
		end();
	}
}