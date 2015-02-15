package org.usfirst.frc.team5250.robot.subsystems.Pawl;

import org.usfirst.frc.team5250.robot.RobotMap;
//import org.usfirst.frc.team5250.robot.commands.PawlTest;

import edu.wpi.first.wpilibj.command.Subsystem;

public class PawlRight extends Subsystem {
	
	public double set(double output) {
		RobotMap.talon1.set(output);
		return output;
	}
	
	protected void initDefaultCommand() {
		//setDefaultCommand(new PawlTest());
	}
}