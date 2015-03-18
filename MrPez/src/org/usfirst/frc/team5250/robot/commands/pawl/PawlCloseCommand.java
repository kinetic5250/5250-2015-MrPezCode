package org.usfirst.frc.team5250.robot.commands.pawl;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class PawlCloseCommand extends CommandGroup {
	public PawlCloseCommand() {
		addParallel(new PawlCloseLeftCommand());
		addParallel(new PawlCloseRightCommand());
	}
}