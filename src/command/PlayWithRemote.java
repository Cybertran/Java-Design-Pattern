/**
 * 
 */
package command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jitendra
 * 
 */
public class PlayWithRemote
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
	ElectronicDevice device = TvRemote.getDevice();

	TurnTvOn onCommand = new TurnTvOn(device);

	DeviceButton onPress = new DeviceButton(onCommand);
	onPress.press();

	TurnTvOff offCommand = new TurnTvOff(device);

	DeviceButton offPress = new DeviceButton(offCommand);
	offPress.press();

	TurnTvUp upCommand = new TurnTvUp(device);

	DeviceButton upPress = new DeviceButton(upCommand);
	upPress.press();
	upPress.press();
	upPress.press();

	System.out.println("==========================================");
	Television tv = new Television();
	Radio radio = new Radio();

	List<ElectronicDevice> allDevices = new ArrayList<ElectronicDevice>();
	allDevices.add(tv);
	allDevices.add(radio);
	TurnItAllOff offAll = new TurnItAllOff(allDevices);

	DeviceButton offButton = new DeviceButton(offAll);
	offButton.press();

    }
}
