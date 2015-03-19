package org.usfirst.frc.team5250.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Joystick;

import org.usfirst.frc.team5250.robot.commands.arm.ArmManualCommand;
import org.usfirst.frc.team5250.robot.commands.arm.ClawCommand;
import org.usfirst.frc.team5250.robot.commands.arm.WristCommand;
import org.usfirst.frc.team5250.robot.commands.pawl.PawlCloseCommand;
import org.usfirst.frc.team5250.robot.commands.pawl.PawlOpenCommand;
import org.usfirst.frc.team5250.robot.commands.pez.PezManualCommand;
import org.usfirst.frc.team5250.triggers.ArmManualTrigger;
import org.usfirst.frc.team5250.triggers.ClawCloseTrigger;
import org.usfirst.frc.team5250.triggers.ClawOpenTrigger;
import org.usfirst.frc.team5250.triggers.PezManualTrigger;
import org.usfirst.frc.team5250.triggers.WristLowerTrigger;
import org.usfirst.frc.team5250.triggers.WristRaiseTrigger;

public class OI {
	public static Joystick driverJoystick;
	public static CameraServer cameraServer;
	public static Button leftBumper;
	public static Button rightBumper;
	public static PezManualTrigger pezManual;
	public static ArmManualTrigger armManual;
	public static ClawCloseTrigger clawClose;
	public static ClawOpenTrigger clawOpen;
	public static WristRaiseTrigger wristRaise;
	public static WristLowerTrigger wristLower;
	
	public static void init() {
		driverJoystick = new Joystick(0);
		cameraServer = CameraServer.getInstance();
		cameraServer.startAutomaticCapture("cam0");
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
		
		leftBumper.whenPressed(new PawlCloseCommand());
		rightBumper.whenPressed(new PawlOpenCommand());
		pezManual.whenActive(new PezManualCommand());
		armManual.whenActive(new ArmManualCommand());
		clawClose.whenActive(new ClawCommand(Constants.clawSpeed*Constants.counterClockWise));
		clawOpen.whenActive(new ClawCommand(Constants.clawSpeed*Constants.counterClockWise));
		wristRaise.whenActive(new WristCommand(Constants.wristSpeed*Constants.counterClockWise));
		wristLower.whenActive(new WristCommand(Constants.wristSpeed*Constants.counterClockWise));
	}
}