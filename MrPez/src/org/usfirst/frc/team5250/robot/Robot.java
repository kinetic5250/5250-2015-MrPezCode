package org.usfirst.frc.team5250.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;

import org.usfirst.frc.team5250.robot.commands.AutoCommand;

public class Robot extends IterativeRobot {
	Command autonomousCommand;
	public void robotInit() {
		try {
			RM.init();
			OI.init();
			Dashboard.init();
	    } catch (Exception ex){
	        ex.printStackTrace();;
	    }
	}

	public void autonomousInit() {
		Scheduler.getInstance().add(new AutoCommand());
	}
	
	public void teleopInit() {
		if (autonomousCommand != null) autonomousCommand.cancel();
	}

	public void disabledInit() {}
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}
}