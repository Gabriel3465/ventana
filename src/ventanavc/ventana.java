package ventanavc;

import java.awt.Dimension;
import java.swing.JFrame;

import miPanelPro.MyFrame;

public class ventana extends JFrame{
	public ventana() {
		setTitle("Programa");
		setVisible(true);
		setSize(500,500);
		
		setLocationRelativeTo(null);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setResizable(true);
		
	    this.setMaximumSize(new Dimension(800,800));
	    this.setMinimumSize(new Dimension(800,800));
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ventana frame = new ve();
		frame.setVisible(true);
		

	}

}
