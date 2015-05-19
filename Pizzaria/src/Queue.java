import java.util.LinkedList;
	
public class Queue extends LinkedList<Double> {
	


	/**
	 * 
	 */
	// I think we need to fill this queue one by one, not entering all at once.
	// Then we can have another queue with all data, so we can pull from there next arrival and departure.
	// It's simple to have the state of the system this way, based on the last entered client
	// Or we can have a system based on client index, tracking the actual status in a variable...


	    int serverStatus = 0;
	    
	    @Override
	    public boolean add(Double d) {
	        System.out.println("Adicionando cliente " + (size() + 1) + " com horário " + d + "à fila de pagamento.");
	        return super.add(d);
	    }
	    
	    @Override
	    public Double removeFirst() {
	        System.out.println("Removendo cliente com horário " + getFirst() + " da fila de pagamento.");
	        return super.removeFirst();
	    }
	    
	    public int getNumberInQueue() {
	        return size();
	    }
	    
	    public void getTimesOfArrival() {
	        while (listIterator().hasNext()) {
	            System.out.println("Tempo de chegada de cliente: " + listIterator().nextIndex() + " " + listIterator().next());    
	        }
	    }
	    
	    public double getTimeOfLastEvent() {
	        return getLast();
	    }
	    
	    public double getClock() {
	        return getLast();
	    }
	    
	    // Event list
	    
	    // Get next arrival by queue index or time? dunno
	    // Example getNextArrival(int index) or getNextArrival(double d)
	    public double getNextArrival() {
	        
	    }
	    
	    // Same case as next arrival... need to figure out how to get it
	    public double getNextDeparture() {
	        
	    }
	    
	    // Statistical counters
	    public int getNumberDelayed() {
	        
	    }
	    
	    public double getTotalDelay() {
	        
	    }
	    
	    public double getAreaUnderQ() {
	        
	    }

	    public double getAreaUnderB() {
	        
	    }
}


