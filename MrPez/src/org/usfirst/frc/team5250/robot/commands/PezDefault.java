package org.usfirst.frc.team5250.robot.commands;

import org.usfirst.frc.team5250.robot.OI;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class PezDefault extends CommandBase {	
	
	private Timer timer = new Timer();
	boolean pass = false;
	double goalPosition;
	
	public PezDefault() {
		requires(pez);
	}
	
	protected void initialize() {
		timer.start();
		pez.zeroPezPosition();
		goalPosition = 0;
	}
	
	protected void execute() {
		pass = timer.hasPeriodPassed(200);
		if(pass==true&&OI.joystick0.getRawButton(5)) {
			goalPosition -= 90;
			pez.setPezPosition(goalPosition);
			SmartDashboard.putNumber("goalPosition", goalPosition);
		} else if(pass==true&&OI.joystick0.getRawButton(5)) {
			goalPosition -= 90;
			pez.setPezPosition(goalPosition);
			SmartDashboard.putNumber("goalPosition", goalPosition);
		}
	}
	
	protected boolean isFinished() {
		return false;
	}
}
