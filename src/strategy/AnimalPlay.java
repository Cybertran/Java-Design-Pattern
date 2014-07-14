package strategy;

public class AnimalPlay {
	
	public static void main(String[] args){
		Animal tommy = new Dog();
		Animal kitty = new Bird();
		System.out.println("Dog :" +tommy.tryToFly());
		System.out.println("Bird :"+ kitty.tryToFly());
		// changing behavior dynamically
		tommy.setFlyingAbility(new CanFly());
		
		System.out.println("Dog :" +tommy.tryToFly());
		System.out.println("Bird :"+ kitty.tryToFly());
	}

}
