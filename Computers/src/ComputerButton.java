
public class ComputerButton {
	
	Command_Computer button;
	public ComputerButton() {}
	public void setCommand(Command_Computer command)
	{
		button = command;
	}
	public void buttonPressed()
	{
		button.executeCommand();
	}

}
