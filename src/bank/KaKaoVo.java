package bank;

public class KaKaoVo {

	private String name;
	private String cardNo;
	private int age;
	
	public KaKaoVo(String name, String cardNo, int age) {
		this.name = name;
		this.cardNo = cardNo;
		this.age = age;
	}
	
	@Override
	public String toString() {
	    return "KaKaoVo{name='" + name + "', cardNo='" + cardNo + "', age=" + age + "}";
	}

}
