package org.usfirst.frc.team5250.robot.subsystems.arm;

import org.usfirst.frc.team5250.robot.RM;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm extends Subsystem {
	public double set(double output) {
		RM.armArmMotor.set(output);
		return output;
	};
	protected void initDefaultCommand() {}
}