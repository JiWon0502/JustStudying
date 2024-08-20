
public class MemberEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member[] members = new Member[5];
		members[0] = new Member(1, "spring", "김보미");
		members[1] = new Member(2, "cider", "이시원");
		members[2] = new Member(3, "park", "박세리");
		members[3] = new Member(4,"lee", "이상혁");
		members[4] = new Member(5,"kim", "김이화");
		
		for(int i = 0; i <members.length; i++) {
			System.out.printf("%d번 회원 아이디:%s, 이름:%s\n",members[i].no, members[i].id, members[i].name);
		}
	}	

}
