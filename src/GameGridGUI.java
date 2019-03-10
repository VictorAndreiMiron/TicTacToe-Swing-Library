import javax.swing.JPanel;
import java.awt.GridLayout;
public class GameGridGUI extends JPanel
{
	public GameGrid grid;
	public GameSymbol symbolToPut;
	TicTacToeGUI gameGUI;
	public GameGridGUI(GameGrid requiredGrid)
	{
		grid = requiredGrid;
		this.setLayout(new GridLayout(3,3));
		for(int i = 0 ; i < 3 ; i++)
			for(int j = 0 ; j < 3; j++)
			{
				
				this.add((grid.getSymbol(i, j)).getImage()) ;
				(grid.getSymbol(i, j)).getImage().assignToGridGUI(this,i,j);
				
			}
		symbolToPut = new XSymbol();
	}
	
	public void addGameGUI(TicTacToeGUI gameGUI)
	{
		
		this.gameGUI = gameGUI;
	}
	public void update()
	{
		this.removeAll();
		this.setLayout(new GridLayout(3,3));
		for(int i = 0 ; i < 3 ; i++)
			for(int j = 0 ; j < 3; j++)
			{
				this.add(grid.getSymbol(i, j).getImage()) ;
			  
			}
		if(symbolToPut instanceof XSymbol)
			symbolToPut = new OSymbol();
		else
			symbolToPut = new XSymbol();
	}
	public void disableAllButtons()
	{
		for(int i = 0 ; i < 3 ; i++)
			for(int j = 0 ; j < 3; j++)
			{
				
				(grid.getSymbol(i, j)).getImage().setEnabled(false);
				
			}
		
	}
	

}
