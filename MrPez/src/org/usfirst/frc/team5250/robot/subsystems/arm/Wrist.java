package org.usfirst.frc.team5250.robot.subsystems.arm;

import org.usfirst.frc.team5250.robot.RM;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Wrist  extends Subsystem {
	public double set(double output) {
		RM.armWristMotor.set(output);
		return output;
	};
	protected void initDefaultCommand() {}
}
