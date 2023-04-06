package kodlama.io.Rent_A_Real_Estate.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Rent_A_Real_Estate.business.abstracts.HouseService;
import kodlama.io.Rent_A_Real_Estate.entities.concretes.House;

@RestController
@RequestMapping("/api/houses")
public class HousesController {
	private HouseService houseService;
	
	@Autowired
	public HousesController(HouseService houseService) {
		this.houseService = houseService;
	}
	
	@GetMapping("/getall")
	public List<House> getAll(){
		return houseService.getAll();
	}
}