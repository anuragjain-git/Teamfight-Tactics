import java.awt.*; 
import javax.swing.*;
import java.awt.event.*; 

public class Bench extends JPanel implements MouseListener{
	
	private Player player;
	private ImageIcon bg;
	private JButton reroll;
	
	public Bench(Player player){
		this.player = player;
		bg = new ImageIcon("Bench.jpg");
		reroll = new JButton("Reroll");
		reroll.setSize(300, 200);
	
		this.setPreferredSize(new Dimension(1000,100));
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		int h = this.getHeight(), w = this.getWidth();
		
		//background
		g.drawImage(bg.getImage(), 0, 0, w, h, null);
		
		//border lines on bench
		g.setColor(Color.white);
		for (int i=0; i<10; i++){
			g.drawLine(i*100, 0, i*100, h);
		}
	}
	
	public void mousePressed(MouseEvent e) {
		
    }
	public void mouseClicked(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
	
}