/**
 * 
 */
package command;

/**
 * @author jitendra
 * 
 */
public class DeviceButton
{
    private Command theCommand;

    public DeviceButton(Command newCommand)
    {
	this.theCommand = newCommand;
    }

    public void press()
    {
	theCommand.execute();
    }

}
