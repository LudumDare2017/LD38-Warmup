package net.bobmandude9889.LD38;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Barrier {

	int gapSize;
	int gapPos;
	int y;
	
	static int height = 20;
	
	public Barrier(int gapSize, int gapPos, int y) {
		super();
		this.gapSize = gapSize;
		this.gapPos = gapPos;
		this.y = y;
	}

	public void draw(Graphics g, JFrame frame, int cameraHeight) {
		if(y + cameraHeight > -height && cameraHeight + y < frame.getHeight()) {
			g.setColor(new Color(66, 134, 244));
			g.fillRect(0, cameraHeight + y, gapPos, height);
			g.fillRect(gapPos + gapSize, cameraHeight + y, frame.getWidth() - (gapPos + gapSize), height);
		}
	}
	
}
