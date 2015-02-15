package org.usfirst.frc.team5250.robot.subsystems;


import org.usfirst.frc.team5250.robot.RobotMap;
import org.usfirst.frc.team5250.robot.commands.PezTest;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.CANJaguar;

public class Pez extends Subsystem {
	double currentPosition = 0.0;
	
	public Pez() {
		RobotMap.canJaguar25.setPositionMode(CANJaguar.kQuadEncoder, 1, 10.0, 0, 0);
		RobotMap.canJaguar25.enableControl();
	}
	
	public double zeroPezPosition() {
		RobotMap.canJaguar25.set(0);
		return 0.0;
	}
	
	public double setPezPosition(double position) {
		RobotMap.canJaguar25.set(position);
		return position;
	}
	
	public double getPezPosition() {
		currentPosition = RobotMap.canJaguar25.getPosition();
		return currentPosition;
	}
	
	
    public void initDefaultCommand() {
    	setDefaultCommand(new PezTest());
    }
}