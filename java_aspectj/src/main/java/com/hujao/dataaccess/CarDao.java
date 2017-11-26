package com.hujao.dataaccess;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hujao.po.*;


@Service
public class CarDao {
	public List<CarInfo> getAll()
	{
		List<CarInfo>list=new ArrayList();
		CarInfo car=new CarInfo();
				car.setCarName("BMW");
		car.setCarNumber("LG00123");
		car.setManufacturedYear(1999);;
		list.add(car);
		car=new CarInfo();
		car.setCarName("Hoda");
		car.setCarNumber("SH00321");
		car.setManufacturedYear(2015);;
		list.add(car);
		return list;
	}
}
