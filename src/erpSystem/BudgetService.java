package erpSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BudgetService {

    // TODO 1 아래 코드를 보고 budgets이라는 명칭의 멤버변수 타입을 지정해보세요
	Map<String, Budget> budgets = new HashMap<>();
	
	public void registerBudget(String department, double allocatedBudget) {
		budgets.put(department, new Budget(department, allocatedBudget));
		System.out.println("예산이 등록되었습니다 : " + department);
	}
	
	public BudgetDTO getBudget(String department) {
		Budget budget = findBudget(department);
		return budget.toDTO();
	}
	
	public List<BudgetDTO> getAllBudgets() {
		List<BudgetDTO> budgetList = new ArrayList<>();
		
		budgets.values()
			   .forEach(budget -> budgetList.add(budget.toDTO()));
		
		return budgetList;
	}
	
	public void recordExpenditure(String department, String description, double amount) {
		Budget budget = findBudget(department);
		budget.recordExpenditure(description, amount);
		
		System.out.println("지출이 등록되었습니다.");
	}
	
	// TODO findBudget과 getExpendituresSummary 사용하여
    // getExpenditures 메서드 작성 -> 특정 부서의 지출 내역 조회 (최대 5개)
	public void getExpenditures(String department) {
		List<ExpenditureDTO> expenditureList = findBudget(department).getExpenditureSummary();
		
		if(expenditureList.isEmpty()) {
			System.out.println("등록된 지출이 없습니다.");
		}else {
			expenditureList.forEach(System.out::println);
		}
	}

    // TODO 최다 지출 부서 조회메서드 나머지 작성
	public void getTopSpendingDepartment() {
		if(budgets.isEmpty()) {
			System.out.println("등록된 예산이 없습니다.");
			return;
		}
		
		Budget maxExpenditure = null;
		Budget.departmentComparator comparator = new Budget.departmentComparator();
		
		for(Budget budget : budgets.values()) {
			if(maxExpenditure == null || budget.getSpentBudget() > maxExpenditure.getSpentBudget() ||
				(budget.getSpentBudget() == maxExpenditure.getSpentBudget() &&
				comparator.compare(budget, maxExpenditure) < 0)) {
				maxExpenditure = budget;
			}
		}
		
        System.out.println("최다 지출부서: " + maxExpenditure.getDepartment());
	}
	
	public double getRemainingBudget(String department) {
		Budget budget = findBudget(department);
		return budget.getRemainingBudget();
	}
	
	private Budget findBudget(String department) {
		if(!budgets.containsKey(department)) {
			throw new IllegalArgumentException("해당 부서 예산이 존재하지 않습니다 : " + department);
		}
		return budgets.get(department);
	}
}
