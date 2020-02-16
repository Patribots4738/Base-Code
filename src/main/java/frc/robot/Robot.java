package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;

import autonomous.*;
import hardware.*;
import interfaces.*;
import networking.*;
import utils.*;
import wrappers.*;

public class Robot extends TimedRobot {

	@Override
	public void robotInit() {}

	@Override
  public void robotPeriodic() {}

	@Override
	public void autonomousInit() {} 

	@Override
  public void autonomousPeriodic() {}

  // NO TOUCH
  @Override 
  public void disabledInit() {}

  // VERY NO TOUCH
  @Override
  public void disabledPeriodic() {}

	@Override
	public void teleopInit() {}

  @Override
  public void teleopPeriodic() {}
  
  @Override
  public void testInit(){}
  
  @Override
  public void testPeriodic() {}
  
}