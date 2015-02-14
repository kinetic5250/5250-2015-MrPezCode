package org.usfirst.frc.team5250.robot.subsystems;


import org.usfirst.frc.team5250.robot.RobotMap;
import org.usfirst.frc.team5250.robot.commands.PezDefault;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.CANJaguar;

public class Pez extends Subsystem {
	public Pez() {
		RobotMap.canJaguar5.setPositionMode(CANJaguar.kQuadEncoder, 360, 10.0, 0.4, 0.2);
		RobotMap.canJaguar5.enableControl();
	}
	
	public double zeroPezPosition() {
		RobotMap.canJaguar5.set(0);
		return 0.0;
	}
	
	public double setPezPosition(double position) {
		RobotMap.canJaguar5.set(position);
		return position;
	}
	
	public double getPezPosition() {
		return RobotMap.canJaguar5.getPosition();
	}
	
	
    public void initDefaultCommand() {
    	setDefaultCommand(new PezDefault());
    }
}