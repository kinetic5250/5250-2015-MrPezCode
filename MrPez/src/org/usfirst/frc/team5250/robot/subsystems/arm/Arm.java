package org.usfirst.frc.team5250.robot.subsystems.arm;

import org.usfirst.frc.team5250.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm extends Subsystem {
	public double set(double output) {
		RobotMap.armArmMotor.set(output);
		return output;
	};
	protected void initDefaultCommand() {}
}