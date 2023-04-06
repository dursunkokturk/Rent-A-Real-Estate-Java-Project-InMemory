package kodlama.io.Rent_A_Real_Estate.dataAccess.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Rent_A_Real_Estate.entities.concretes.House;

@Repository
public interface HouseRepository {
	List<House> getAll();
}