import javax.swing.*;
import java.awt.*;
@SuppressWarnings("serial")
public class PlayFallDown extends JFrame
{
	public PlayFallDown()
	{
		getContentPane().setLayout(new FlowLayout());
		add(new FallDownComponent());
		pack();
		getContentPane().setBackground(Color.YELLOW);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new PlayFallDown();
	}
}