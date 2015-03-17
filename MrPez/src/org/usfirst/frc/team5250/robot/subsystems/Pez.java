package org.usfirst.frc.team5250.robot.subsystems;

import org.usfirst.frc.team5250.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Pez extends Subsystem {
	public void setPez(double position) {
		RobotMap.canJaguar25.set(position);
	}

	protected void initDefaultCommand() {}
}