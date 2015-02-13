package org.usfirst.frc.team5250.robot.subsystems;

//import org.usfirst.frc.team5250.robot.OI;
import org.usfirst.frc.team5250.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {
	public void ArcadeDrive(double move, double turn) {
		RobotMap.robotDrive.arcadeDrive(move, turn);
	}
	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

