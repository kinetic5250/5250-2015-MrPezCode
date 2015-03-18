package org.usfirst.frc.team5250.robot.commands;

import edu.wpi.first.wpilibj.Timer;

public class AutoCommand extends CommandBase {
	public AutoCommand() {
		requires(driveTrain);
	}
	
	public void initialize() {
		System.out.println("AutoCommand");
	}
	
	public void execute() {
		driveTrain.tankDrive(0.5, 0.5);
		Timer.delay(5);
		driveTrain.tankDrive(0, 0);
	}
	
	public boolean isFinished() {
		return true;
	}
}