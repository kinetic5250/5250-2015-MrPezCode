package org.usfirst.frc.team5250.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
//import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Joystick;

import org.usfirst.frc.team5250.robot.commands.pawl.PawlCloseCommand;
import org.usfirst.frc.team5250.robot.commands.pawl.PawlOpenCommand;
import org.usfirst.frc.team5250.robot.commands.pez.PezManualCommand;
import org.usfirst.frc.team5250.triggers.PezManualTrigger;

public class OI {
	public static Joystick driverJoystick;
	//public static CameraServer cameraServer;
	public static Button leftBumper;
	public static Button rightBumper;
	public static PezManualTrigger pezManual;
	
	public static void init() {
		driverJoystick = new Joystick(0);
		//cameraServer = CameraServer.getInstance();
    	//cameraServer.startAutomaticCapture("cam0");
    	leftBumper = new JoystickButton(driverJoystick, Constants.XBoxButtonType.kLeftBumper);
    	rightBumper = new JoystickButton(driverJoystick, Constants.XBoxButtonType.kRightBumper);
    	pezManual = new PezManualTrigger();
    	leftBumper.whenPressed(new PawlOpenCommand());
    	rightBumper.whenPressed(new PawlCloseCommand());
    	pezManual.whenActive(new PezManualCommand());
	}
}