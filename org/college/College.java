package org.college;

public class College {

	public void colgName() {
		System.out.println("College Name is Adhiyamaan college of engineering");
	}
	public void colgCode() {
		System.out.println("College code is 1267");
	}
	public void colgRank() {
		System.out.println("College Rank is 25");
	}
	
	public static void main(String[] args) {
		College clg =new College();
		clg.colgName();
		clg.colgCode();
		clg.colgRank();
		Student st=new Student();
		st.stName();
		st.stDept();
		st.stId();
		Hostel ht= new Hostel();
		ht.hostelName();
		Dept dp=new Dept();
		dp.deptName();
	}
}
