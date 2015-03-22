package org.usfirst.frc.team5250.robot.commands.pawl;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class PawlCloseCommand extends CommandGroup {
	public PawlCloseCommand() {
		System.out.println("PawlCloseCommand");
		addParallel(new LeftPawlCloseCommand());
		addParallel(new RightPawlCloseCommand());
	}
}