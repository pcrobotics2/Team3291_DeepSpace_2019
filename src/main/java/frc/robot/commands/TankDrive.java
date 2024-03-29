/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class TankDrive extends Command {
  public TankDrive() {
    requires(Robot.DriveTrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    //Code that allows max speed to be controlled using throttle on Joystick
    Robot.DriveTrain.setRaw(Robot.m_oi.getLeftJoyY() * -((Robot.m_oi.rightStick.getZ()-1)/2), Robot.m_oi.getRightJoyY() * -((Robot.m_oi.rightStick.getZ()-1)/2));
    
    //regular TankDrive
    //Robot.DriveTrain.setRaw(Robot.m_oi.getLeftJoyY(), Robot.m_oi.getRightJoyY());


  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
