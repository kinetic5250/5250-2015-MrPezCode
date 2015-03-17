package org.usfirst.frc.team5250.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Joystick;

import org.usfirst.frc.team5250.robot.commands.pawl.PawlClose;
import org.usfirst.frc.team5250.robot.commands.pawl.PawlOpen;
import org.usfirst.frc.team5250.robot.commands.pez.PezManual;
import org.usfirst.frc.team5250.triggers.PezManualTrigger;

public class OI {
	public static Joystick joystick0;
	public static CameraServer cameraServer;
	public static Button button5;
	public static Button button6;
	public static PezManualTrigger pezManual;
	
	public static void init() {
		joystick0 = new Joystick(0);
		cameraServer = CameraServer.getInstance();
    	cameraServer.startAutomaticCapture("cam0");
    	button5 = new JoystickButton(joystick0, Constants.XBoxButtonType.kLeftBumper);
    	button6 = new JoystickButton(joystick0, Constants.XBoxButtonType.kRightBumper);
    	button5.whenPressed(new PawlOpen());
    	button6.whenPressed(new PawlClose());
    	pezManual.whenActive(new PezManual());
	}
}