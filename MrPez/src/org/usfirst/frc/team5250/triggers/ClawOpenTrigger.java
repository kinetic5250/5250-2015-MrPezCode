package org.usfirst.frc.team5250.triggers;

import org.usfirst.frc.team5250.robot.OI;

import edu.wpi.first.wpilibj.buttons.Trigger;

public class ClawOpenTrigger extends Trigger {
	public boolean get() {
		return (OI.driverJoystick.getPOV()==45|
				OI.driverJoystick.getPOV()==90|
				OI.driverJoystick.getPOV()==135);
	}
}