/**
 * 
 */
package command;

/**
 * @author jitendra
 * 
 */
public class TurnTvUp implements Command
{

    private ElectronicDevice device;

    public TurnTvUp(ElectronicDevice newDevice)
    {
	this.device = newDevice;
    }

    @Override
    public void execute()
    {
	device.volumeUp();
    }

}
