package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="Mecanum Drive", group="teleop")
public class MecanumDrive extends LinearOpMode {
    private DcMotor motorRight;
    private DcMotor motorLeft;
    @Override
    public void runOpMode(){
        motorLeft = hardwareMap.dcMotor.get("motorLeft");
        motorRight = hardwareMap.dcMotor.get("motorRight");

        waitForStart();
        while (opModeIsActive()) {

            motorLeft.setPower(-gamepad1.left_stick_y);
            motorRight.setPower(gamepad1.left_stick_y);
            telemetry.update('Current gamepad joystick input:'.gamepad1.left_stick_y);
        }
    }
}