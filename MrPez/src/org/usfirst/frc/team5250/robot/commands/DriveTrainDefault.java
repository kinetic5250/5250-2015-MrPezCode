package org.usfirst.frc.team5250.robot.commands;

import org.usfirst.frc.team5250.robot.OI;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DriveTrainDefault extends CommandBase {
	
	public DriveTrainDefault() {
		requires(driveTrain);
	}
	
	protected void execute() {
		driveTrain.arcadeDrive(OI.joystick0.getRawAxis(1),OI.joystick0.getRawAxis(4));
		SmartDashboard.putNumber("move", OI.joystick0.getRawAxis(1));
		SmartDashboard.putNumber("turn", OI.joystick0.getRawAxis(4));
	}
	
	protected boolean isFinished() {
		return false;
	}
}