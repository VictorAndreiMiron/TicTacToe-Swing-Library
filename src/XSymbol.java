
public class XSymbol implements GameSymbol
{
	private final String symbol = "X";
	private final GameSymbolGUI gui = new XSymbolGUI();
	public XSymbol()
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
