package org.usfirst.frc.team5250.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;

import org.usfirst.frc.team5250.robot.commands.AutoCommand;
import org.usfirst.frc.team5250.robot.commands.DriveCommand;

public class Robot extends IterativeRobot {
    Command autonomousCommand;
    SendableChooser sendableChooser;
    public void robotInit() {
		RobotMap.init();
		OI.init();
		Dashboard.init();
        sendableChooser = new SendableChooser();
        sendableChooser.addDefault("Autocommand", new AutoCommand());
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        if (autonomousCommand != null) autonomousCommand.cancel();
        Scheduler.getInstance().add(new DriveCommand());
    }
    
    public void disabledInit(){
    	
    }

    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        Dashboard.run();
    }
}
