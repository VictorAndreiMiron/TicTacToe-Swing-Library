import java.util.Scanner;
public class TicTacToeGame 
{
	static GameSymbol gameWinner(GameGrid grid)
	{
		if(grid.getNoOfNonEmptySymbols() == 9 && gameEnded(grid) instanceof EmptySymbol)
			   return new DrawSymbol();
	  return gameEnded(grid);
	}
	 private static GameSymbol gameEnded(GameGrid grid)
	 {
		 for(int i = 0 ; i <3 ; i++)
		 {
			 int columnCount = 0;
			 int rowCount = 0;
			 for(int j = 0 ; j <3;j++)
			 {
				 if(grid.getSymbol(i,j)  instanceof XSymbol )
					 rowCount++;
				 if(grid.getSymbol(i,j)  instanceof OSymbol )
					 rowCount--;
				 if(grid.getSymbol(j,i)  instanceof XSymbol )
					 columnCount++;
				 if(grid.getSymbol(j,i)  instanceof OSymbol )
					 columnCount--;
				 
			 }
			 if(rowCount == 3 || columnCount == 3)
				return new XSymbol();
			 if(rowCount == -3 || columnCount == -3)
				 return new OSymbol();
			 
			 
	 
		 }
		 int wind1=0;
		 int wind2 = 0;
		 for(int i = 0;i<3;i++)
		 {
			 if(grid.getSymbol(i, i) instanceof XSymbol)
				 wind1++;
			 if(grid.getSymbol(i, i) instanceof OSymbol)
				 wind1--;
			 if(grid.getSymbol(i, 2-i) instanceof XSymbol)
				 wind2++;
			 if(grid.getSymbol(i, 2-i) instanceof OSymbol)
				 wind2--;
		 }
		 
		 if(wind1 == 3 || wind2==3)
			 return new XSymbol();
		 
		 if(wind2 ==-3 || wind1 == -3)
			 return new OSymbol();
		 
		 return new EmptySymbol();
	 }
	 
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		GameGrid grid = new GameGrid();
		TicTacToeGUI gamegui = new TicTacToeGUI(grid.getImage());
		gamegui.setVisible(true);
	
		
	
			
	}

}
