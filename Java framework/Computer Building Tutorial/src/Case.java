import java.util.Random;

public class Case {
	private String moboSize;
	
	public Case () {
		Random randomGenerator = new Random();
	    int randomMoboSize = randomGenerator.nextInt(3);
	    
	    if (randomMoboSize == 0)
	    	this.moboSize = "Small";
	    else if (randomMoboSize == 1)
	    	this.moboSize = "Medium";
	    else
	    	this.moboSize = "Large";
	}

	public String getMoboSize() {
		return moboSize;
	}

	public void setMoboSize(String moboSize) {
		this.moboSize = moboSize;
	}
}