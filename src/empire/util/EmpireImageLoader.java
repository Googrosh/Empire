package empire.util;
import javax.swing.*;

public class EmpireImageLoader {

	private ImageIcon[] images = new ImageIcon[13];
	
	public EmpireImageLoader() {
	}
	
	public ImageIcon[] loadingImages() {
		images[0] = new ImageIcon(getClass().getClassLoader().getResource("goodgame empire img/background.png")); //background
		images[12] = new ImageIcon(getClass().getClassLoader().getResource("goodgame empire img/barbaro.png")); //barbaro
		images[3] = new ImageIcon(getClass().getClassLoader().getResource("goodgame empire img/big_v.png")); //big_v
		images[1] = new ImageIcon(getClass().getClassLoader().getResource("goodgame empire img/ggs_logo.png")); //ggs_logo
		images[11] = new ImageIcon(getClass().getClassLoader().getResource("goodgame empire img/handshake.png")); //handshake
		images[4] = new ImageIcon(getClass().getClassLoader().getResource("goodgame empire img/horn.png")); //horn
		images[9] = new ImageIcon(getClass().getClassLoader().getResource("goodgame empire img/i_circle.png")); //i_circle
		images[5] = new ImageIcon(getClass().getClassLoader().getResource("goodgame empire img/i.png")); //i
		images[10] = new ImageIcon(getClass().getClassLoader().getResource("goodgame empire img/info_icon.png")); //info_icon
		images[2] = new ImageIcon(getClass().getClassLoader().getResource("goodgame empire img/little_v.png")); //little_v
		images[6] = new ImageIcon(getClass().getClassLoader().getResource("goodgame empire img/papiro.png")); //papiro
		images[7] = new ImageIcon(getClass().getClassLoader().getResource("goodgame empire img/v.png")); //v
		images[8] = new ImageIcon(getClass().getClassLoader().getResource("goodgame empire img/x.png")); //x
		return images;
	}
}
