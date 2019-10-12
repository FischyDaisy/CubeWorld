import java.util.Random;

public class Soul
{
	private int painIntensity;
	private String scream;
	private Random rando;
	private String[] krosky;
	public Soul()
	{
		rando = new Random();
		painIntensity = rando.nextInt(10);
		krosky = new String[]
				{
						"OH GOD PLEASE STOP",
						"IT HURTS SO DAMN BAD",
						"EVERYTHING IS ON FIRE!",
						"LORD HAVE MERCY ON MY SOUL",
						"MOMMY!!!!!!!!!",
						"KROSKY WHY HAVE YOU SENT ME HERE",
						"AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAh",
						"Dear Liberals, If marine life is really going extinct, why is crabfest back at red lobster's?",
						"GOD PLEASE MAKE IT STOP",
						"JESUS PLEASE WHAT HAVE I DONE TO YOU!"
				};
		generateScream();
	}
	private void generateScream()
	{
		Random rando = new Random();
		if(rando.nextInt(2) == 0)
		{
			scream = krosky[rando.nextInt(10)];
		}
		else
		{
			for(int i = 0; i < rando.nextInt(50); i++)
			{
				scream += (char)rando.nextInt(128);
			}
		}
	}
	public String scream()
	{
		return scream;
	}
}