package observer;

public interface Subject {
	public void registerObserver(Observer observer);

	public void removeOberser(Observer observer);
	
	
	public void notifyObservers();
	}

