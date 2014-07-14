/**
 * 
 */
package builder;

/**
 * @author jitendra
 * 
 */
public class Robot implements RobotPlan
{
    private String robotHead;
    private String robotTorso;
    private String robotArms;
    private String robotLegs;

    @Override
    public void setRobotHead(String head)
    {

	this.robotHead = head;
    }

    @Override
    public void setRobotLegs(String leg)
    {
	this.robotLegs = leg;
    }

    @Override
    public void setRobotTorso(String torso)
    {
	this.robotTorso = torso;

    }

    @Override
    public void setRobotArms(String arms)
    {
	this.robotArms = arms;
    }

    /**
     * @return the robotHead
     */
    public String getRobotHead()
    {
	return robotHead;
    }

    /**
     * @return the robotTorso
     */
    public String getRobotTorso()
    {
	return robotTorso;
    }

    /**
     * @return the robotArms
     */
    public String getRobotArms()
    {
	return robotArms;
    }

    /**
     * @return the robotLegs
     */
    public String getRobotLegs()
    {
	return robotLegs;
    }

}
