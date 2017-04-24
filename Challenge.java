package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");

	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
		driveDirect(9000,1000);
		sleep(1000);
		driveDirect(900000,100);
		sleep(10000000);
		driveDirect(-90000,1000);
	}

	public void loop() {
	
	}


}
