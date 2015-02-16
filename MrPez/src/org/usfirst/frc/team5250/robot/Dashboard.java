package org.usfirst.frc.team5250.robot;

import org.usfirst.frc.team5250.robot.RobotMap;
//import org.usfirst.frc.team5250.robot.OI;

import edu.wpi.first.wpilibj.networktables.NetworkTable;

	
public class Dashboard {
	static NetworkTable networkTable;
	
	public static void init() {
		networkTable = NetworkTable.getTable("datatable");
	}
	
	public static void read() {
		networkTable.putNumber("jaguar21Speed", RobotMap.canJaguar21.get());
		networkTable.putNumber("jaguar22Speed", RobotMap.canJaguar22.get());
		networkTable.putNumber("jaguar23Speed", RobotMap.canJaguar23.get());
		networkTable.putNumber("jaguar24Speed", RobotMap.canJaguar24.get());
		networkTable.putNumber("jaguar25Speed", RobotMap.canJaguar25.get());
		networkTable.putNumber("jaguar26Speed", RobotMap.canJaguar26.get());
		networkTable.putNumber("jaguar27Speed", RobotMap.canJaguar27.get());
		networkTable.putNumber("talon0Speed", RobotMap.talon0.get());
		networkTable.putNumber("talon1Speed", RobotMap.talon1.get());
		networkTable.putNumber("talon2Speed", RobotMap.talon2.get());
		networkTable.putNumber("jaguar21Voltage", RobotMap.canJaguar21.getOutputVoltage());
		networkTable.putNumber("jaguar22Voltage", RobotMap.canJaguar22.getOutputVoltage());
		networkTable.putNumber("jaguar23Voltage", RobotMap.canJaguar23.getOutputVoltage());
		networkTable.putNumber("jaguar24Voltage", RobotMap.canJaguar24.getOutputVoltage());
		networkTable.putNumber("jaguar25Position", RobotMap.canJaguar25.getPosition());
		networkTable.putBoolean("digitalInput0", RobotMap.digitalInput0.get());
		networkTable.putBoolean("digitalInput1", RobotMap.digitalInput1.get());
		networkTable.putBoolean("digitalInput2", RobotMap.digitalInput2.get());
		networkTable.putBoolean("digitalInput3", RobotMap.digitalInput3.get());
		networkTable.putNumber("analogInput0", RobotMap.analogInput0.getAverageVoltage());
	}
}