import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.Dimension;
import java.awt.GridLayout;
public class PlayerTurnGUI extends JPanel
{
	 private ImageIcon symbolX;
	 private ImageIcon symbolO;
	 private ImageIcon symbolDraw;
	 private JLabel currentTurn = new JLabel();
	 private int turn =0;
	public PlayerTurnGUI()
	{
		
		symbolX = new ImageIcon("C:\\Users\\andre\\eclipse-workspace\\TicTacToe\\bin\\images\\XSymbol.png");
		symbolO = new ImageIcon("C:\\Users\\andre\\eclipse-workspace\\TicTacToe\\bin\\images\\OSymbol.png");
		symbolDraw =new ImageIcon("C:\\Users\\andre\\eclipse-workspace\\TicTacToe\\bin\\images\\DrawSymbol.png");
		currentTurn.setIcon(symbolX);
		this.setLayout(new GridLayout(2,1));		
		this.add(currentTurn);
		this.add(new JLabel("                   X TURN"));
		turn++;
	}
	
	public void update()
	{
		turn%=2;
		this.removeAll();
		currentTurn = new JLabel();
		if(turn == 0)
		{
			currentTurn.setIcon(symbolX);
			this.setLayout(new GridLayout(2,1));		
			this.add(currentTurn);
			this.add(new JLabel("                   X TURN"));
		}
		else
		{
			currentTurn.setIcon(symbolO);
			this.setLayout(new GridLayout(2,1));		
			this.add(currentTurn);
			this.add(new JLabel("                   O TURN"));
		}
	   turn++;
	}
	
	public void endGame(GameSymbol symbol)
	{
		this.removeAll();
		currentTurn = new JLabel();
		if(symbol instanceof XSymbol)
		{
		currentTurn.setIcon(symbolX);
		this.setLayout(new GridLayout(2,1));		
		this.add(currentTurn);
		this.add(new JLabel("                   X WON"));
		}
		else if ( symbol instanceof OSymbol)
		{
			currentTurn.setIcon(symbolO);
			this.setLayout(new GridLayout(2,1));		
			this.add(currentTurn);
			this.add(new JLabel("                   O WON"));
			
		}
		else
		{
			currentTurn.setIcon(symbolDraw);
			this.setLayout(new GridLayout(2,1));		
			this.add(currentTurn);
			this.add(new JLabel("                   DRAW"));
		}
	
	}
	

}
