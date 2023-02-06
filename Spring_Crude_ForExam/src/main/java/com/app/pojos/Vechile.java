package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.*;
@Entity
@Table(name = "vechile")
public class Vechile extends BaseEntity {
	@Column(name="VechileNo",length=20,unique=true)
	private String vechileNo;
	private String vModel;
	private String vMake;
	@Column(name="Date")
	private LocalDate manifactureDate;
	@Column(name="CC")
	private int cc;
	@Column(name="Price")
	private double price;
	
	public Vechile() {
		super();
	}
	
	public Vechile(String vechileNo, String vModel, String vMake, LocalDate manifactureDate, int cc, double price) {
		super();
		this.vechileNo = vechileNo;
		this.vModel = vModel;
		this.vMake = vMake;
		this.manifactureDate = manifactureDate;
		this.cc = cc;
		this.price = price;
	}
	public String getVechileNo() {
		return vechileNo;
	}
	public void setVechileNo(String vechileNo) {
		this.vechileNo = vechileNo;
	}
	public String getvModel() {
		return vModel;
	}
	public void setvModel(String vModel) {
		this.vModel = vModel;
	}
	public String getvMake() {
		return vMake;
	}
	public void setvMake(String vMake) {
		this.vMake = vMake;
	}
	public LocalDate getManifactureDate() {
		return manifactureDate;
	}
	public void setManifactureDate(LocalDate manifactureDate) {
		this.manifactureDate = manifactureDate;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Vechile [vechileNo=" + vechileNo + ", vModel=" + vModel + ", vMake=" + vMake + ", manifactureDate="
				+ manifactureDate + ", cc=" + cc + ", price=" + price + "]";
	}
	
	
}
	
	