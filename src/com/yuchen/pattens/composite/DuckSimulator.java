package com.yuchen.pattens.composite;

public class DuckSimulator {
    public static void main(String args[]) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        duckSimulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();

        GooseAdapter gooseAdapter = new GooseAdapter(new Goose());

        System.out.println("Duck Simulator");

        Flock flock = new Flock();
        flock.add(mallardDuck);
        flock.add(redheadDuck);
        flock.add(duckCall);
        flock.add(rubberDuck);

        Flock flockMallards = new Flock();
        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        flockMallards.add(mallardOne);
        flockMallards.add(mallardTwo);
        simlate(flock);
        simlate(flockMallards);
//        simlate(mallardDuck);
//        simlate(redheadDuck);
//        simlate(duckCall);
//        simlate(rubberDuck);
//        simlate(gooseAdapter);
        System.out.println("Quack time:" + QuackCounter.getNumberOfQuacks());
    }

    void simlate(Quackable duck) {
        duck.quack();
    }

}
