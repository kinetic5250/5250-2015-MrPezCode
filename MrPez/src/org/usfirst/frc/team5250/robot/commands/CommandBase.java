package org.usfirst.frc.team5250.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

//import org.usfirst.frc.team5250.robot.Robot;
import org.usfirst.frc.team5250.robot.subsystems.DriveTrain;
import org.usfirst.frc.team5250.robot.subsystems.pawl.PawlLeft;
import org.usfirst.frc.team5250.robot.subsystems.pawl.PawlRight;
import org.usfirst.frc.team5250.robot.subsystems.Pez;
import org.usfirst.frc.team5250.robot.subsystems.arm.Arm;
import org.usfirst.frc.team5250.robot.subsystems.arm.Claw;
import org.usfirst.frc.team5250.robot.subsystems.arm.Wrist;

public class CommandBase extends Command {
	protected static DriveTrain driveTrain = new DriveTrain();
	protected static Pez pez = new Pez();
	protected static PawlLeft pawlLeft = new PawlLeft();
	protected static PawlRight pawlRight = new PawlRight();
	protected static Arm arm = new Arm();
	protected static Claw claw = new Claw();
	protected static Wrist wrist = new Wrist();
	
	// Called just before this Command runs the first time
	protected void initialize() {

	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {

	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	protected void end() {}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {}
}