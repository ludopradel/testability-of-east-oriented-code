package katas;


public class WestMovie
{

	private String director;

	private int stars = 0;

	public void addStar()
	{
		stars++;
	}

	public String director()
	{
		return director;
	}

	public int stars()
	{
		return stars;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (!(obj instanceof WestMovie))
			return false;

		WestMovie otherWestMovie = (WestMovie)obj;

		if (director == null)
			return otherWestMovie.director == null;

		return director.equals(otherWestMovie.director());
	}


}
