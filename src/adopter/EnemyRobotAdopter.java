/**
 * 
 */
package adopter;

/**
 * @author jitendra
 * 
 */
public class EnemyRobotAdopter implements EnemyAttacker
{
    EnemyRobot robot;

    public EnemyRobotAdopter(EnemyRobot newRobot)
    {
	robot = newRobot;
    }

    @Override
    public void fireWeapan()
    {
	robot.smashWithHand();

    }

    @Override
    public void deviceForward()
    {
	robot.walkForward();
    }

    @Override
    public void assignDriver(String driverName)
    {
	robot.reactToHuman(driverName);
    }

}
