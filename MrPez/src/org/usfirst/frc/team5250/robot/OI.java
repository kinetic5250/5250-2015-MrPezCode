package org.usfirst.frc.team5250.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Joystick;

import org.usfirst.frc.team5250.robot.commands.FastDriveCommand;
import org.usfirst.frc.team5250.robot.commands.SlowDriveCommand;
import org.usfirst.frc.team5250.robot.commands.arm.ArmManualCommand;
import org.usfirst.frc.team5250.robot.commands.arm.ClawCommand;
import org.usfirst.frc.team5250.robot.commands.arm.WristCommand;
import org.usfirst.frc.team5250.robot.commands.pawl.LeftPawlManual;
import org.usfirst.frc.team5250.robot.commands.pawl.PawlCloseCommand;
import org.usfirst.frc.team5250.robot.commands.pawl.PawlOpenCommand;
import org.usfirst.frc.team5250.robot.commands.pawl.RightPawlManual;
import org.usfirst.frc.team5250.robot.commands.pez.PezManualCommand;
import org.usfirst.frc.team5250.triggers.ArmManualTrigger;
import org.usfirst.frc.team5250.triggers.ClawCloseTrigger;
import org.usfirst.frc.team5250.triggers.ClawOpenTrigger;
import org.usfirst.frc.team5250.triggers.PezManualTrigger;
import org.usfirst.frc.team5250.triggers.WristLowerTrigger;
import org.usfirst.frc.team5250.triggers.WristRaiseTrigger;

public class OI {
	public static Joystick driverJoystick;
	public static Joystick assistantJoystick;
	public static CameraServer cameraServer;
	public static Button fastDrive;
	public static Button slowDrive;
	public static Button leftBumper;
	public static Button rightBumper;
	public static PezManualTrigger pezManual;
	public static ArmManualTrigger armManual;
	public static ClawCloseTrigger clawClose;
	public static ClawOpenTrigger clawOpen;
	public static WristRaiseTrigger wristRaise;
	public static WristLowerTrigger wristLower;
	public static Button leftPawlManualClockWise;
	public static Button leftPawlManualCounterClockWise;
	public static Button rightPawlManualClockWise;
	public static Button rightPawlManualCounterClockWise;
	
	public static void init() {
		driverJoystick = new Joystick(0);
		assistantJoystick = new Joystick(1);
		cameraServer = CameraServer.getInstance();
		cameraServer.startAutomaticCapture("cam0");
		fastDrive = new JoystickButton(driverJoystick, 
				Constants.XBoxButtonType.BackButton);
		slowDrive = new JoystickButton(driverJoystick, 
				Constants.XBoxButtonType.StartButton);
		leftBumper = new JoystickButton(driverJoystick,
				Constants.XBoxButtonType.LeftBumper);
		rightBumper = new JoystickButton(driverJoystick,
				Constants.XBoxButtonType.RightBumper);
		pezManual = new PezManualTrigger();
		armManual = new ArmManualTrigger();
		clawClose = new ClawCloseTrigger();
		clawOpen = new ClawOpenTrigger();
		wristRaise = new WristRaiseTrigger();
		wristLower = new WristLowerTrigger();
		leftPawlManualClockWise = new JoystickButton(assistantJoystick, 8);
		leftPawlManualCounterClockWise = new JoystickButton(assistantJoystick, 7);
		rightPawlManualClockWise = new JoystickButton(assistantJoystick, 10);
		rightPawlManualCounterClockWise = new JoystickButton(assistantJoystick, 9);
		
		leftBumper.whenPressed(new PawlCloseCommand());
		rightBumper.whenPressed(new PawlOpenCommand());
		
		fastDrive.whenPressed(new FastDriveCommand());
		slowDrive.whenPressed(new SlowDriveCommand());
		
		pezManual.whenActive(new PezManualCommand());
		armManual.whenActive(new ArmManualCommand());
		
		clawClose.whenActive(new ClawCommand(
				Constants.clawSpeed*Constants.counterClockWise));
		clawOpen.whenActive(new ClawCommand(
				Constants.clawSpeed*Constants.clockWise));
		
		wristRaise.whenActive(new WristCommand(
				Constants.wristSpeed*Constants.counterClockWise));
		wristLower.whenActive(new WristCommand(
				Constants.wristSpeed*Constants.clockWise));
		
		leftPawlManualClockWise.whenPressed(new LeftPawlManual(
				Constants.pawlManualSpeed*Constants.clockWise));
		leftPawlManualCounterClockWise.whenPressed(new LeftPawlManual(
				Constants.pawlManualSpeed*Constants.counterClockWise));
		rightPawlManualClockWise.whenPressed(new RightPawlManual(
				Constants.pawlManualSpeed*Constants.clockWise));
		rightPawlManualCounterClockWise.whenPressed(new RightPawlManual(
				Constants.pawlManualSpeed*Constants.counterClockWise));
		
		leftPawlManualClockWise.whenReleased(new LeftPawlManual(0));
		leftPawlManualCounterClockWise.whenReleased(new LeftPawlManual(0));
		rightPawlManualClockWise.whenReleased(new RightPawlManual(0));
		rightPawlManualCounterClockWise.whenReleased(new RightPawlManual(0));
	}
}