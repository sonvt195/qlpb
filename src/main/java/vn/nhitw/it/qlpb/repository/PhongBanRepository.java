package vn.nhitw.it.qlpb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.nhitw.it.qlpb.entity.PhongBanEntity;

/**
 * Created by sonvt on 01/02/19.
 */
@Repository
public interface PhongBanRepository extends JpaRepository<PhongBanEntity, Integer>{
}
