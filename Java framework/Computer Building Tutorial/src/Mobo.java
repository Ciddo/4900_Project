import java.util.Random;

public class Mobo {
	private String cpuSocket;
	private String moboSize;
	private String memSocket;
	private int moboPower;
	
	public Mobo () {
		Random randomGenerator = new Random();
	    int randomCpuSocket = randomGenerator.nextInt(3);
	    int randomMoboSize = randomGenerator.nextInt(3);
	    int randomMemSocket = randomGenerator.nextInt(3);
	    int randomMoboPower = randomGenerator.nextInt(3);
	    
	    if (randomCpuSocket == 0)
	    	this.cpuSocket = "A";
	    else if (randomCpuSocket == 1)
	    	this.cpuSocket = "B";
	    else
	    	this.cpuSocket = "C";
	    
	    if (randomMoboSize == 0)
	    	this.moboSize = "Small";
	    else if (randomMoboSize == 1)
	    	this.moboSize = "Medium";
	    else
	    	this.moboSize = "Large";
	    
	    if (randomMemSocket == 0)
	    	this.memSocket = "DDR2";
	    else if (randomMemSocket == 1)
	    	this.memSocket = "DDR3";
	    else
	    	this.memSocket = "DDR4";
	    
	    if (randomMoboPower == 0)
	    	this.moboPower = 10;
	    else if (randomMoboPower == 1)
	    	this.moboPower = 25;
	    else
	    	this.moboPower = 50;
	}
	
	//Always do Mobo.equals(hardware)
	public boolean equals(Object o) {
        if (o instanceof CPU) {
        	if (this.getCpuSocket().equals(((CPU) o).getCpuSocket()))
        		return true;
        	else
        		return false;
        }
        if (o instanceof Mem) {
        	if (this.getMemSocket().equals(((Mem) o).getMemSocket()))
        		return true;
        	else
        		return false;
        }
        if (o instanceof Case) {
        	if (this.getMoboSize().equals(((Case) o).getMoboSize()))
        		return true;
        	else
        		return false;
        }
        else return false;
	}

	public String getCpuSocket() {
		return cpuSocket;
	}

	public void setCpuSocket(String cpuSocket) {
		this.cpuSocket = cpuSocket;
	}

	public String getMoboSize() {
		return moboSize;
	}

	public void setMoboSize(String moboSize) {
		this.moboSize = moboSize;
	}

	public String getMemSocket() {
		return memSocket;
	}

	public void setMemSocket(String memSocket) {
		this.memSocket = memSocket;
	}

	public int getMoboPower() {
		return moboPower;
	}

	public void setMoboPower(int moboPower) {
		this.moboPower = moboPower;
	}
}