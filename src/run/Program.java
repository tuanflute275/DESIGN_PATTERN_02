package run;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import duck.Quackable;
import duck.impl.Flock;
import duck.impl.Goose;
import duck.impl.GooseAdpater;
import duck.impl.MallardDuck;
import duck.impl.QuackCounter;
import duck.impl.RedHeadDuck;
import factory.AbstractDuckFactory;
import factory.CountingDuckFactory;

public class Program {
//	public static void main(String[] args) {
//		int choice = 0;
//		Scanner sc = new Scanner(System.in);
//		do {
//			System.out.println("\n======>MENU<======");
//			System.out.println("1. Tạo đàn vịt");
//			System.out.println("2. đếm tổng số con có trong đàn bao gồm cả vịt và ngỗng");
//			System.out.println("3. Thống kê số con mỗi loại theo từng đàn");
//			System.out.println("Nhập số 0 để thoát chương trình");
//			choice = sc.nextInt();
//			sc.nextLine();
//		} while (choice != 0);
//	}
	
	
	
	public static void main(String[] args) {
		Program simulator = new Program();
		factory.AbstractDuckFactory duckFactory = new CountingDuckFactory();
		simulator.simulate(duckFactory);
	}
	
	void simulate(AbstractDuckFactory duckFactory) {
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedHeadDuck();
		Quackable goose = new GooseAdpater(new Goose());
		
		Flock Duck = new Flock(null);
		Flock Goose = new Flock(null);
		
		Flock danLon = new Flock(null);
		
		
		Flock dan1 = new Flock(null);
		Quackable mallardOne1 = duckFactory.createMallardDuck();
		dan1.add(mallardOne1);
		Duck.add(mallardOne1);
		Quackable mallardTwo1 = duckFactory.createMallardDuck();
		dan1.add(mallardTwo1);
		Duck.add(mallardTwo1);
		
		Quackable redheadOne1 = duckFactory.createRedHeadDuck();
		dan1.add(redheadOne1);
		Duck.add(redheadOne1);
		Quackable redheadTwo1 = duckFactory.createRedHeadDuck();
		dan1.add(redheadTwo1);
		Duck.add(redheadTwo1);
		
		
		Quackable gooseOne1 = new GooseAdpater(new Goose());
		dan1.add(gooseOne1);
		Goose.add(gooseOne1);
		
		
		
		
		danLon.add(dan1);
		
		
		
		Flock dan2 = new Flock(null);
		
		Quackable mallardOne2 = duckFactory.createMallardDuck();
		dan2.add(mallardOne2);
		Duck.add(mallardOne2);
		Quackable redheadOne2 = duckFactory.createRedHeadDuck();
		dan2.add(redheadOne2);
		Duck.add(redheadOne2);
		Quackable redheadTwo2 = duckFactory.createRedHeadDuck();
		dan2.add(redheadTwo2);
		Duck.add(redheadTwo2);
		Quackable gooseOne2 = new GooseAdpater(new Goose());;
		dan2.add(gooseOne2);
		Goose.add(gooseOne2);
		Quackable gooseTwo2 = new GooseAdpater(new Goose());;
		dan2.add(gooseTwo2);
		Goose.add(gooseTwo2);
		
		danLon.add(dan2);
		
		Flock dan3 = new Flock(null);
		Quackable mallardOne3 = duckFactory.createMallardDuck();
		dan3.add(mallardOne3);
		Duck.add(mallardOne3);
		Quackable mallardTwo3 = duckFactory.createMallardDuck();
		dan3.add(mallardTwo3);
		Duck.add(mallardTwo3);
		Quackable mallardThree3 = duckFactory.createMallardDuck();
		dan3.add(mallardThree3);
		Duck.add(mallardThree3);
		Quackable mallardFour3 = duckFactory.createMallardDuck();
		dan3.add(mallardFour3);
		Duck.add(mallardFour3);
		Quackable redheadOne3 = duckFactory.createRedHeadDuck();
		dan3.add(redheadOne3);
		Duck.add(redheadOne3);
		Quackable redheadTwo3 = duckFactory.createRedHeadDuck();
		dan3.add(redheadTwo3);
		Duck.add(redheadTwo3);
		
		Quackable gooseOne3 = new GooseAdpater(new Goose());;
		dan3.add(gooseOne3);
		Goose.add(gooseOne3);
		
		
		danLon.add(dan3);
		
		
		System.out.println("\n Tong so con o dan 1:");
		simulate(dan1);
		
		System.out.println("\nTong so con o dan 2:");
		simulate(dan2);
		
		System.out.println("\nTong so con o dan 3:");
		simulate(dan3);
		
		System.out.println("\n Tong so tieng keu o dan lon:");
		simulate(danLon);
		System.out.println("Tong so con vit o dan lon " + QuackCounter.getQuack() +" con ");
		
		System.out.println("\nTong so con vit:");
		simulate(Duck);
		
		System.out.println("\nTong so con ngong:");
		simulate(Goose);
	}
	void simulate(Quackable quack) {
		quack.quack();
	}
}
