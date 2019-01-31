package vn.nhitw.it.qlpb.service;

import java.util.List;

import vn.nhitw.it.qlpb.entity.PhongBanEntity;

/**
 * Created by sonvt on 01/02/19.
 */
public interface PhongBanService {
	PhongBanEntity getPhongBanById(Integer PhongBanId);
    void savePhongBan(PhongBanEntity phongBanEntity);
    List<PhongBanEntity> getAllPhongBans();
}
