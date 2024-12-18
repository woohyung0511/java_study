package erpSystem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Budget {

	private final String department; //부서명
	private final double allocateBudget; //할당예산
	private double spentBudget; //사용예산
	
    // TODO 1: 지출내역(변수명은 : expenditures) 에 대한 멤버변수 타입 지정해보기
	List<Expenditure> expenditures = new ArrayList<>();
	
	public Budget(String department, double allocateBudget) {
		if(allocateBudget <= 0) {
			throw new IllegalArgumentException("할당 얘선운 0보다 커야 합니다.");
		}
		
		this.department = department;
		this.allocateBudget = allocateBudget;
		this.spentBudget = 0.0;
	}
	
	public void recordExpenditure(String description, double amount) {
		if(amount <= 0) {
			throw new IllegalArgumentException("지출 금액은 0보다 커야 합니다.");
		}
		
		if(spentBudget + amount > allocateBudget) {
			throw new IllegalStateException("예산 초과 : 남은 예산은 " + getRemainingBudget() + " 입니다");
		}
		
		spentBudget += amount;
		
		// TODO <지출 히스토리 제한>
        // TODO 2: 각 부서의 지출 내역은 최근 5개까지만 유지되도록 구현하세요.
        // TODO 3: 새로운 지출이 추가되면 가장 오래된 기록은 자동으로 삭제되어야 합니다.
		if(expenditures.size() == 5) expenditures.remove(0);
		expenditures.add(new Expenditure(description, amount));
	}
	
	public BudgetDTO toDTO() {
		return new BudgetDTO(
			department,
			allocateBudget,
			spentBudget
		);
	}
	
	public List<ExpenditureDTO> getExpenditureSummary() {
		List<ExpenditureDTO> summary = new ArrayList<>();
		for(Expenditure expenditure : expenditures) {
			summary.add(expenditure.toDTO());
		}
		return summary;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public double getSpentBudget() {
		return spentBudget;
	}
	
	public double getRemainingBudget() {
		return allocateBudget - spentBudget;
	}
	
	public static class departmentComparator implements Comparator<Budget>{
		@Override
		public int compare(Budget o1, Budget o2) {
			return o1.getDepartment().compareTo(o2.getDepartment());
		}
	}
}
