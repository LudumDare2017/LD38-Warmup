package net.bobmandude9889.LD38;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setTitle("LD38 Warmup");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Canvas canvas = new Canvas(frame);
		frame.add(canvas);
		frame.setVisible(true);
		Thread drawThread = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					canvas.repaint();
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		drawThread.start();
	}
	
}
