package keerthana;



public class Pc {
	protected String cpu;
	protected String monitor;
	protected String mouse;
	protected Integer ram;
	private String integrated;
	
	public Pc() {
		this.integrated = integrated;


	}


	
	public Pc(String cpu){
		this.cpu=cpu;
		System.out.println("ordered cpu:" +cpu);
	}
	
	public Pc(String monitor, String mouse) {
	
		this.monitor = monitor;
		this.mouse = mouse;
		//System.out.println("ordered monitor : " +monitor);
		//System.out.println("ordered mouse : " + mouse);
	}
		
	public String cpuandram(Integer ram, String cpu) {
		this.cpu= cpu;
		this.ram= ram;
		//System.out.println("ordered cpu: " + cpu);
		//System.out.println("ordered ram: " + ram);
		this.monitor = null;
        this.mouse = null;
        return "ordered cpu :"+cpu + "\n" +"ordered ram :" + ram;
	}
	
	public String getIntegrated() {
		return this.integrated;
		
	}
	public void setIntegrated(String integrated) {
		this.integrated=integrated;
	}
	
	
	
}