package org.usfirst.frc.team5250.robot.commands.Pawl;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class PawlClose extends CommandGroup {
	public PawlClose() {
		addSequential(new PawlCloseLeft());
		addParallel(new PawlCloseRight());
	}
}
