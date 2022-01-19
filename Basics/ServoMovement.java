//This will allow the servo at the end of the arm to move
//Make sure that you set your limits with the srs programmer included in your kit
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="ServoMovement", group="teleop")
public class ArmLift extends LinearOpMode {
    private Servo liftServo;
    @Override
    public void runOpMode(){
        liftServo = hardwareMap.get(Servo.class, "liftServo");
        waitForStart();
        while (opModeIsActive()) {

            duckServo.setPosition(-gamepad1.right_stick_x);
            telemetry.update('Current gamepad joystick input:'.gamepad1.right_stick_y);
        }
    }
}