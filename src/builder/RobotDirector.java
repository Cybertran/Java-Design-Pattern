/**
 * 
 */
package builder;

/**
 * @author jitendra
 * 
 */
public class RobotDirector
{

    private RobotBuilder robotBuilder;

    public RobotDirector(RobotBuilder newRobotBuilder)
    {
	this.robotBuilder = newRobotBuilder;

    }

    public Robot getRobot()
    {
	return robotBuilder.getRobot();
    }

    public void buildRobot()
    {
	this.robotBuilder.buildRobotHead();
	this.robotBuilder.buildRobotArms();
	this.robotBuilder.buildRobotLegs();
	this.robotBuilder.buildRobotTorso();
    }
}
