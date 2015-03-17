package org.usfirst.frc.team5250.robot.commands.pez;

import org.usfirst.frc.team5250.robot.Constants;
import org.usfirst.frc.team5250.robot.OI;
import org.usfirst.frc.team5250.robot.RobotMap;
import org.usfirst.frc.team5250.robot.commands.CommandBase;
import org.usfirst.frc.team5250.util.Util;

public class PezManual extends CommandBase {
	public PezManual() {
		requires(pez);
	}
	
	protected void initialize() {
		RobotMap.canJaguar25.setPercentMode();
	}
	
    protected void execute() {
    	pez.setPez(Util.trim(
    			OI.joystick0.getRawAxis(Constants.XBoxAxisType.kLeftTrigger)
				+ OI.joystick0.getRawAxis(Constants.XBoxAxisType.kRightTrigger),
						-1.0, 1.0));
    }

    protected boolean isFinished() {return false;}
    protected void end() {}

    protected void interrupted() { end(); }
}