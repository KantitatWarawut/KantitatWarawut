package Q2_ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

interface Observer {
	void notify(String tweet);
}

interface Subject {
	void registerObserver(Observer o);
	void notifyObservers(String tweet);
}

class Feed implements Subject {
	private final List<Observer> observers = new ArrayList<>();

	public void registerObserver(Observer o) {
		this.observers.add(o);
	}

	public void notifyObservers(String tweet) {
		observers.forEach(o -> o.notify(tweet));
	}
}


public class Main {
	public static void main(String[] args) {
		Feed f = new Feed();

		f.registerObserver(tweet -> {
			if (tweet != null && tweet.contains("money")) {
				System.out.println("Breaking news in NY!" + tweet);
			}
		});

		f.registerObserver(tweet -> {
			if (tweet != null && tweet.contains("queen")) {
				System.out.println("Yet more news from London..." + tweet);
			}
		});

		f.registerObserver(tweet -> {
			if (tweet != null && tweet.contains("wine")) {
				System.out.println("Today cheese, wine and news!" + tweet);
			}
		});

		f.notifyObservers("The queen said her favourite book is Modern Java in Action!");
	}
}