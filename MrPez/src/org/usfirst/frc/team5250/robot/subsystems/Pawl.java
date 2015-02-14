package org.usfirst.frc.team5250.robot.subsystems;

import org.usfirst.frc.team5250.robot.RobotMap;
import org.usfirst.frc.team5250.robot.commands.Pawl.PawlOpen;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Pawl extends Subsystem {
	
	public double setLeftPawl(double output) {
		RobotMap.talon0.set(output);
		SmartDashboard.putNumber("PawlLeftSet", output);
		return output;
	}
	
	public double setRightPawl(double output) {
		RobotMap.talon1.set(output);
		SmartDashboard.putNumber("PawlRightSet", output);
		return output;
	}
	
	protected void initDefaultCommand() {
		setDefaultCommand(new PawlOpen());
	}
}