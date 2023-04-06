package kodlama.io.Rent_A_Real_Estate.business.abstracts;

import java.util.List;

import kodlama.io.Rent_A_Real_Estate.entities.concretes.House;

public interface HouseService {
	List<House> getAll();
}