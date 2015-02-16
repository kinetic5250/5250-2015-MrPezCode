package org.usfirst.frc.team5250.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Joystick;

import org.usfirst.frc.team5250.robot.commands.pawl.PawlClose;
import org.usfirst.frc.team5250.robot.commands.pawl.PawlOpen;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public static Joystick joystick0;
	public static CameraServer cameraServer;
	public static Button button5;
	public static Button button6;
	
	public static void init() {
		joystick0 = new Joystick(0);
		cameraServer = CameraServer.getInstance();
    	cameraServer.startAutomaticCapture("cam0");
    	button5 = new JoystickButton(joystick0, 5);
    	button6 = new JoystickButton(joystick0, 6);
    	button5.whenPressed(new PawlOpen());
    	button6.whenPressed(new PawlClose());
	}
}