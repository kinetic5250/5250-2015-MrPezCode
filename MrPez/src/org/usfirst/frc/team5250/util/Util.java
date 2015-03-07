package org.usfirst.frc.team5250.util;

import java.lang.Math;

public class Util {
	public static double calculateDeadband(double input, double deadBand) {
		return (Math.abs(input)<Math.abs(deadBand))?0:input;
	}
}