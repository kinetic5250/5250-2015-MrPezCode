package org.usfirst.frc.team5250.triggers;

import org.usfirst.frc.team5250.robot.Constants;
import org.usfirst.frc.team5250.robot.OI;
import org.usfirst.frc.team5250.util.Util;

import edu.wpi.first.wpilibj.buttons.Trigger;

public class PezManualTrigger extends Trigger {
	public boolean get() {
		return (Util.calculateDeadband(
				OI.driverJoystick.getRawAxis(Constants.XBoxAxisType.kRightTrigger)
					-OI.driverJoystick.getRawAxis(Constants.XBoxAxisType.kLeftTrigger),
				Constants.kPezDeadband)!=0.0);
	}
}
