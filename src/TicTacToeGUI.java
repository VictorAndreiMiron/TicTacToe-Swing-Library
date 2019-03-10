import javax.swing.JFrame;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
public class TicTacToeGUI extends JFrame
{
	private GameGridGUI gui;
	private PlayerTurnGUI turn;
	private GridBagConstraints gbc = new GridBagConstraints();
	public TicTacToeGUI(GameGridGUI requiredGUI)
	{
		setTitle("TicTacToe");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container container = getContentPane();
		container.setLayout(new GridBagLayout());
		gui = requiredGUI;
		gui.addGameGUI(this);
		turn = new PlayerTurnGUI();
		gbc.gridx =0;
		gbc.gridy =0;
		container.add(gui);
		gbc.gridx =0;
		gbc.gridy =1;
		container.add(turn);
		pack();
	}
	public void updateGridGui()
	{
		
	    gui.update();
	    turn.update();
	    GameSymbol stateAfterMove = TicTacToeGame.gameWinner(gui.grid);
	    if(!(stateAfterMove instanceof EmptySymbol))
	    	endGame(stateAfterMove);
		pack();
	}
	public void endGame(GameSymbol stateAfterMove)
	{
		gui.disableAllButtons();
		turn.endGame(stateAfterMove);
		pack();
		
	}
	

}
