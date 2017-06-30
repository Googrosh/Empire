package empire.util;
import java.awt.*;
import javax.swing.*;

public class JPanelWithBackground extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = -3752381500346517335L;
	private Image img;

    public JPanelWithBackground(Image img)
    {
        this.img = img;
    }

    public void paintComponent(Graphics g)
    {
        Dimension panelSize = getSize();
        int width = img.getWidth(this);
        int height = img.getHeight(this);

        for(int y = 0; y < panelSize.height; y += height)
        {
            for(int x = 0; x < panelSize.width; x += width)
            {
                g.drawImage(img, x, y, this);
            }
        }
    }
}