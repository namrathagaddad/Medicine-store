//Data Layer
package com.bl.chemitshop;

import java.util.List;
import java.util.ArrayList;

public class MedicineStore {

	private List medicineList = new ArrayList();
	
	public List getMedicineList() {
		return medicineList;
	}
	
	public void add(Medicine medicine) {
		medicineList.add(medicine);
	}
	
	public void remove(Medicine medicine) {
		medicineList.remove(medicine);
	}
}
