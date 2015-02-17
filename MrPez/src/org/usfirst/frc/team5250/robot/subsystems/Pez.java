package org.usfirst.frc.team5250.robot.subsystems;

import org.usfirst.frc.team5250.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.CANJaguar;
import org.usfirst.frc.team5250.robot.commands.PezDefault;

public class Pez extends Subsystem {
	public static double goal = 0.0;
	
	public Pez() {
	}
	
	public void setPezPercentMode() {
		//RobotMap.canJaguar25.setPercentMode();
	}
	
	public void setPezPositionMode() {
		//RobotMap.canJaguar25.setPositionMode(CANJaguar.kQuadEncoder, 497, -200, 0, 20);
		//canJaguar25.setPositionMode(tag, codesPerRev, p, i, d);
	}
	
	public void enablePezPositionMode() {
		//RobotMap.canJaguar25.enableControl();
	}
	
	public void setPez(double position) {
		RobotMap.canJaguar25.set(position);
	}

    public void initDefaultCommand() {
    	setDefaultCommand(new PezDefault());
    }
}