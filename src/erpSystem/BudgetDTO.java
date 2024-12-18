package erpSystem;

public class BudgetDTO {

	private final String department;	//부서명
	private final double allocated;		//할당예산
	private final double spent;			//사용예산
	private final double reamining;		//남은예산
	
	public BudgetDTO(String department, double allocated, double spent) {
		this.department = department;
		this.allocated = allocated;
		this.spent = spent;
		this.reamining = allocated - spent;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public double getAllocated() {
		return allocated;
	}
	
	public double getSpent() {
		return spent;
	}
	
	public double getRemaining() {
		return reamining;
	}
	
	@Override
	public String toString() {
		return String.format(
			"부서: %s, 할당 예산: %.2f, 사용된 예산: %.2f, 남은 예산: %.2f",
			department,allocated,spent,reamining
		);
	}
}
