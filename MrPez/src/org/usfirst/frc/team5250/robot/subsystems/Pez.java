package org.usfirst.frc.team5250.robot.subsystems;

import org.usfirst.frc.team5250.robot.RM;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team5250.robot.Constants;
public class Pez extends Subsystem {
	double currentPosition;
	
	public void setPez(double position) {
		RM.pezElevatorMotor.set(position);
	}
	
	public void setPercentMode() {
		currentPosition = RM.pezElevatorMotor.getPosition();
		RM.pezElevatorMotor.disableControl();
		RM.pezElevatorMotor.setPercentMode();
		RM.pezElevatorMotor.enableControl(currentPosition);
	}
	
	public void setPositionMode() {
		currentPosition = RM.pezElevatorMotor.getPosition();
		RM.pezElevatorMotor.disableControl();
		RM.pezElevatorMotor.setPositionMode(CANJaguar.kQuadEncoder, 
				Constants.kPezCodesPerRev, 
				Constants.kPezP, Constants.kPezI, Constants.kPezD);
		RM.pezElevatorMotor.enableControl(currentPosition);
	}
	
	protected void initDefaultCommand() {}
}