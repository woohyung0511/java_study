package pay;

import java.sql.Date;

public class Attendance {
	protected String empId;
	protected Date absentDate;
	protected String absentYn;
	
	public Attendance(String empId, Date absentDate, String absentYn) {
		this.empId = empId;
		this.absentDate = absentDate;
		this.absentYn = absentYn;
	}
}
