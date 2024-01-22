package duck.impl;

import duck.Quackable;
import enumDuck.DuckType;

public class RedHeadDuck implements Quackable{

	@Override
	public void quack() {
		System.out.println("Quack");
	}

	@Override
	public DuckType getType() {
		return DuckType.REDHEADDUCK;
	}

}
