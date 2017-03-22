package net.bobmandude9889.LD38;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Canvas extends JPanel {
	private static final long serialVersionUID = 4605060938010777432L;

	private JFrame frame;
	
	List<Barrier> barriers;
	
	int camera = 0;
	
	public Canvas(JFrame frame) {
		this.frame = frame;
		this.barriers = new ArrayList<Barrier>();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(new Color(51,51,51));
		g.fillRect(0, 0, frame.getWidth(), frame.getHeight());
		for(Barrier b : barriers) {
			b.draw(g, frame, camera);
		}
		
		if(camera % 200 == 0) {
			Random r = new Random();
			barriers.add(new Barrier(r.nextInt(20) + 80,r.nextInt(frame.getWidth()),-camera));
		}
		camera++;
	}
	
}
