import java.util.Scanner;

public class TestRun {

	public static void main (String[] args) {
		Mobo testMobo = new Mobo();
		CPU testCPU = new CPU();
		Mem testMem = new Mem();
		HDD testHDD = new HDD();
		PSU testPSU = new PSU();
		Case testCase = new Case();
		
		Scanner stdin = new Scanner(System.in);
		
		/**
		System.out.println("Mobo created!");
		System.out.println("CPU Socket: " + testMobo.getCpuSocket());
		System.out.println("Motherboard Size: " + testMobo.getMoboSize());
		System.out.println("Memory Socket: " + testMobo.getMemSocket());
		System.out.println("Power: " + testMobo.getMoboPower() + "W");
		
		System.out.println();
		
		System.out.println("CPU created!");
		System.out.println("CPU Socket: " + testCPU.getCpuSocket());
		System.out.println("Power: " + testCPU.getCpuPower() + "W");
		
		System.out.println();
		
		System.out.println("Memory created!");
		System.out.println("Memory size: " + testMem.getSize() + "GB");
		System.out.println("Memory socket: " + testMem.getMemSocket());
		System.out.println("Power: " + testMem.getMoboPower() + "W");

		System.out.println();
		
		System.out.println("HDD created!");
		System.out.println("Power: " + testHDD.getHddPower() + "W");
		
		System.out.println();
		
		System.out.println("PSU created!");
		System.out.println("PSU power: " + testPSU.getPsuPower() + "W");
		
		System.out.println();
		
		System.out.println("Case created!");
		System.out.println("Case size: " + testCase.getMoboSize());
		*/
		
		System.out.println("Mobo created!");
		System.out.println("CPU Socket: " + testMobo.getCpuSocket());
		System.out.println("Motherboard Size: " + testMobo.getMoboSize());
		System.out.println("Memory Socket: " + testMobo.getMemSocket());
		System.out.println("Power: " + testMobo.getMoboPower() + "W");
		
		System.out.println();
		
		System.out.println("CPU created!");
		System.out.println("CPU Socket: " + testCPU.getCpuSocket());
		System.out.println("Power: " + testCPU.getCpuPower() + "W");
		
		System.out.println();
		
		System.out.print("Will this CPU fit into this motherboard? Y or N. ");
		String response = stdin.next();
		System.out.println();
		
		if ((testMobo.equals(testCPU)) && ((response.equals("Y")) || (response.equals("y"))))
			System.out.println("You are correct!");
		else if ((testMobo.equals(testCPU) == false) && ((response.equals("Y")) || (response.equals("y"))))
			System.out.println("You are incorrect!");
		else if ((testMobo.equals(testCPU)) && ((response.equals("N")) || (response.equals("n"))))
			System.out.println("You are incorrect!");
		else
			System.out.println("You are correct!");
		
		
	}
}