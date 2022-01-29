
public class TurnOnComputer implements Command_Computer {
	
	Computer_Command computer;
	public TurnOnComputer(Computer_Command computer)
	{
		this.computer=computer;
	}
	public void executeCommand()
	{
		computer.turnOnComputer();
	}

}
