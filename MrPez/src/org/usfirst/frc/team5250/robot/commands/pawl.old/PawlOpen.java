package org.usfirst.frc.team5250.robot.commands.pawl;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class PawlOpen extends CommandGroup {
	public PawlOpen() {
		addParallel(new PawlOpenLeft());
		addParallel(new PawlOpenRight());
	}
}
