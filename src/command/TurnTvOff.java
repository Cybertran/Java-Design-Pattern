/**
 * 
 */
package command;

/**
 * @author jitendra
 * 
 */
public class TurnTvOff implements Command
{

    private ElectronicDevice device;

    public TurnTvOff(ElectronicDevice newDevice)
    {
	this.device = newDevice;
    }

    @Override
    public void execute()
    {
	device.off();
    }

}
