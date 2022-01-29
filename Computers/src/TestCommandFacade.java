
public class TestCommandFacade {

	public static void main(String[] args) {
		
		
		
		ComputerButton cbutton = new ComputerButton();
		Computer_Command computer = new Computer_Command();
		ComputerFacade cf = new ComputerFacade();
		
		cbutton.setCommand(new TurnOnComputer(computer));
		cbutton.buttonPressed();
		cf.turnOnComputer();
		
		cbutton.setCommand(new TurnOffComputer(computer));
		cbutton.buttonPressed();		
		cf.turnOffComputer();
		

	}

}
