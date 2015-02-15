package org.usfirst.frc.team5250.robot;

import org.usfirst.frc.team5250.robot.RobotMap;
import org.usfirst.frc.team5250.robot.OI;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class Dashboard {
	public static void read() {
		SmartDashboard.putNumber("Jaguar21 speed", RobotMap.canJaguar21.get());
		SmartDashboard.putNumber("Jaguar22 speed", RobotMap.canJaguar22.get());
		SmartDashboard.putNumber("Jaguar23 speed", RobotMap.canJaguar23.get());
		SmartDashboard.putNumber("Jaguar24 speed", RobotMap.canJaguar24.get());
		SmartDashboard.putNumber("Jaguar25 speed", RobotMap.canJaguar25.get());
		SmartDashboard.putNumber("Jaguar26 speed", RobotMap.canJaguar26.get());
		SmartDashboard.putNumber("Jaguar27 speed", RobotMap.canJaguar27.get());
		
	}
}