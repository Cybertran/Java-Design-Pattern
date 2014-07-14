/**
 * 
 */
package builder;

/**
 * @author jitendra
 * 
 */
public class TestRobotBuilder
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
	RobotBuilder oldStyle = new OldRobotBuilder();

	RobotDirector director = new RobotDirector(oldStyle);
	director.buildRobot();

	Robot robot = director.getRobot();

	System.out.println("Head is made of :" + robot.getRobotHead());

	System.out.println("Torso type :" + robot.getRobotTorso());

	System.out.println("Legs type " + robot.getRobotLegs());

    }

}
