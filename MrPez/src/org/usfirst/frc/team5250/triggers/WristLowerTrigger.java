package org.usfirst.frc.team5250.triggers;

import org.usfirst.frc.team5250.robot.OI;

import edu.wpi.first.wpilibj.buttons.Trigger;

public class WristLowerTrigger extends Trigger {
	public boolean get() {
		return (OI.driverJoystick.getPOV()==135|
				OI.driverJoystick.getPOV()==180|
				OI.driverJoystick.getPOV()==225);
	}
}