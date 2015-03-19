package org.usfirst.frc.team5250.triggers;

import org.usfirst.frc.team5250.robot.OI;

import edu.wpi.first.wpilibj.buttons.Trigger;

public class ClawCloseTrigger extends Trigger {
	public boolean get() {
		return (OI.driverJoystick.getPOV()==225|
				OI.driverJoystick.getPOV()==270|
				OI.driverJoystick.getPOV()==315);
	}
}