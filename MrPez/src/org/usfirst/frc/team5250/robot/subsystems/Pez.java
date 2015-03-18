package org.usfirst.frc.team5250.robot.subsystems;

import org.usfirst.frc.team5250.robot.RobotMap;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team5250.robot.Constants;
public class Pez extends Subsystem {
	double currentPosition;
	
	public void setPez(double position) {
		RobotMap.pezElevator.set(position);
	}
	
	public void setPercentMode() {
		currentPosition = RobotMap.pezElevator.getPosition();
		RobotMap.pezElevator.disableControl();
		RobotMap.pezElevator.setPercentMode();
		RobotMap.pezElevator.enableControl(currentPosition);
	}
	
	public void setPositionMode() {
		currentPosition = RobotMap.pezElevator.getPosition();
		RobotMap.pezElevator.disableControl();
		RobotMap.pezElevator.setPositionMode(CANJaguar.kQuadEncoder, 
				Constants.kPezCodesPerRev, 
				Constants.kPezP, Constants.kPezI, Constants.kPezD);
		RobotMap.pezElevator.enableControl(currentPosition);
	}
	
	protected void initDefaultCommand() {}
}