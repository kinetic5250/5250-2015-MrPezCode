package org.usfirst.frc.team5250.robot;

public final class Constants {
	public static final int driveTrainLeftFrontID = 26;
	public static final int driveTrainRightFrontID = 27;
	public static final int driveTrainLeftRearID = 29;
	public static final int driveTrainRightRearID = 30;
	public static final int pezElevatorID = 28;
	public static final int armArmID = 31;
	public static final int armClawID = 32;
	public static final int armWristID = 33;

	public static final double driveTrainExponent = 2.174;
	public static final double driveTrainRampRate = 14.0;
	public static final double driveTrainDeadband = 0.05;
	public static final double ultraSonicConstant = 0.098;

	public static final double pawlSpeed = 0.200;

	public static final double kPezDeadband = 0.1;
	public static final double kPezP = 100.0;
	public static final double kPezI = 0.0;
	public static final double kPezD = 0.0;
	public static final int kPezCodesPerRev = 497;
	public static final double pezBottomPosition = 0.0;

	public final class XBoxAxisType {
		public static final int kLeftX = 0;
		public static final int kLeftY = 1;
		public static final int kLeftTrigger = 2;
		public static final int kRightTrigger = 3;
		public static final int kRightX = 4;
		public static final int kRightY = 5;
	}

	public final class XBoxButtonType {
		public static final int kAButton = 1;
		public static final int kBButton = 2;
		public static final int kXButton = 3;
		public static final int kYButton = 4;
		public static final int kLeftBumper = 5;
		public static final int kRightBumper = 6;
		public static final int kBackButton = 7;
		public static final int kStartButton = 8;
		public static final int kLeftStickButton = 9;
		public static final int kRightStickButton = 10;
	}
}