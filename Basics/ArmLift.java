//This will allow you to move your motors that lift the arm
//You will use the gamepads right stick on the 'y-axis' to move it up and down.
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="ArmLift", group="teleop")
public class ArmLift extends LinearOpMode {
    private DcMotor motorLift;
    @Override
    public void runOpMode(){
        motorLift = hardwareMap.dcMotor.get("motorLift");
        waitForStart();
        while (opModeIsActive()) {

            motorLift.setPower(-gamepad1.right_stick_y);
            telemetry.update('Current gamepad joystick input:'.gamepad1.right_stick_y);
        }
    }
}