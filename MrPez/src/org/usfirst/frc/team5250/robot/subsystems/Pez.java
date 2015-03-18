package org.usfirst.frc.team5250.robot.subsystems;

import org.usfirst.frc.team5250.robot.RobotMap;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team5250.robot.Constants;
public class Pez extends Subsystem {
	double currentPosition;
	
	public void setPez(double position) {
		RobotMap.pezElevatorMotor.set(position);
	}
	
	public void setPercentMode() {
		currentPosition = RobotMap.pezElevatorMotor.getPosition();
		RobotMap.pezElevatorMotor.disableControl();
		RobotMap.pezElevatorMotor.setPercentMode();
		RobotMap.pezElevatorMotor.enableControl(currentPosition);
	}
	
	public void setPositionMode() {
		currentPosition = RobotMap.pezElevatorMotor.getPosition();
		RobotMap.pezElevatorMotor.disableControl();
		RobotMap.pezElevatorMotor.setPositionMode(CANJaguar.kQuadEncoder, 
				Constants.kPezCodesPerRev, 
				Constants.kPezP, Constants.kPezI, Constants.kPezD);
		RobotMap.pezElevatorMotor.enableControl(currentPosition);
	}
	
	protected void initDefaultCommand() {}
}