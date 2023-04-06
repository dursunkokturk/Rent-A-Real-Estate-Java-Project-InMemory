package kodlama.io.Rent_A_Real_Estate.entities.concretes;

public class House {
	private int id;
	private String name;
	
	public House() {
		
	}

	public House(int id,String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}