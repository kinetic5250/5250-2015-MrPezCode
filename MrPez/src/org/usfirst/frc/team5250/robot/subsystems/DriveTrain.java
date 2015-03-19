package org.usfirst.frc.team5250.robot.subsystems;

import org.usfirst.frc.team5250.robot.RM;
import org.usfirst.frc.team5250.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {
	public void arcadeDrive(double move, double rotate) {
		RM.robotDrive.arcadeDrive(move,rotate);
	}
	
	public void tankDrive(double left, double right) {
		RM.robotDrive.tankDrive(left,right);
	}
	
    public void initDefaultCommand() {
    	setDefaultCommand(new DriveCommand());
    }
}

