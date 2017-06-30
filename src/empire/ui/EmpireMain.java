package empire.ui;

import javax.swing.*;

import empire.util.EmpireImageLoader;

public class EmpireMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				EmpireImageLoader imageLoader = new EmpireImageLoader();
				EmpireGUI gui;
				ImageIcon[] images;
				
				images = imageLoader.loadingImages();
				gui = new EmpireGUI(images);
				gui.setVisible(true);
				gui.setLocationRelativeTo(null);
			}
		});
	}

}
