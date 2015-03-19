package org.usfirst.frc.team5250.robot.subsystems.arm;

import org.usfirst.frc.team5250.robot.RM;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Claw extends Subsystem {
	public double set(double output) {
		RM.armClawMotor.set(output);
		return output;
	};
	protected void initDefaultCommand() {}
}