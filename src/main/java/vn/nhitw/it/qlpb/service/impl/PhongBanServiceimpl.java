package vn.nhitw.it.qlpb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.nhitw.it.qlpb.entity.PhongBanEntity;
import vn.nhitw.it.qlpb.repository.PhongBanRepository;
import vn.nhitw.it.qlpb.service.PhongBanService;

/**
 * Created by sonvt on 01/02/19.
 */
@Service
public class PhongBanServiceimpl implements PhongBanService {
	@Autowired
	PhongBanRepository phongBanRepository;

	@Override
	public PhongBanEntity getPhongBanById(Integer userId) {
		return phongBanRepository.getOne(userId);
	}

	@Override
	public void savePhongBan(PhongBanEntity phongBanEntity) {
		phongBanRepository.save(phongBanEntity);
	}

	@Override
	public List<PhongBanEntity> getAllPhongBans() {
		return phongBanRepository.findAll();
	}
}
