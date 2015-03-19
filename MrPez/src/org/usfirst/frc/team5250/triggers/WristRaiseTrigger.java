package org.usfirst.frc.team5250.triggers;

import org.usfirst.frc.team5250.robot.OI;

import edu.wpi.first.wpilibj.buttons.Trigger;

public class WristRaiseTrigger extends Trigger {
	public boolean get() {
		return (OI.driverJoystick.getPOV()==315|
				OI.driverJoystick.getPOV()==0|
				OI.driverJoystick.getPOV()==45);
	}
}