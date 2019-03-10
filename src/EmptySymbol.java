
public class EmptySymbol implements GameSymbol
{
	private final String symbol = " ";
	private final GameSymbolGUI gui;
	public EmptySymbol()
	{
		super();
		gui = new EmptySymbolGUI();
	}
	public GameSymbolGUI getImage()
	{
		return gui;
	}
	public String toString()
	{
		return symbol;
	}
	

}
