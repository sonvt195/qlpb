package vn.nhitw.it.qlpb.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DM_PHONGBAN")
public class PhongBanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "phongban_id")
	private Integer id;
	
	@Column(name = "maphongban")
	private String maPhongBan;
	
	@Column(name = "tenphongban")
	private String tenPhongBan;
	
	@Column(name = "tenphongban_en")
	private String tenPhongBanEn;
	
	@Column(name = "tenphongban_ru")
	private String tenPhongBanRu;
	
	@Column(name = "loaiphongban_id")
	private Integer loaiPhongBanId;
	
	@Column(name = "cap")
	private Integer cap;
	
	@Column(name = "captren_id")
	private Integer capTrenId;
	
	@Column(name = "truongphong")
	private String truongPhong;
	
	@Column(name = "loaiphongbenh_id")
	private Integer loaiPhongBenhId;
	
	@Column(name = "tamngung")
	private Boolean tamNgung;
	
	@Column(name = "tenkhongdau")
	private String tenKhongDau;
	
	@Column(name = "ngaytao")
	private Date ngayTao;
	
	@Column(name = "nguoitao")
	private String nguoiTaoId;
	
	@Column(name = "ngaycapnhat")
	private Date ngayCapNhat;
	
	@Column(name = "nguoicapnhat_id")
	private String nguoiCapNhatId;
	
	@Column(name = "cothuchiendichvu")
	private Boolean coThucHienDichVu;
	
	@Column(name = "idx")
	private Integer iDx;
	
	@Column(name = "quanlynhansu")
	private Boolean quanLyNhanSu;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMaPhongBan() {
		return maPhongBan;
	}

	public void setMaPhongBan(String maPhongBan) {
		this.maPhongBan = maPhongBan;
	}

	public String getTenPhongBan() {
		return tenPhongBan;
	}

	public void setTenPhongBan(String tenPhongBan) {
		this.tenPhongBan = tenPhongBan;
	}

	public String getTenPhongBanEn() {
		return tenPhongBanEn;
	}

	public void setTenPhongBanEn(String tenPhongBanEn) {
		this.tenPhongBanEn = tenPhongBanEn;
	}

	public String getTenPhongBanRu() {
		return tenPhongBanRu;
	}

	public void setTenPhongBanRu(String tenPhongBanRu) {
		this.tenPhongBanRu = tenPhongBanRu;
	}

	public Integer getLoaiPhongBanId() {
		return loaiPhongBanId;
	}

	public void setLoaiPhongBanId(Integer loaiPhongBanId) {
		this.loaiPhongBanId = loaiPhongBanId;
	}

	public Integer getCap() {
		return cap;
	}

	public void setCap(Integer cap) {
		this.cap = cap;
	}

	public Integer getCapTrenId() {
		return capTrenId;
	}

	public void setCapTrenId(Integer capTrenId) {
		this.capTrenId = capTrenId;
	}

	public String getTruongPhong() {
		return truongPhong;
	}

	public void setTruongPhong(String truongPhong) {
		this.truongPhong = truongPhong;
	}

	public Integer getLoaiPhongBenhId() {
		return loaiPhongBenhId;
	}

	public void setLoaiPhongBenhId(Integer loaiPhongBenhId) {
		this.loaiPhongBenhId = loaiPhongBenhId;
	}

	public Boolean getTamNgung() {
		return tamNgung;
	}

	public void setTamNgung(Boolean tamNgung) {
		this.tamNgung = tamNgung;
	}

	public String getTenKhongDau() {
		return tenKhongDau;
	}

	public void setTenKhongDau(String tenKhongDau) {
		this.tenKhongDau = tenKhongDau;
	}

	public Date getNgayTao() {
		return ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	public String getNguoiTaoId() {
		return nguoiTaoId;
	}

	public void setNguoiTaoId(String nguoiTaoId) {
		this.nguoiTaoId = nguoiTaoId;
	}

	public Date getNgayCapNhat() {
		return ngayCapNhat;
	}

	public void setNgayCapNhat(Date ngayCapNhat) {
		this.ngayCapNhat = ngayCapNhat;
	}

	public String getNguoiCapNhatId() {
		return nguoiCapNhatId;
	}

	public void setNguoiCapNhatId(String nguoiCapNhatId) {
		this.nguoiCapNhatId = nguoiCapNhatId;
	}

	public Boolean getCoThucHienDichVu() {
		return coThucHienDichVu;
	}

	public void setCoThucHienDichVu(Boolean coThucHienDichVu) {
		this.coThucHienDichVu = coThucHienDichVu;
	}

	public Integer getiDx() {
		return iDx;
	}

	public void setiDx(Integer iDx) {
		this.iDx = iDx;
	}

	public Boolean getQuanLyNhanSu() {
		return quanLyNhanSu;
	}

	public void setQuanLyNhanSu(Boolean quanLyNhanSu) {
		this.quanLyNhanSu = quanLyNhanSu;
	}
		
}
