package com.example.demo.hotel.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	private Long  roomNo;
	private String name;
	private String address;
	private Long  mobile;
	public Long getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(Long roomNo) {
		this.roomNo = roomNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public Customer(Long roomNo, String name, String address, Long mobile) {
		super();
		this.roomNo = roomNo;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
	}
	
	public Customer() {
		super();
	}
	@Override
	public String toString() {
		return "Customer [roomNo=" + roomNo + ", name=" + name + ", address=" + address + ", mobile=" + mobile + "]";
	}
	

}
