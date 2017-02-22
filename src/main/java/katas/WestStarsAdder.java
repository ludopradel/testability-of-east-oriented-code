package katas;

import java.util.List;

public class WestStarsAdder
{
	public void AddStarsToMovies(List<WestMovie> moviesToAddStartTo)
	{
		for (WestMovie movie : moviesToAddStartTo)
		{
			movie.addStar();
		}
	}
}
