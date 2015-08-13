import java.util.Random;

public class PSU {
	private int psuPower;
	
	public PSU () {
		Random randomGenerator = new Random();
	    int randomPsuPower = randomGenerator.nextInt(3);
	    
	    if (randomPsuPower == 0)
	    	this.psuPower = 50;
	    else if (randomPsuPower == 1)
	    	this.psuPower = 100;
	    else
	    	this.psuPower = 200;
	}

	public int getPsuPower() {
		return psuPower;
	}

	public void setPsuPower(int psuPower) {
		this.psuPower = psuPower;
	}
}