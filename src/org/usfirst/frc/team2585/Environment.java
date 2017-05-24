package org.usfirst.frc.team2585;

import org.impact2585.lib2585.RobotEnvironment;
import org.usfirst.frc.team2585.input.InputMethod;
import org.usfirst.frc.team2585.input.XboxInput;
import org.usfirst.frc.team2585.systems.ShooterSystem;
import org.usfirst.frc.team2585.systems.WheelSystem;

/**
 * This class contains the robot's systems and input
 */
public class Environment extends RobotEnvironment{
	
	private static final long serialVersionUID = 6320366174026889629L;
	private InputMethod input;
	private WheelSystem wheels;
	private ShooterSystem shooter;
	
	
	/**
	 * Initializes the systems
	 * @param robot the robot that belongs to the environment
	 */
	public Environment(Robot robot) {
		super(robot);
		input = new XboxInput();
		wheels = new WheelSystem();
		shooter = new ShooterSystem();
		
		wheels.init(this);
		shooter.init(this);
	}
	
	/**
	 * @return the WheelSystem
	 */
	public WheelSystem getWheelSystem() {
		return wheels;
	}
	
	/**
	 * @return the ShooterSystem
	 */
	public ShooterSystem getShooterSystem() {
		return shooter;
	}
	
	
	/**
	 * @return the input
	 */
	public InputMethod getInput() {
		return input;
	}
	
	/* (non-Javadoc)
	 * @see org.impact2585.lib2585.Destroyable#destroy()
	 */
	@Override
	public void destroy() {
		wheels.destroy();
		shooter.destroy();
	}
}
