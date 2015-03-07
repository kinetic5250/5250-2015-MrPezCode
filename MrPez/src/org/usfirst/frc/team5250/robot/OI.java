package org.usfirst.frc.team5250.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Joystick;

import org.usfirst.frc.team5250.robot.commands.AutoCommand;
import org.usfirst.frc.team5250.robot.commands.Drive;
import org.usfirst.frc.team5250.robot.commands.PezDefault;
import org.usfirst.frc.team5250.robot.commands.pawl.PawlClose;
import org.usfirst.frc.team5250.robot.commands.pawl.PawlOpen;
import org.usfirst.frc.team5250.robot.commands.pawl.PawlCloseLeft;
import org.usfirst.frc.team5250.robot.commands.pawl.PawlCloseRight;
import org.usfirst.frc.team5250.robot.commands.pawl.PawlOpenLeft;
import org.usfirst.frc.team5250.robot.commands.pawl.PawlOpenRight;

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
    	
    	/*SmartDashboard.putData("AutonomousCommand", new AutoCommand());
        SmartDashboard.putData("Drive", new Drive());
        SmartDashboard.putData("PezDefault", new PezDefault());
        SmartDashboard.putData("PawlClose", new PawlClose());
        SmartDashboard.putData("PawlCloseLeft", new PawlCloseLeft());
        SmartDashboard.putData("PawlCloseRight", new PawlCloseRight());
        SmartDashboard.putData("PawlOpen", new PawlOpen());
        SmartDashboard.putData("PawlOpenLeft", new PawlOpenLeft());
        SmartDashboard.putData("PawlOpenRight", new PawlOpenRight());
        SmartDashboard.putData("PezDefault", new PezDefault());*/
	}
}