package observer;

import java.util.ArrayList;

public class Channel implements Subject {
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private String channelName;
	private String status;
	
	public Channel(String channelName, String status) {
		this.setChannelName(channelName);
		this.status= status;
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	@Override
	public void removeOberser(Observer observer) {
		observers.remove(observer);
	}
	@Override
	public void notifyObservers() {
		for(Observer o : observers) {
			o.update();
		}
	}
	

	public String getStatus() {
		return status;
	}
	
	public void setStatus(String  status) {
		this.status = status;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	
	
}
