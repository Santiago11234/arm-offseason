package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ElevatorSubsystem;

public class ElevatorCommand  extends CommandBase{

    private final ElevatorSubsystem elevSub;
    private final double setPoint;
    private final OI oi;


    public ElevatorCommand(ElevatorSubsystem sub, double setPoint, OI oi) {
        this.elevSub = sub;
        this.setPoint = setPoint;
        this.oi = oi;

        addRequirements(elevSub);
    }

    @Override
    public void initialize() {
        elevSub.setPosition(setPoint);
    }

    @Override
    public void execute() {}

    @Override
    public void end(boolean interrupted) {
        
    }
    @Override
    public boolean isFinished() {
        return true;
    }

    //three commands for each set point
    //pass in the set point in constructor


}
