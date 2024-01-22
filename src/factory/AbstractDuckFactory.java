package factory;

import duck.Quackable;

public abstract class AbstractDuckFactory {
	
	public abstract Quackable createMallardDuck();

	public abstract Quackable createRedHeadDuck();

	public abstract Quackable createGoose();
}
