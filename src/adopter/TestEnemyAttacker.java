/**
 * 
 */
package adopter;

/**
 * @author jitendra
 * 
 */
public class TestEnemyAttacker
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
	EnemyTank tank = new EnemyTank();
	EnemyRobot robot = new EnemyRobot();
	EnemyAttacker robotAdopter = new EnemyRobotAdopter(robot);
	System.out.println("The Robot");

	robot.reactToHuman("Paul");
	robot.walkForward();
	robot.smashWithHand();
	System.out.println("The Enemy tank");

	tank.assignDriver("Frank");
	tank.deviceForward();
	tank.fireWeapan();

	System.out.println("Robot with adopter does");

	robotAdopter.assignDriver("Mark");
	robotAdopter.deviceForward();
	robotAdopter.fireWeapan();

    }

}
