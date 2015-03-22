package org.usfirst.frc.team5250.robot;

public final class Constants {
	public static final int leftOpenLimitID = 0; 
	public static final int leftCloseLimitID = 1;
	public static final int rightOpenLimitID = 2;
	public static final int rightCloseLimitID = 3;
	
	public static final double driveTrainRampRate = 12.000;
	public static final double driveTrainSlow = 0.5;
	public static final double driveTrainFast = 1.0;
	public static final double ultraSonicConstant = 0.098;

	public static final double clockWise = 1;
	public static final double counterClockWise = -1;
	public static final double pawlSpeed = 0.200;
	public static final double pawlManualSpeed = 0.300;
	public static final double wristSpeed = 0.400;
	public static final double clawSpeed = 0.400;

	public static final double PezDeadband = 0.100;
	public static final double PezP = 100.000;
	public static final double PezI = 0.000;
	public static final double PezD = 0.000;
	public static final int pezCodesPerRev = 497;
	public static final double pezBottomPosition = 0.000;

	public static final double armDeadband = 0.200;

	public final class XBoxAxisType {
		public static final int LeftX = 0;
		public static final int LeftY = 1;
		public static final int LeftTrigger = 2;
		public static final int RightTrigger = 3;
		public static final int RightX = 4;
		public static final int RightY = 5;
	}

	public final class XBoxButtonType {
		public static final int AButton = 1;
		public static final int BButton = 2;
		public static final int XButton = 3;
		public static final int YButton = 4;
		public static final int LeftBumper = 5;
		public static final int RightBumper = 6;
		public static final int BackButton = 7;
		public static final int StartButton = 8;
		public static final int LeftStickButton = 9;
		public static final int RightStickButton = 10;
	}
}