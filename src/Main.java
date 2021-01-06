import java.util.Random;

public class Main {
	
	public static void main(String[] args)
	{
		final int N_RUNS = 1;
	    final int N_STATIONS = 5;
	    System.out.printf("A Commuter-car-sharing simulation: %d runs.\n\n", N_RUNS);
	      
	      
	    for (int i = 0; i < N_RUNS; i++)
	    {
	    	Simulation sim = new Simulation(new Random(42));
	        sim.loadRandomScenario(N_STATIONS); 
	        sim.driveAllCars();
	         
	     } 
	    System.out.printf("------------- Commuter-car-sharing simulation done ----------\n");
	}
}
