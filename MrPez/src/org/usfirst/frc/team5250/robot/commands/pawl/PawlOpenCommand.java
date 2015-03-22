package org.usfirst.frc.team5250.robot.commands.pawl;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class PawlOpenCommand extends CommandGroup {
	public PawlOpenCommand() {
		System.out.println("PawlOpenCommand");
		addParallel(new LeftPawlOpenCommand());
		addParallel(new RightPawlOpenCommand());
	}
}
