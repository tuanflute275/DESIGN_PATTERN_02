package factory;

import duck.Quackable;
import duck.impl.MallardDuck;
import duck.impl.RedHeadDuck;

public class DuckFactory extends AbstractDuckFactory{

	@Override
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}

	@Override
	public Quackable createRedHeadDuck() {
		return new RedHeadDuck();
	}

	@Override
	public Quackable createGoose() {
		return null;
	}
	
}
