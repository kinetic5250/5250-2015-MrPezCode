package org.usfirst.frc.team5250.robot.subsystems.pawl;

import org.usfirst.frc.team5250.robot.RM;

import edu.wpi.first.wpilibj.command.Subsystem;

public class PawlLeft extends Subsystem {
	
	public double set(double output) {
		RM.pawlLeftMotor.set(output);
		return output;
	}
	
	protected void initDefaultCommand() {}
}