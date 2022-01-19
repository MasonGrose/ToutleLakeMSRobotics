//This is made for the robot to move automatically with NO input from the driver.
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "AutoMove", group = "")
public class AutoMove extends LinearOpMode {
  private DcMotor motorRight;
    private DcMotor motorLeft;

  @Override
  public void runOpMode() {
    motorLeft = hardwareMap.dcMotor.get("motorLeft");
        motorRight = hardwareMap.dcMotor.get("motorRight");

    // Put initialization blocks here.
    waitForStart();
    
    motorLeft.setPower(-1);
    motorRight.setPower(1);
    sleep(1500); //Here you put in the value in miliseconds that you want the robot to move automatically.
  }
}
