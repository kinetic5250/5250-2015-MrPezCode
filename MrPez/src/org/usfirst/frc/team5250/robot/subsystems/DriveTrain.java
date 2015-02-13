package org.usfirst.frc.team5250.robot.subsystems;

import org.usfirst.frc.team5250.robot.OI;
import org.usfirst.frc.team5250.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.RobotDrive;

public class DriveTrain extends Subsystem {
	
	public void ArcadeDrive() {
		RobotMap.getRobotDrive().arcadeDrive(0,0);
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

