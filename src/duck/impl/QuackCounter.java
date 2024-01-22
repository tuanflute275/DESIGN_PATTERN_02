package duck.impl;

import duck.Quackable;
import enumDuck.DuckType;

public class QuackCounter implements Quackable {
	public Quackable quack;
	public static int numberOfQuack;

	public QuackCounter(Quackable quack) {
		this.quack = quack;
	}

	public static int getQuack() {
		return numberOfQuack;
	}

	@Override
	public void quack() {
		quack.quack();
		numberOfQuack++;
	}

	@Override
	public DuckType getType() {
		return null;
	}

}
