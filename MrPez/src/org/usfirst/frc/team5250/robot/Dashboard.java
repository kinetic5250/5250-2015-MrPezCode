package org.usfirst.frc.team5250.robot;

import org.usfirst.frc.team5250.robot.RobotMap;
//import org.usfirst.frc.team5250.robot.OI;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class Dashboard {
	public static void read() {
		SmartDashboard.putNumber("Jaguar Bus Voltage", RobotMap.canJaguar21.getBusVoltage());
		SmartDashboard.putNumber("Ultrasonic Voltage", RobotMap.analogInput0.getAverageVoltage());
		SmartDashboard.putNumber("Jaguar21 speed", RobotMap.canJaguar21.get());
		SmartDashboard.putNumber("Jaguar22 speed", RobotMap.canJaguar22.get());
		SmartDashboard.putNumber("Jaguar23 speed", RobotMap.canJaguar23.get());
		SmartDashboard.putNumber("Jaguar24 speed", RobotMap.canJaguar24.get());
		SmartDashboard.putNumber("Jaguar25 speed", RobotMap.canJaguar25.get());
		SmartDashboard.putNumber("Jaguar26 speed", RobotMap.canJaguar26.get());
		SmartDashboard.putNumber("Jaguar27 speed", RobotMap.canJaguar27.get());
		SmartDashboard.putNumber("Talon0 speed", RobotMap.talon0.get());
		SmartDashboard.putNumber("Talon1 speed", RobotMap.talon1.get());
		SmartDashboard.putNumber("Talon2 speed", RobotMap.talon2.get());
		SmartDashboard.putNumber("Jaguar21 voltage", RobotMap.canJaguar21.getOutputVoltage());
		SmartDashboard.putNumber("Jaguar22 voltage", RobotMap.canJaguar22.getOutputVoltage());
		SmartDashboard.putNumber("Jaguar23 voltage", RobotMap.canJaguar23.getOutputVoltage());
		SmartDashboard.putNumber("Jaguar24 voltage", RobotMap.canJaguar24.getOutputVoltage());
		SmartDashboard.putNumber("Jaguar25 position", RobotMap.canJaguar25.getPosition());
		SmartDashboard.putBoolean("DigitalInput0", RobotMap.digitalInput0.get());
		SmartDashboard.putBoolean("DigitalInput1", RobotMap.digitalInput1.get());
		SmartDashboard.putBoolean("DigitalInput2", RobotMap.digitalInput2.get());
		SmartDashboard.putBoolean("DigitalInput3", RobotMap.digitalInput3.get());
		
	}
}