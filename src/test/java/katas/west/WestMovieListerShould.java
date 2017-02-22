package katas.west;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.junit.Test;
import org.mockito.Mockito;

import katas.west.WestFinder;
import katas.west.WestMovie;
import katas.west.WestMovieLister;


public class WestMovieListerShould
{
	@Test
	public void returnMovieDirectedByASpecificDirector() throws Exception
	{
		WestMovie fakeSpielbergMovie = Mockito.mock(WestMovie.class);
		Mockito.when(fakeSpielbergMovie.director()).thenReturn("Steven Spielberg");

		WestMovie fakeNonSpielbergMovie = Mockito.mock(WestMovie.class);
		Mockito.when(fakeNonSpielbergMovie.director()).thenReturn("Not Steven Spielberg");

		WestFinder fakeFinder = Mockito.mock(WestFinder.class);
		Mockito.when(fakeFinder.findAll()).thenReturn((Arrays.asList(fakeSpielbergMovie, fakeNonSpielbergMovie)));

		WestMovieLister movieLister = new WestMovieLister(fakeFinder);
		assertThat(movieLister.moviesDirectedBy("Steven Spielberg")).isEqualTo(Arrays.asList(fakeSpielbergMovie));
	}

}
