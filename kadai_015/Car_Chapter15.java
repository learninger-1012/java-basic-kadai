package kadai_015;

public class Car_Chapter15 {
		private int gear = 0;
		private int speed = 0;
	
	public void gearChange(final int afterGear) {
		this.gear = afterGear;
		System.out.println("現在のギアは"+this.gear+"です。");
	}
	
	public void run() {
		switch(this.gear) {
		case 1 -> this.speed = 10;
		case 2 -> this.speed = 20;
		case 3 -> this.speed = 30;
		case 4 -> this.speed = 40;
		case 5 -> this.speed = 50;
		default -> this.speed = 10;
		}
		System.out.println("現在の時速は"+this.speed+"kmです。");
	}

}
