package org.usfirst.frc.team5250.robot.subsystems;

import org.usfirst.frc.team5250.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team5250.robot.commands.PezDefault;
import edu.wpi.first.wpilibj.CANJaguar;
import org.usfirst.frc.team5250.robot.Constants;

public class Pez extends Subsystem {
	public static double goal = 0.0;
	
	public Pez() {
		RobotMap.canJaguar25.setPositionMode(CANJaguar.kQuadEncoder, Constants.pezCodesPerRev,
				-200.0, 0.0, 0.0);
		//canJaguar25.setPositionMode(tag, codesPerRev, p, i, d);
		RobotMap.canJaguar25.enableControl();
	}
	
	public void setPez(double position) {
		RobotMap.canJaguar25.set(position);
	}

    public void initDefaultCommand() {
    	setDefaultCommand(new PezDefault());
    }
}