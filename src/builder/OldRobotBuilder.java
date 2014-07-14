package builder;

public class OldRobotBuilder implements RobotBuilder
{

    private Robot robot;

    public OldRobotBuilder()
    {
	this.robot = new Robot();
    }

    @Override
    public void buildRobotHead()
    {
	robot.setRobotHead("Tin head");
    }

    @Override
    public void buildRobotTorso()
    {

	robot.setRobotTorso("tin torso");
    }

    @Override
    public void buildRobotArms()
    {
	robot.setRobotArms("Blowtarch arms");
    }

    @Override
    public void buildRobotLegs()
    {
	robot.setRobotLegs("Roller sketch");
    }

    @Override
    public Robot getRobot()
    {
	return this.robot;
    }

}
