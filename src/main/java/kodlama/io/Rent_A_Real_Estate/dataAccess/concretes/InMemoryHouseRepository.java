package kodlama.io.Rent_A_Real_Estate.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Rent_A_Real_Estate.dataAccess.abstracts.HouseRepository;
import kodlama.io.Rent_A_Real_Estate.entities.concretes.House;

@Repository
public class InMemoryHouseRepository implements HouseRepository{

	List<House> houses;
	
	public InMemoryHouseRepository() {
		houses = new ArrayList<House>();
		houses.add(new House(1, "Apartment"));
		houses.add(new House(2, "Detected House"));
	}
	
	@Override
	public List<House> getAll() {
		return houses;
	}
}