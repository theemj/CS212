package art;

import javax.swing.JFrame;

public class P0 extends JFrame
{

	public static void main(String[] args) 
	{
		System.out.println("Hello, world!!");
		new P0();
	}
	
	// P0 constructor
	public P0()
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setTitle("Hello, world!!");
		setSize(600, 600);
		setVisible(true);
	}

}
