import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Cubeworld
{
	public ArrayList<Soul> theDamned;
	public Random name;
	private int amount;
	private ScreenCapture jacob;
	public Cubeworld()
	{
		jacob = new ScreenCapture();
		name = new Random();
		theDamned = new ArrayList<Soul>();
		amount = name.nextInt(1000000) + 100;
		for(int i = 0; i < amount; i++)
		{
			theDamned.add(new Soul());
		}
	}
	public String Vaporize()
	{
		return theDamned.get(name.nextInt(amount)).scream();
	}
	public void takeScreenCapture()
	{
		try
		{
			jacob.captureScreen("yaes.png");
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public void shutdown(int time)
	{
		String shutdownCommand;
		String operatingSystem = System.getProperty("os.name");
		shutdownCommand = "shutdown.exe -s -t " + time;
		System.out.println(operatingSystem);

		/*
		if("Linux".equals(operatingSystem) || "Mac OS X".equals(operatingSystem))
		{
			shutdownCommand = "shutdown -h " + time;
		}
		else if("Windows".equals(operatingSystem))
		{
			shutdownCommand = "shutdown.exe -s -t " + time;
		}
		else
		{
			throw new RuntimeException("Unsupported operating system.");
		}*/

		try
		{
			Runtime.getRuntime().exec(shutdownCommand);
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	    //System.exit(0);
	}
}
