package katas.east;


import org.junit.Test;
import org.mockito.Mockito;

public class EastMovieListerShould {

	@Test
	public void firstAttempt() {
		EastFinder fakeFinder = Mockito.mock(EastFinder.class);
		MovieAction mockMovieAction = Mockito.mock(MovieAction.class);
		EastMovieLister movieLister = new EastMovieLister(fakeFinder);

		movieLister.applyToMoviesDirectedBy(mockMovieAction, "Steven Spielberg");

		Mockito.verify(fakeFinder).findAllAndApply(Mockito.any());
	}

	@Test
	public void secondAttempt() {
		Movie fakeMovie = new Movie("Steven Spielberg");
		EastFinder fakeFinder = new FakeFinder();
		MovieAction mockMovieAction = Mockito.mock(MovieAction.class);

		fakeFinder.addMovie(fakeMovie);
		EastMovieLister movieLister = new EastMovieLister(fakeFinder);

		movieLister.applyToMoviesDirectedBy(mockMovieAction, "Steven Spielberg");

		Mockito.verify(mockMovieAction).applyTo(fakeMovie);
	}

	@Test
	public void thirdAttempt() {
		Movie fakeMovie = Mockito.spy(new Movie("Steven Spielberg"));

		EastFinder fakeFinder = new FakeFinder();
		MovieAction addStarAction = new AddStarAction();

		fakeFinder.addMovie(fakeMovie);
		EastMovieLister movieLister = new EastMovieLister(fakeFinder);

		movieLister.applyToMoviesDirectedBy(addStarAction, "Steven Spielberg");

		Mockito.verify(fakeMovie).addStar();
	}

	public class FakeFinder implements EastFinder {

		private EastMovie movie;

		@Override
		public void findAllAndApply(MovieAction movieAction) {
			movieAction.applyTo(movie);
		}

		@Override
		public void addMovie(EastMovie fakeMovie) {
			movie = fakeMovie;
		}

	}
}
