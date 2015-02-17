package org.usfirst.frc.team5250.robot.subsystems;

import org.usfirst.frc.team5250.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.CANJaguar;

public class Pez extends Subsystem {
	public static double goalPosition = 0.0;
	
	public Pez() {
		RobotMap.canJaguar25.setPositionMode(CANJaguar.kQuadEncoder, 497, -200, 0, 20);
		RobotMap.canJaguar25.enableControl();
	}
	
	public double setPezPosition(double position) {
		RobotMap.canJaguar25.set(position);
		goalPosition = position;
		return position;
	}
	
    public void initDefaultCommand() {}
}