package org.usfirst.frc.team5250.robot.commands.pawl;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class PawlOpenCommand extends CommandGroup {
	public PawlOpenCommand() {
		addParallel(new PawlOpenLeftCommand());
		addParallel(new PawlOpenRightCommand());
	}
}
