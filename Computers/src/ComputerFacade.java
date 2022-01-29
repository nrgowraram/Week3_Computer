
public class ComputerFacade {
	
	
	private Display display;
	private OS os;
	
	public ComputerFacade()
	{
		display = new Display();
		os = new OS();
	}
	
	public void turnOnComputer()
	{
		display.on();
		os.start();
	}
	
	public void turnOffComputer()
	{
		os.off();
		display.off();
	}
	
	

}
