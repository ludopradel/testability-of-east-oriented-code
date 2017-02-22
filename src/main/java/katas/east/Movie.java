package katas.east;

public class Movie implements EastMovie {

	private String director;
	private int stars;

	public Movie(String director)
	{
		this.director = director;
	}

	@Override
	public void ifDirectedByDo(String directorToFilter, MovieAction movieAction) {
		if (director == directorToFilter)
		{
			movieAction.applyTo(this);
		}
	}

	public void addStar()
	{
		stars++;
	}

}
