import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Dimension;
public class GameSymbolGUI extends JButton implements ActionListener
{
    private ImageIcon symbol;
    private GameGridGUI gridGUI = null;
    private int x = 0;
    private int y = 0;
	public GameSymbolGUI(String source)
	{
		 setPreferredSize(new Dimension(150,150));
		 symbol = new ImageIcon(source);
		 this.setIcon(symbol);
		 this.setDisabledIcon(symbol);
		 this.addActionListener(this);
	}
	
	public void assignToGridGUI(GameGridGUI requiredGameGridGUI,int xRequired,int yRequired)
	{
		gridGUI = requiredGameGridGUI;
		x = xRequired;
		y  =yRequired;
	}

	
	public void actionPerformed(ActionEvent e)
	{       
		   
		try
		{
			gridGUI.grid.putSymbol(x,y, gridGUI.symbolToPut);
			gridGUI.grid.getSymbol(x, y).getImage().setEnabled(false);
			gridGUI.gameGUI.updateGridGui();
		}
		catch(Exception exception)
		{
			this.setEnabled(false);
		}
	
	}

}

