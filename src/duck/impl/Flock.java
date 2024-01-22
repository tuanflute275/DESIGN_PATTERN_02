package duck.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import duck.Quackable;
import enumDuck.DuckType;

public class Flock implements Quackable {
	private List<Quackable> quacker = new ArrayList<Quackable>();
	private String flockName;
	private int countmallardDuck;
	private int countRedHeadDuck;
	private int countGoose;

	ArrayList quackers = new ArrayList();

	public Flock(String flockName) {
		return;
	}

	public void add(Quackable quacker) {
		quackers.add(quacker);
	}

	public void countDuck() {
		for (Quackable quackeble : quacker) {
			if(quackeble instanceof MallardDuck)
				countmallardDuck++;
			if(quackeble instanceof RedHeadDuck)
				countRedHeadDuck++;
			if(quackeble instanceof GooseAdpater)
				countGoose++;
		}
	}

	@Override
	public void quack() {
		Iterator iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quacker =(Quackable)iterator.next();
			quacker.quack();
		}
	}

	@Override
	public DuckType getType() {
		return DuckType.FLOCK;
	}

	public String getFlockName() {
		return flockName;
	}

	public void setFlockName(String flockName) {
		this.flockName = flockName;
	}

}
