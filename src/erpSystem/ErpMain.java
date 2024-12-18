package erpSystem;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ErpMain {
	
	private static final BudgetService service = new BudgetService();
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while(true) {
			System.out.println("\n=== 예산-지출 관리 시스템 ===");
            System.out.println("1. 예산 등록");
            System.out.println("2. 예산 조회");
            System.out.println("3. 지출 등록");
            System.out.println("4. 지출 내역 조회");
            System.out.println("5. 최다 지출부서 조회");
            System.out.println("6. 종료");
            System.out.print("선택: ");
            
            try {
				int choice = scanner.nextInt();
				switch(choice) {
					case 1: registerBudget(); break;
					case 2: displayAllBudgets(); break;
	                case 3: registerExpenditure(); break;
	                case 4: displayExpenditureSummary(); break;
	                case 5: displayMaxExpenditureDepartment(); break;
	                case 6: System.out.println("시스템 종료."); return;
	                default: System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
				}
			} catch (InputMismatchException e) {
				System.out.println("입력 오류 : 숫자를 입력 해주세요");
				scanner.nextLine();
			} catch (Exception e) {
				System.out.println("오류 : " + e.getMessage());
			}
		}
	}
	
	private static void registerBudget() {
		try {
			System.out.print("부서명: ");
            String department = scanner.next();
            System.out.print("할당 예산: ");
            double amount = scanner.nextDouble();

            service.registerBudget(department, amount);
		} catch (InputMismatchException e) {
			System.out.println("입력 오류 : 숫자를 입력해 주세요.");
			scanner.nextLine();
		} catch (Exception e) {
			System.out.println("오류 : " + e.getMessage());
		}
	}
	
	private static void displayAllBudgets() {
		List<BudgetDTO> budgetList = service.getAllBudgets();
		if(budgetList.isEmpty()) {
			System.out.println("등록된 예산이 없습니다.");
			return;
		}
		budgetList.forEach(System.out::println);
	}
	
	private static void registerExpenditure() {
		try {
			System.out.print("부서명: ");
            String department = scanner.next();
            System.out.print("지출 내용: ");
            String description = scanner.next();
            System.out.print("지출 금액: ");
            double amount = scanner.nextDouble();

            service.recordExpenditure(department, description, amount);
		} catch (InputMismatchException e) {
			System.out.println("입력 오류 : 숫자를 입력해 주세요.");
            scanner.nextLine();
		} catch (Exception e) {
			System.out.println("오류 : " + e.getMessage());
		}
	}
	
	private static void displayExpenditureSummary() {
		try {
			System.out.println("조회할 부서명 : ");
			String department = scanner.next();
            // TODO 지출요약 정보를 출력해보기
			service.getExpenditures(department);
		} catch (Exception e) {
			System.out.println("오류 : " + e.getMessage());
		}
	}
	
	private static void displayMaxExpenditureDepartment() {
		service.getTopSpendingDepartment();
	}
}
