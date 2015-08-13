import java.util.Random;

public class HDD {
	private int hddPower;
	
	public HDD () {
		Random randomGenerator = new Random();
	    int randomPower = randomGenerator.nextInt(3);
	    
	    if (randomPower == 0)
	    	this.hddPower = 5;
	    else if (randomPower == 1)
	    	this.hddPower = 10;
	    else
	    	this.hddPower = 15;
	}

	public int getHddPower() {
		return hddPower;
	}

	public void setHddPower(int power) {
		this.hddPower = power;
	}
}