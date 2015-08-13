import java.util.Random;

public class Mem {
	private int size;
	private String memSocket;
	private int memPower;
	
	public Mem () {
		Random randomGenerator = new Random();
	    int randomSize = randomGenerator.nextInt(3);
	    int randomMemSocket = randomGenerator.nextInt(3);
	    int randomMemPower = randomGenerator.nextInt(3);
	    
	    if (randomSize == 0)
	    	this.size = 2;
	    else if (randomSize == 1)
	    	this.size = 4;
	    else
	    	this.size = 8;
	    
	    if (randomMemSocket == 0)
	    	this.memSocket = "DDR2";
	    else if (randomMemSocket == 1)
	    	this.memSocket = "DDR3";
	    else
	    	this.memSocket = "DDR4";
	    
	    if (randomMemPower == 0)
	    	this.memPower = 20;
	    else if (randomMemPower == 1)
	    	this.memPower = 30;
	    else
	    	this.memPower = 40;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getMemSocket() {
		return memSocket;
	}

	public void setMemSocket(String memSocket) {
		this.memSocket = memSocket;
	}

	public int getMoboPower() {
		return memPower;
	}

	public void setMoboPower(int moboPower) {
		this.memPower = moboPower;
	}
}