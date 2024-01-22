package factory;


import duck.Quackable;
import duck.impl.MallardDuck;
import duck.impl.QuackCounter;
import duck.impl.RedHeadDuck;

public class CountingDuckFactory extends AbstractDuckFactory{

	@Override
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}

	@Override
	public Quackable createRedHeadDuck() {
		return new QuackCounter(new RedHeadDuck());
	}

	@Override
	public Quackable createGoose() {
		return null;
	}
	
}
