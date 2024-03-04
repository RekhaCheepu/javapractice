package oop_interface;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh=new FortisHospital();
		fh.cardioServices();
		fh.physioServices();
		fh.neuroServices();
		fh.DentalServices();
		fh.ENTServices();
		fh.OrthoServices();
		fh.OrthoServices();
		fh.emargencySevices();
		
		USMedical us = new FortisHospital();
		us.cardioServices();
		us.emargencySevices();
		us.neuroServices();
		us.physioServices();
		System.out.println(fh.bill_amount);
		
		System.out.println(USMedical.bill_amount);
		
		fh.Bills();
		USMedical.medicalResults();
		FortisHospital.medicalResults();
		
		fh.physioServices(8);
		

	}

}
