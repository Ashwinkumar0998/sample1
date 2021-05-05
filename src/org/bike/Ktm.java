package org.bike;

public class Ktm implements Bike {

	@Override
	public void cost() {
System.out.println("189000Rs");		
	}

	@Override
	public void speed() {
		System.out.println("137kph");
	}
public static void main(String[] args) {
	Ktm k=new Ktm();
	k.cost();
	k.speed();
}
}
