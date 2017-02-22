package katas.east;

public class EastMovieLister {


	private EastFinder moviesFinder;

	public EastMovieLister(EastFinder moviesFinder)
	{
		this.moviesFinder = moviesFinder;
	}

	public void applyToMoviesDirectedBy(MovieAction movieAction, String director)
	{
		moviesFinder.findAllAndApply(new MovieDirectorFilterActionDecorator(movieAction, director));
	}

}
