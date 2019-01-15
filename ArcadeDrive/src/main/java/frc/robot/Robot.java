/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * This is a demo program showing the use of the RobotDrive class, specifically
 * it contains the code necessary to operate a robot with tank drive.
 */
public class Robot extends TimedRobot {
  // we need to put in the correct port numbers for the motors and joystick
  PWMVictorSPX m_frontLeft = new PWMVictorSPX(1);
  PWMVictorSPX m_rearLeft = new PWMVictorSPX(2);
  SpeedControllerGroup m_left = new SpeedControllerGroup(m_frontLeft, m_rearLeft);

  PWMVictorSPX m_frontRight = new PWMVictorSPX(3);
  PWMVictorSPX m_rearRight = new PWMVictorSPX(4);
  SpeedControllerGroup m_right = new SpeedControllerGroup(m_frontRight, m_rearRight);

  DifferentialDrive m_drive = new DifferentialDrive(m_left, m_right);

  Joystick m_leftStick = new Joystick(0);

  @Override
  public void robotInit() {

    // m_myRobot = new DifferentialDrive(new PWMVictorSPX(0), new PWMVictorSPX(1));
    // Joystick m_leftStick = new Joystick(0);
    // m_rightStick = new Joystick(1);
  }

  @Override
  public void teleopPeriodic() {
    m_drive.tankDrive(m_leftStick.getX(), m_leftStick.getY());
  }
}
