
public class OSymbol implements GameSymbol
{
	private final String symbol = "O";
	 private final GameSymbolGUI gui = new OSymbolGUI();
	public OSymbol()
	{
		super();
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
