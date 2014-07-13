package observer;

import java.util.ArrayList;


public class StockGrabber implements Subject {
	
	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double googlePrice;
	private double applePrice;
	
	public StockGrabber(){
		observers = new ArrayList<Observer>();
	}
	

	@Override
	public void register(Observer o) {
		observers.add(o);
	}

	@Override
	public void unregister(Observer o) {
		int observerIndex = observers.indexOf(o);
		System.out.println("Observer" +observerIndex +"deleted");
		observers.remove(observerIndex);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer:observers){
			observer.update(ibmPrice, applePrice, googlePrice);
		}
	}


	public ArrayList<Observer> getObservers() {
		return observers;
	}


	public void setObservers(ArrayList<Observer> observers) {
		this.observers = observers;
	}


	public double getIbmPrice() {
		return ibmPrice;
	}


	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObservers();
	}


	public double getGooglePrice() {
		return googlePrice;
	}


	public void setGooglePrice(double googlePrice) {
		this.googlePrice = googlePrice;
		notifyObservers();
	}


	public double getApplePrice() {
		return applePrice;
	}


	public void setApplePrice(double applePrice) {
		this.applePrice = applePrice;
		notifyObservers();
	}
	
	
	

}
