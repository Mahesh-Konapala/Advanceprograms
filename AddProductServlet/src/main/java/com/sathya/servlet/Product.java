package com.sathya.servlet;

//import java.io.InputStream;
import java.sql.Date;
//import java.util.Base64;

public class Product {
		
	private String proId;
	private String proName;
	private Float proPrice;
	private String proBrand;
	private String proMadeIn;
	private Date proMfgDate;
	private Date proExpDate;
	public String getProId() {
		return proId;
	}
	public void setProId(String proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public Float getProPrice() {
		return proPrice;
	}
	public void setProPrice(Float proPrice) {
		this.proPrice = proPrice;
	}
	public String getProBrand() {
		return proBrand;
	}
	public void setProBrand(String proBrand) {
		this.proBrand = proBrand;
	}
	public String getProMadeIn() {
		return proMadeIn;
	}
	public void setProMadeIn(String proMadeIn) {
		this.proMadeIn = proMadeIn;
	}
	public Date getProMfgDate() {
		return proMfgDate;
	}
	public void setProMfgDate(Date proMfgDate) {
		this.proMfgDate = proMfgDate;
	}
	public Date getProExpDate() {
		return proExpDate;
	}
	public void setProExpDate(Date proExpDate) {
		this.proExpDate = proExpDate;
	}
	public byte[] getProImage() {
		return proImage;
	}
	public void setProImage(byte[] proImage) {
		this.proImage = proImage;
	}
	public byte[] getProAudio() {
		return proAudio;
	}
	public void setProAudio(byte[] proAudio) {
		this.proAudio = proAudio;
	}
	public byte[] getProVideo() {
		return proVideo;
	}
	public void setProVideo(byte[] proVideo) {
		this.proVideo = proVideo;
	}
    private byte[] proImage;
	private byte[] proAudio;
	private byte[] proVideo;
	public void setProPrice(double double1) {
		
		
	}
}