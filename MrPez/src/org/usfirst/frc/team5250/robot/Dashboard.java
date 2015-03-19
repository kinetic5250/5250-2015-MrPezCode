package org.usfirst.frc.team5250.robot;

import org.usfirst.frc.team5250.robot.RM;
import edu.wpi.first.wpilibj.networktables.NetworkTable;

public class Dashboard {
	static NetworkTable networkTable;

	public static void init() {
		networkTable = NetworkTable.getTable("datatable");
	}

	public static void run() {
		networkTable.putNumber("EncoderPos", RM.pezElevatorMotor.getPosition());
	}
}