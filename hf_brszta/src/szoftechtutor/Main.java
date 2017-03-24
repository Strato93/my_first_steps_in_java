/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package szoftechtutor;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.WindowConstants;



/**
 *
 * @author Predi
 */
public class Main {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		/*
		 * Java gyakorlaton bemutatott mintaprogram main-j�nek belseje
		 * ehhez tartozik m�g a GUI.java, a Control.java 
		 * �s a Network.java, de ez m�g nincs implement�lva
		 * 
		Control c = new Control();
		GUI g = new GUI(c);
		c.setGUI(g);
		*/
		
		Dimension d = new Dimension(1024,768); // Ablak fix m�ret�nek be�ll�t�sa

		
		JFrame window = new JFrame(); // Ablak l�trehoz�sa
		window.setTitle("Faltoro"); // Ablak neve
		window.setSize(d); // Ablak m�rete
		window.setMaximumSize(d); // Ablak ne legyen �tm�retezhet�
		window.setMinimumSize(d);
        window.setVisible(true); // Ablak l�that�v� t�tele
        window.setLocationRelativeTo(null); // Ablak elhelyez�se a k�pery� k�zep�n
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // mem�ria takar�t�s bez�r�skor
        
        faltoro faltoro = new faltoro(); // �j faltoro l�trehoz�sa
        window.add(faltoro); // hozz�ad�sa az ablakhoz
        
        window.addMouseMotionListener(faltoro); // eg�r m�k�dtet�se
        
        Timer timer = new Timer(4, faltoro); // ciklikus lefut�s
        timer.start();
        
	}
}
