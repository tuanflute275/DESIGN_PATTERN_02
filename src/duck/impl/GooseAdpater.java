package duck.impl;

import duck.Quackable;
import enumDuck.DuckType;

public class GooseAdpater implements Quackable {
	private static final DuckType GooseAdapter = null;
	public Goose goose;

	public GooseAdpater(Goose Goose) {
		 this.goose = Goose;
	}

	@Override
	public void quack() {
		goose.hnok();
	}

	@Override
	public DuckType getType() {
		return GooseAdapter;
	}

}
