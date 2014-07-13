package observer;

public class GrabStocks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
      StockGrabber grab = new StockGrabber();
      StockObserver observer1 = new StockObserver(grab);
      observer1.setApplePrice(1500);
      observer1.setGooglePrice(1000);
      observer1.setIbmPrice(700);
	}

}
