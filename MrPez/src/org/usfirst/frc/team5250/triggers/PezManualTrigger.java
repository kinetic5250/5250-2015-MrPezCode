package org.usfirst.frc.team5250.triggers;

import org.usfirst.frc.team5250.robot.Constants;
import org.usfirst.frc.team5250.robot.OI;
import org.usfirst.frc.team5250.util.Util;

import edu.wpi.first.wpilibj.buttons.Trigger;

public class PezManualTrigger extends Trigger {
	public boolean get() {
		return (Util.calculateDeadband(
				OI.driverJoystick.getRawAxis(Constants.XBoxAxisType.RightTrigger)
					-OI.driverJoystick.getRawAxis(Constants.XBoxAxisType.LeftTrigger),
				Constants.PezDeadband)!=0.0);
	}
}
