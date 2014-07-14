package command;

import java.util.List;

public class TurnItAllOff implements Command
{
    List<ElectronicDevice> allDevice;

    public TurnItAllOff(List<ElectronicDevice> newDevices)
    {
	this.allDevice = newDevices;

    }

    @Override
    public void execute()
    {
	for (ElectronicDevice device : allDevice)
	{
	    device.off();
	}

    }

}
