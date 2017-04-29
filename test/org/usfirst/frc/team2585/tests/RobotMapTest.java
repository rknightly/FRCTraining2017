package org.usfirst.frc.team2585.tests;

import org.junit.*;
import org.usfirst.frc.team2585.RobotMap;

public class RobotMapTest {	
	// Not really necessary, but just for good practice
	
	@Test
	public void test() {
		// Make sure that the right motors are using two different ports
		Assert.assertTrue(RobotMap.RIGHT_LOWER_DRIVE != RobotMap.RIGHT_UPPER_DRIVE);
		
		// Make sure that the left motor is not using the same port as the right ports
		Assert.assertTrue(RobotMap.LEFT_DRIVE != RobotMap.RIGHT_LOWER_DRIVE);
		Assert.assertTrue(RobotMap.LEFT_DRIVE != RobotMap.RIGHT_UPPER_DRIVE);
	}

}
