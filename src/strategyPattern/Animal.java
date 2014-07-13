package strategyPattern;

public class Animal {

	public Flys flyType;
	
	public String tryToFly(){
		return flyType.fly();
	}
	
	public void setFlyingAbility(Flys flysType){
		flyType = flysType;
	}
}
