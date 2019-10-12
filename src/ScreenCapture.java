import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ScreenCapture
{
	public ScreenCapture()
	{
		try
		{
			captureScreen("yaes.png");
		} catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Welp");
		}
	}
	public void captureScreen(String fileName) throws Exception
	{
		   Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		   Rectangle screenRectangle = new Rectangle(screenSize);
		   Robot robot = new Robot();
		   BufferedImage image = robot.createScreenCapture(screenRectangle);
		   ImageIO.write(image, "png", new File(System.getProperty("user.dir") + "\\src\\" + fileName));
	}
}
