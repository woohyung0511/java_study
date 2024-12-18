package erpSystem;

public class ExpenditureDTO {

	private final String description;
	private final double amount;
	
	public ExpenditureDTO(String description, double amount) {
		this.description = description;
		this.amount = amount;
	}
	
	public String getDescription() {
		return description;
	}
	
	public double getAmount() {
		return amount;
	}
	
	@Override
	public String toString() {
        return String.format("지출 내용: %s, 금액: %.2f", description, amount);
	}
}
