import java.util.Random;

public class CPU {
	private String cpuSocket;
	private int cpuPower;
	
	public CPU () {
		Random randomGenerator = new Random();
	    int randomCpuSocket = randomGenerator.nextInt(3);
	    int randomCpuPower = randomGenerator.nextInt(3);
	    
	    if (randomCpuSocket == 0)
	    	this.cpuSocket = "A";
	    else if (randomCpuSocket == 1)
	    	this.cpuSocket = "B";
	    else
	    	this.cpuSocket = "C";
	    
	    if (randomCpuPower == 0)
	    	this.cpuPower = 10;
	    else if (randomCpuPower == 1)
	    	this.cpuPower = 25;
	    else
	    	this.cpuPower = 50;
	}

	public String getCpuSocket() {
		return cpuSocket;
	}

	public void setCpuSocket(String cpuSocket) {
		this.cpuSocket = cpuSocket;
	}

	public int getCpuPower() {
		return cpuPower;
	}

	public void setCpuPower(int cpuPower) {
		this.cpuPower = cpuPower;
	}
}