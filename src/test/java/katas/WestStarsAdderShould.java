package katas;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.junit.Test;

public class WestStarsAdderShould
{

	@Test
	public void addStarsToMovie() throws Exception
	{
		WestMovie alien = new WestMovie();

		WestStarsAdder starsAdder = new WestStarsAdder();
		starsAdder.AddStarsToMovies(Arrays.asList(alien));

		assertThat(alien.stars()).isEqualTo(1);
	}

}
