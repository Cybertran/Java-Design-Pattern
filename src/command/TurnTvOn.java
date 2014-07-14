package command;

public class TurnTvOn implements Command
{
    private ElectronicDevice device;

    public TurnTvOn(ElectronicDevice newDevice)
    {
	this.device = newDevice;
    }

    @Override
    public void execute()
    {
	device.on();
    }

}
