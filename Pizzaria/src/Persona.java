
public class Persona {
	
	private int id;											//Unique ID, continuous: 1,2,3,4...n
	private String status;									//Status of the Client: In Queue, Eating  	//Status of the Server: Busy or Free
	private String queue;									//Wich queue the Client is in?				//Wich queue the Server attends
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getQueue() {
		return queue;
	}
	
	public void setQueue(String queue) {
		this.queue = queue;
	}
	
}
