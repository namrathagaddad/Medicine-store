//Controller layer

package com.bl.chemitshop;

import java.util.Date;
import java.util.List;

public class Application {
	
	public static void main(String[] args) {
		Crocin crocin = new Crocin();
		crocin.mfgDate = new Date("28/06/2020");
		crocin.expDate = new Date("28/09/2025");
		
		GluconD gluconD = new GluconD();
		gluconD.mfgDate = new Date("29/08/2020");
		gluconD.expDate = new Date("29/09/2025");
		
		Dolo650 dolo650 = new Dolo650();
		dolo650.mfgDate = new Date("24/06/2020");
		dolo650.expDate = new Date("24/08/2024");
		
		Aciloc aciloc = new Aciloc();
		aciloc.mfgDate = new Date("23/07/2020");
		aciloc.expDate = new Date("25/06/2022");
		
		Disprin disprin = new Disprin();
		disprin.mfgDate = new Date("23/06/2020");
		disprin.expDate = new Date("24/05/2023");
		
		Natrumur natrumur = new Natrumur();
		natrumur.mfgDate = new Date("29/02/2020");
		natrumur.expDate = new Date("21/10/2023");
		
		MedicineStore medicineStore = new MedicineStore();
		
		medicineStore.add(crocin);
		medicineStore.add(gluconD);
		medicineStore.add(dolo650);
		medicineStore.add(aciloc);
		medicineStore.add(disprin);
		medicineStore.add(natrumur);
		
		Userinterface userInterface = new Userinterface();
		//userInterface.print(medicineStore.getMedicineList());
		List medicineList = medicineStore.getMedicineList();
		userInterface.print(medicineList);
		
		medicineStore.remove(crocin);
		medicineStore.remove(gluconD);
		
		System.out.println("Printing after removal: ");
		userInterface.print(medicineList);
		System.out.println("Printing HOMEOPATHY medicine: ");
		userInterface.print(medicineList);
		System.out.println("Printing ALLOPATHY medicine: ");
		userInterface.print(medicineList);
		System.out.println("Printing after removal: ");
	}
}
