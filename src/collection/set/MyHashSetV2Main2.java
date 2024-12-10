package collection.set;

import collection.set.member.Member;

public class MyHashSetV2Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHashSetV2 set = new MyHashSetV2(10);
		Member hi = new Member("hi");
		Member jpa = new Member("JPA");
		Member java = new Member("java");
		Member spring = new Member("spring");
		
		System.out.println(hi.hashCode());
		System.out.println(jpa.hashCode());
		System.out.println(java.hashCode());
		System.out.println(spring.hashCode());
		
		set.add(hi);
		set.add(jpa);
		set.add(java);
		set.add(spring);
		
		System.out.println(set);
		
		Member searchValue = new Member("JPA");
		boolean result = set.contains(searchValue);
		System.out.println(searchValue + "," + result);

	}

}
