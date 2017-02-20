package org.teamresistance.frc;

import org.teamresistance.frc.util.MecanumDrive;

import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.*;

/**
 * Created by shrey on 2/20/2017.
 */
public class IO {

  // PDP
  public static PowerDistributionPanel pdp = new PowerDistributionPanel(0);

  // Motors -- shooting
  public static VictorSP shooterMotor = new VictorSP(4);
  public static VictorSP feederMotor = new VictorSP(2);
  public static VictorSP agitatorMotor = new VictorSP(6);

  // Motors -- other
  public static VictorSP snorflerMotor = new VictorSP(0);
  public static VictorSP gearRotatorMotor = new VictorSP(5);
  public static VictorSP climberMotor = new VictorSP(9);

  // Banner Sensors for Gear
  public static InvertibleDigitalInput gearFindBanner = new InvertibleDigitalInput(1, true);
  public static InvertibleDigitalInput gearAlignBanner = new InvertibleDigitalInput(2, true);
  public static InvertibleDigitalInput gearRetractedLimit = new InvertibleDigitalInput(0, true);

  // Drive Motors
  public static Victor leftFrontMotor = new Victor(7);
  public static Victor leftRearMotor = new Victor(8);
  public static Victor rightFrontMotor = new Victor(3);
  public static Victor rightRearMotor = new Victor(1);

  // Pneumatic Cylinders (controlled via Solenoids)
  public static SingleSolenoid gripSolenoid = new InvertibleSolenoid(1, 2, true);
  public static SingleSolenoid extendSolenoid = new InvertibleSolenoidWithPosition(1, 0, false, gearRetractedLimit);
  public static SingleSolenoid rotateSolenoid = new InvertibleSolenoid(1, 1, false);

  public static Compressor compressor = new Compressor(1);
  public static Relay compressorRelay = new Relay(0);

  // Relay for green LEDs
  public static Relay cameraLights = new Relay(1);

  // NavX-MXP navigation sensor
  public static AHRS navX = new AHRS(SPI.Port.kMXP);

  public static PowerDistributionPanel powerPanel = new PowerDistributionPanel(0);
  
  public static MecanumDrive drive = new MecanumDrive(
		  new RobotDrive(IO.leftFrontMotor, IO.leftRearMotor, IO.rightFrontMotor, IO.rightRearMotor),
	      IO.navX);


}
