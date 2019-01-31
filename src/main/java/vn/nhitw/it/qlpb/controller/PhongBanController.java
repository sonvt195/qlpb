package vn.nhitw.it.qlpb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.nhitw.it.qlpb.entity.PhongBanEntity;
import vn.nhitw.it.qlpb.service.PhongBanService;
import vn.nhitw.it.qlpb.utils.Constants;
@Controller
public class PhongBanController {
	@Autowired
	PhongBanService phongBanService;
	
	@RequestMapping("/home")
	public String home() {
		return "index";
	}
	
	@RequestMapping(Constants.GET_USER_BY_ID)
	public PhongBanEntity getUserById(@PathVariable Integer phongBanId) {
		return phongBanService.getPhongBanById(phongBanId);
	}
	
	@RequestMapping(Constants.GET_ALL_USERS)
	public List<PhongBanEntity> getAllUsers() {
		return phongBanService.getAllPhongBans();
	}
}
