package org.usfirst.frc.team5250.triggers;

import org.usfirst.frc.team5250.robot.Constants;
import org.usfirst.frc.team5250.robot.OI;
import org.usfirst.frc.team5250.util.Util;

import edu.wpi.first.wpilibj.buttons.Trigger;

public class ArmManualTrigger extends Trigger {
	public boolean get() {
		return Util.calculateDeadband(
			OI.driverJoystick.getRawAxis(Constants.XBoxAxisType.RightY),
			Constants.armDeadband)!=0.0;
	}
}