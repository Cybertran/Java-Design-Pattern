/**
 * 
 */
package adopter;

import java.util.Random;

/**
 * @author jitendra
 * 
 */
public class EnemyTank implements EnemyAttacker
{
    private Random generator = new Random();

    @Override
    public void fireWeapan()
    {
	int attactDamage = generator.nextInt(10) + 1;
	System.out.println("Enemy tank does " + attactDamage + " damage");

    }

    @Override
    public void deviceForward()
    {
	int tankMove = generator.nextInt(5) + 1;
	System.out.println("Enemy Tank moves " + tankMove + "spaces");
    }

    @Override
    public void assignDriver(String driveName)
    {
	System.out.println(driveName + " is driving tank");

    }

}
