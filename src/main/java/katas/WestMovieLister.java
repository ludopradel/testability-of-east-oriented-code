package katas;

import java.util.List;
import java.util.stream.Collectors;

public class WestMovieLister
{
	private WestFinder moviesWestFinder;

	public WestMovieLister(WestFinder moviesWestFinder)
	{
		this.moviesWestFinder = moviesWestFinder;
	}

	public List<WestMovie> moviesDirectedBy(String requestedDirector)
	{
		List<WestMovie> allMovies = moviesWestFinder.findAll();
		List<WestMovie> directorMovies = allMovies.stream().filter(
				movie -> requestedDirector.equals(movie.director())
				).collect(Collectors.toList());

		return directorMovies;
	}
}
