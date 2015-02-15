package org.usfirst.frc.team5250.robot.commands.pawl;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class PawlClose extends CommandGroup {
	public PawlClose() {
		addParallel(new PawlCloseLeft());
		addParallel(new PawlCloseRight());
	}
}
