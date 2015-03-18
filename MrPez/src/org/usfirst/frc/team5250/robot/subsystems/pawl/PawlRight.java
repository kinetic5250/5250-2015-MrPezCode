package org.usfirst.frc.team5250.robot.subsystems.pawl;

import org.usfirst.frc.team5250.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

public class PawlRight extends Subsystem {
	
	public double set(double output) {
		RobotMap.pawlRightMotor.set(output);
		return output;
	}
	
	protected void initDefaultCommand() {}
}