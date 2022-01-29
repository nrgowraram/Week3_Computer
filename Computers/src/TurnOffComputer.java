
public class TurnOffComputer implements Command_Computer {
	
	Computer_Command computer;
	public TurnOffComputer(Computer_Command computer)
	{
		this.computer=computer;
	}
	public void executeCommand()
	{
		computer.turnOffComputer();
	}

}
