package kodlama.io.Rent_A_Real_Estate.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Rent_A_Real_Estate.business.abstracts.HouseService;
import kodlama.io.Rent_A_Real_Estate.dataAccess.abstracts.HouseRepository;
import kodlama.io.Rent_A_Real_Estate.entities.concretes.House;

@Service
public class HouseManager implements HouseService{

	private HouseRepository houseRepository;
	
	@Autowired
	public HouseManager(HouseRepository houseRepository) {
		this.houseRepository = houseRepository;
	}
	
	@Override
	public List<House> getAll() {
		
		return houseRepository.getAll();
	}
}