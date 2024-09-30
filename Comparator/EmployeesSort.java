package Comparator;

import java.util.Comparator;

//public class EmployeesSort implements Comparable<EmployeesSort>{
	
public class EmployeesSort  {

	private String name;
	private String phone;
	private int empId;
	

	
	public EmployeesSort(String name, String phone, int empId) {
		super();
		this.name = name;
		this.phone = phone;
		this.empId = empId;
	}
	



	public String getName() {
		return name;
	}




	@Override
	public String toString() {
		return "EmployeesSort [name=" + name + ", phone=" + phone + ", empId=" + empId + "]";
	}


//@Override
//public int compareTo(EmployeesSort o) {
//	return this.empId-o.empId;
//}

	public void setName(String name) {
		this.name = name;
	}




	public String getPhone() {
		return phone;
	}




	public void setPhone(String phone) {
		this.phone = phone;
	}




	public int getEmpId() {
		return empId;
	}




	public void setEmpId(int empId) {
		this.empId = empId;
	}



}
