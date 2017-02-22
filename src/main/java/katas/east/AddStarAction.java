package katas.east;

public class AddStarAction implements MovieAction {

	@Override
	public void applyTo(EastMovie movie) {
		movie.addStar();
	}

}
