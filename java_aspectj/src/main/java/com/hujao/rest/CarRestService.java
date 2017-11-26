package com.hujao.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hujao.domainmodel.CarModel;
import com.hujao.domainservice.*;
import com.hujao.dto.CarVO;

@Service
@Path("/product")
public class CarRestService {

	@Autowired
	CarDomainService carDomainService;
	// http://localhost:8080/product/getcars
	@Path("/getcars")
	@GET
	@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
	public List<CarVO> getAll() {
		List<CarVO> list = new ArrayList();
		for (CarModel model : carDomainService.getAll()) {
			CarVO vo = new CarVO();
			vo.setCarName(model.getCarName());
			vo.setCarNumber(model.getCarNumber());
			vo.setManufacturedYear(model.getManufacturedYear());
			list.add(vo);
		}
		return list;
	}
}
