package org.usfirst.frc.team5250.util;

import java.lang.Math;

public final class Util {
	public final static double calculateDeadband(double input, double deadBand) {
		return (Math.abs(input)<Math.abs(deadBand))?0:input;
	}
	
	public final static double trim (double value, double minimum, double maximum) {
		if(value<minimum) {
			return minimum;
		} else if(value>maximum) {
			return maximum;
		} else {
			return value;
		}
	}
}