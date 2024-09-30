package Comparator;

import java.util.Comparator;

public class id_Comparator implements Comparator<EmployeesSort> {

	
	@Override
	public int compare(EmployeesSort o1, EmployeesSort o2) {
		return o1.getEmpId()-o2.getEmpId();
	}

}
