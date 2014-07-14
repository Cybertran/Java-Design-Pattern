/**
 * 
 */
package command;

/**
 * @author jitendra
 * 
 */
public class TurnTvDown implements Command
{
    private ElectronicDevice device;

    public TurnTvDown(ElectronicDevice newDevice)
    {
	this.device = newDevice;
    }

    @Override
    public void execute()
    {
	device.volumeDown();
    }

}
