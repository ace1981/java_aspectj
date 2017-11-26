package com.hujao.domainservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hujao.dataaccess.CarDao;
import com.hujao.domainmodel.CarModel;
import com.hujao.po.CarInfo;

@Service
public class CarDomainService {
	@Autowired CarDao carDao;
	public List<CarModel>getAll()
	{
		List<CarModel>list=new ArrayList();
		for(CarInfo car :carDao.getAll())
		{
			CarModel model=new CarModel();
			model.setCarName(car.getCarName());
			model.setCarNumber(car.getCarNumber());
			model.setManufacturedYear(car.getManufacturedYear());
			list.add(model);
		}
		return list;
	}
}
