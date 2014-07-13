package observer;

public class StockObserver implements Observer {
	
	private double ibmPrice;
	private double applePrice;
	private double googlePrice;
	private static int observerIDTracker = 0;
	private int observerID;
	private Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber){
		this.stockGrabber = stockGrabber;
		this.observerID = ++observerIDTracker;
		System.out.println("New Observer :"+ this.observerID);
		stockGrabber.register(this);
	}

	@Override
	public void update(double ibmPrice, double applePrice, double googlePrice) {
         this.ibmPrice = ibmPrice;
         this.applePrice = applePrice;
         this.googlePrice = googlePrice;
         pritPrices();
	}
	
	public void pritPrices(){
		System.out.println(observerID +"\nIBM "+ibmPrice +"\n APPLE" +applePrice+"\nGoogle" +googlePrice);
	}

	public double getIbmPrice() {
		return ibmPrice;
	}

	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
	}

	public double getApplePrice() {
		return applePrice;
	}

	public void setApplePrice(double applePrice) {
		this.applePrice = applePrice;
	}

	public double getGooglePrice() {
		return googlePrice;
	}

	public void setGooglePrice(double googlePrice) {
		this.googlePrice = googlePrice;
	}

	public static int getObserverIDTracker() {
		return observerIDTracker;
	}

	public static void setObserverIDTracker(int observerIDTracker) {
		StockObserver.observerIDTracker = observerIDTracker;
	}

	public int getObserverID() {
		return observerID;
	}

	public void setObserverID(int observerID) {
		this.observerID = observerID;
	}

	public Subject getStockGrabber() {
		return stockGrabber;
	}

	public void setStockGrabber(Subject stockGrabber) {
		this.stockGrabber = stockGrabber;
	}
	

}
