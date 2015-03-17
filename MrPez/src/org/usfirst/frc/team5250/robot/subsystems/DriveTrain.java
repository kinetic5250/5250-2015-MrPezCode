package org.usfirst.frc.team5250.robot.subsystems;

import org.usfirst.frc.team5250.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {
	public void arcadeDrive(double move, double rotate) {
		RobotMap.robotDrive.arcadeDrive(move,rotate);
	}
	
	public void tankDrive(double left, double right) {
		RobotMap.robotDrive.tankDrive(left,right);
	}
	
    public void initDefaultCommand() {}
}

