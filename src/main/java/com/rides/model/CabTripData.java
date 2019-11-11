package com.rides.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CabTripData {
	
	@Id
	private Long id;
	
	private String medallion;
	
	private String hackLicense ;
	
	private String vendorId;
	

	private Integer rateCode; 
	
	private String storeAndFwdFlag;
	

	private Date pickupDatetime; 
	

	private Date dropoffDatetime; 
	

	private Integer passengerCount ;
	

	private Integer tripTimeInSecs; 
	

	private Double tripDistance ;
	

	private Double pickupLongitude; 
	

	private Double pickupLatitude ;
	

	private Double dropoffLongitude; 
	

	private Double dropoffLatitude ;
	

}
