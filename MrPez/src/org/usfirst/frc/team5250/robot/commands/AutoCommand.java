package org.usfirst.frc.team5250.robot.commands;

import edu.wpi.first.wpilibj.Timer;

public class AutoCommand extends CommandBase {
	public AutoCommand() {
		requires(driveTrain);
		System.out.println("AutoCommand");
	}
	
	public void execute() {
		driveTrain.arcadeDrive(0.6, 0);
		Timer.delay(2.5);
		driveTrain.arcadeDrive(0, 0);
		end();
	}
	
	public boolean isFinished() {
		return true;
	}
	
	public void interrupted() {
		end();
	}
}