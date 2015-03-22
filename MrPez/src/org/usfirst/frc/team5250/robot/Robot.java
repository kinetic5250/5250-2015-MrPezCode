package org.usfirst.frc.team5250.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;

import org.usfirst.frc.team5250.robot.commands.AutoCommand;
import org.usfirst.frc.team5250.robot.commands.FastDriveCommand;

public class Robot extends IterativeRobot {
	Command autonomousCommand;
	public void robotInit() {
		RM.init();
	    OI.init();
		Dashboard.init();
	}

	public void autonomousInit() {
		Scheduler.getInstance().add(new AutoCommand());
	}
	
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}
	
	public void teleopInit() {
		Scheduler.getInstance().add(new FastDriveCommand());
	}
	
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	public void disabledInit() {}
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}
}