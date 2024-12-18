package erpSystem;

public class Expenditure {

	private final String description;
	private final double amount;
	
	public Expenditure(String description, double amount) {
		if(description == null || description.trim().isEmpty()) {
			throw new IllegalArgumentException("지출 내용은 비어 있을 수 없습니다.");
		}
		
		if(amount <= 0) {
			throw new IllegalArgumentException("지출 금액은 0보다 커야 합니다.");
		}
		
		this.description = description;
		this.amount = amount;
	}
	
	public ExpenditureDTO toDTO() {
		return new ExpenditureDTO(description, amount);
	}
	
	public double getAmount() {
		return amount;
	}
	
	@Override
	public String toString() {
        return String.format("지출 내용: %s, 금액: %.2f", description, amount);
	}
}
