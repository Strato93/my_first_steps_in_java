package szoftechtutor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.WindowConstants;

public class faltoro extends JComponent implements ActionListener, MouseListener, MouseMotionListener, KeyListener   {
	
	//public static Dimension dimension = new Dimension(1024,768); // Ablak fix m�ret�nek be�ll�t�sa
	
	// V�ltoz�k inicializ�l�sa 
	public int state = 0;
	public int labda_sebesseg_x = 0;
	public int labda_sebesseg_y = 0;
	public int labda_poz_x = 480;
	public int labda_poz_y = 640;
	public int labda_size = 24;
	public int uto_size_x = 150;
	public int uto_size_y = 20;
	public int uto_poz = 426;
	public boolean click = true;
	
	@Override
    protected void paintComponent(Graphics faltoro) {
		// labda
		faltoro.setColor(Color.cyan); // labda sz�n�nek be�ll�t�sa
        faltoro.fillOval(labda_poz_x, labda_poz_y, labda_size, labda_size);
        
        // �t� be�ll�t�sai
        faltoro.setColor(Color.blue); // �t� sz�n�nek be�ll�t�sa
        if(uto_poz>852){ // �t� mozg�s�nak korl�toz�sa
        	uto_poz=852;
        }
        faltoro.fillRect(uto_poz, 668, uto_size_x, uto_size_y);
        // t�gl�k
        // j-> sorok sz�ma    i-> oszlopok sz�ma
        for(int j = 0; j<5; ++j){
        	for(int i = 0; i<10; ++i) {
        		faltoro.setColor(Color.black);
        		faltoro.fillRect(100*i+20,30*j+5,40,20);
        	}
        }
	}

	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		labda_poz_x = labda_poz_x + labda_sebesseg_x;
		labda_poz_y = labda_poz_y + labda_sebesseg_y;
		
		// leesett a labda
		if(labda_poz_y > 680){
			uto_poz = 426;
			labda_poz_x = 480;
			labda_poz_y = 640;
			labda_sebesseg_y = 0;
			labda_sebesseg_x = 0;
			click=true;// game over
		}
		
		// �t�t �rt a labda
		if((labda_poz_y >= 644) && (labda_poz_y <= 646) && (labda_poz_x >= (uto_poz-14)) && (labda_poz_x <= (uto_poz+uto_size_x+14))){
						
			// ha az �t� jobb sz�l�t �rte a labda
			if(((labda_poz_x - uto_poz) >= 110)){
				labda_sebesseg_y = -1;
				labda_sebesseg_x = 3;	
			}
			
			// ha az �t� bal sz�l�t �rte a labda
			if((labda_poz_x - uto_poz) <= 35){
				labda_sebesseg_y = -1;
				labda_sebesseg_x = -3;
			}
			
			// ha az �t� k�zep�t �rte a labda
			if((((labda_poz_x - uto_poz) > 35)) && ((labda_poz_x - uto_poz) < 110)){
				int elojel_x = labda_sebesseg_x < 0 ? -1 : 1; // el�jel kinyer�se
				int elojel_y = labda_sebesseg_y < 0 ? 1 : -1; // el�jel v�ltoztat�sa
				labda_sebesseg_y = elojel_y*2;
				labda_sebesseg_x = elojel_x*2;
			}
						
			labda_poz_y = labda_poz_y - 3;  // hogy azonnal elt�volodjon az �t�t�l
		}
		
		// bal fal
		if(labda_poz_x < 10){
			labda_sebesseg_x = -1*labda_sebesseg_x;
		}
		
		// jobb fal
		if(labda_poz_x > 970){
			labda_sebesseg_x = -1*labda_sebesseg_x;
		}
		
		// tet�
		if(labda_poz_y < 10){
			labda_sebesseg_y = -1*labda_sebesseg_y;
		}
		
		repaint(); // k�perny� �jrarajzol�sa
	}
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		if (click==true){
		labda_sebesseg_x = 2;
		labda_sebesseg_y = -2;
		repaint();
		click=false;
		}
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		uto_poz = arg0.getX(); // eg�r x poz�ci�j�nak beolvas�sa
	
		repaint(); // k�perny� �jrarajzol�sa
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}