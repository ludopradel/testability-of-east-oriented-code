package katas.east;

public class MovieDirectorFilterActionDecorator implements MovieAction
{
	private MovieAction movieAction;
	private String director;

	public MovieDirectorFilterActionDecorator(MovieAction movieAction, String director) {
		this.movieAction = movieAction;
		this.director = director;
	}

	@Override
	public void applyTo(EastMovie movie) {
		movie.ifDirectedByDo(director, movieAction);
	}

}