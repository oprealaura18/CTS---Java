package clase;

public class Zookeeper {
	private String name;
	
	
	
	public Zookeeper(String name) {
		super();
		this.name = name;
	}

	public Zookeeper() {
		
		
	}


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}






	public void feed(Animal a) {
		System.out.println(name + " hraneste animalul "+ a.getName());
	}

}
