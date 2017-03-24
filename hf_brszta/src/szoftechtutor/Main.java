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
		 * Java gyakorlaton bemutatott mintaprogram main-jének belseje
		 * ehhez tartozik még a GUI.java, a Control.java 
		 * és a Network.java, de ez még nincs implementálva
		 * 
		Control c = new Control();
		GUI g = new GUI(c);
		c.setGUI(g);
		*/
		
		Dimension d = new Dimension(1024,768); // Ablak fix méretének beállítása

		
		JFrame window = new JFrame(); // Ablak létrehozása
		window.setTitle("Faltoro"); // Ablak neve
		window.setSize(d); // Ablak mérete
		window.setMaximumSize(d); // Ablak ne legyen átméretezhetõ
		window.setMinimumSize(d);
        window.setVisible(true); // Ablak láthatóvá tétele
        window.setLocationRelativeTo(null); // Ablak elhelyezése a képeryõ közepén
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // memória takarítás bezáráskor
        
        faltoro faltoro = new faltoro(); // Új faltoro létrehozása
        window.add(faltoro); // hozzáadása az ablakhoz
        
        window.addMouseMotionListener(faltoro); // egér mûködtetése
        
        Timer timer = new Timer(4, faltoro); // ciklikus lefutás
        timer.start();
        
	}
}
