package Comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<EmployeesSort> {

	@Override
	public int compare(EmployeesSort o1, EmployeesSort o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

}
