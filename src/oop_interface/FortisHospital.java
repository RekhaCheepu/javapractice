package oop_interface;

public class FortisHospital extends Medical implements USMedical,UKMedical,IndianMedical{
	
	int bill_amount=100;

	@Override
	public void physioServices() {
		System.out.println("FortisHospital--physioServices");
		
		
	}

	@Override
	public void neuroServices() {
		System.out.println("FortisHospital--neuroServices");
		
		
	}

	@Override
	public void cardioServices() {
		System.out.println("FortisHospital--cardioServices");
		
		
	}

	@Override
	public void ENTServices() {
		System.out.println("FortisHospital--ENTServices");
		
		
	}

	@Override
	public void PediaServices() {
		System.out.println("FortisHospital--PediaServices");
		
		
	}

	@Override
	public void DentalServices() {
		System.out.println("FortisHospital--DentalServices");
		
	}

	@Override
	public void OrthoServices() {
		
		System.out.println("FortisHospital--OrthoServices");
	}

	@Override
	public void emargencySevices() {
		System.out.println("FortisHospital--emargencySevices");
		
	}
	public void medicalTraining() {
		System.out.println("FortisHospital--medicalTraining");	
	}
	public void medicalBills() {
		System.out.println("FortisHospital--medicalBills");	
	}

	@Override
	public void medicalFund() {
		System.out.println("UsMedical--medicalfund");
		
		
	}

	@Override
	public void covidVaccination() {
		System.out.println("WHO --covid vaccination");
		
	}
	public static void medicalResults() {
		System.out.println("FH-- medical results");
	}
	public void Bills() {
		System.out.println("fh-- medical bills");
		
	}

	@Override
	public void physioServices(int i) {
		System.out.println("USmedical physioServices param1");
		
	}

	@Override
	public void physioServices(int i, int p) {
		System.out.println("USmedical physioServices param12");
		
	}

}
