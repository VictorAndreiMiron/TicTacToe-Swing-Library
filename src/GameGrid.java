
public class GameGrid 
{
	private GameSymbol[][] gameGrid = new GameSymbol[3][3];
	private int noOfNonEmptySymbols = 0;
	private GameGridGUI gui ;
	public GameGrid()
	{
		for(int i = 0 ; i < 3; i++)
			for(int j = 0 ; j < 3 ; j++)
				gameGrid[i][j]= new EmptySymbol();
		
		gui = new GameGridGUI(this);
	}
	
	public boolean putSymbol(int x, int y, GameSymbol symbol)
	{
		if(gameGrid[x][y] instanceof EmptySymbol)
		{
			gameGrid[x][y] = symbol;
			noOfNonEmptySymbols++;
			return true;
		}
		
		return false;
	}
	
	public int getNoOfNonEmptySymbols()
	{
		return noOfNonEmptySymbols;
	}
	
	public GameSymbol getSymbol(int x , int y)
	{
		return gameGrid[x][y];
	}
	public String toString()
	{
		String str = "";
		for(int i = 0;i < 3;i++)
		{
			for(int j = 0 ; j < 3 ; j++)
		       if(j<2)
		    	   str+=gameGrid[i][j].toString() + "|";
		       else
		    	   str+=gameGrid[i][j].toString();
			
		
		   if(i<2)
			  str+="\n-----\n";
		}
		
		return str;
	}
	
	public GameGridGUI getImage()
	{
		return gui;
	}
	

}
