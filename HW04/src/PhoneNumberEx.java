//2071032_ComputerScienceEngineering_YoonJiWon
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;
public class PhoneNumberEx {
	public static void main(String[] args) {
		Hashtable<String, AddressNum> ppl = new Hashtable<String, AddressNum>(); 
		//use names as a key to the HashTable && at AddressNum - save address, phone number, and current state
		Scanner s = new Scanner(System.in);
		boolean toggle = true; //while menu input != 4, the toggle stays true
		print_first(); //method to print the first paragraph of the program
		while(toggle) {
			print_menu(); //method to print the menus
			int x = s.nextInt(); //scan a integer with scanner
			s.nextLine();
			switch(x) {
			case 0: //insert
				System.out.println("이름>>");
				String name0 = s.next();
				if(ppl.containsKey(name0))// if the key is already in
					System.out.println("이미 존재하는 사람입니다.");
				else { //get address & phone number
					System.out.println("주소>>");
					String add = s.next();
					System.out.println("전화번호>>");
					String number = s.next();
					AddressNum temp = new AddressNum(add,number); //새로운 객체 temp를 생성
					ppl.put(name0, temp);//put name0 = key & temp = value in the hashtable
				}
				break;
			case 1: //delete
				System.out.println("이름>>");
				String name1 = s.next();
				if(ppl.containsKey(name1)) {//if key exist
					ppl.remove(name1);//delete key & value from the hashtable
					System.out.println(name1+ "님은 삭제되었습니다.");
				}
				else // if the key does not exist
					System.out.println("등록되지 않은 사람입니다.");
				break;
			case 2: //find
				System.out.println("이름>>");
				String name2 = s.next();
				if(ppl.containsKey(name2)) {//if key exist
					System.out.println(name2 +" "+ ppl.get(name2).address +" "+ ppl.get(name2).phoneNumber);
				}
				else // if the key does not exist
					System.out.println("등록되지 않은 사람입니다.");
				break;
			case 3: //view_all
				Set<String> keys = ppl.keySet(); //get keys of ppl hashtable
				Iterator<String> it = keys.iterator(); //make a interator from the set of keys
				while(it.hasNext()) { //print name, address, phone number
					String name3 = it.next();
					System.out.println(name3 +" "+ ppl.get(name3).address +" "+ ppl.get(name3).phoneNumber);
				}
				break;
			case 4: //break
				toggle = false; //if toggle == false, then we break the while loop
			}
		}
		s.close();
	}
	public static void print_first() { //very first paragraph we need to print
		System.out.println("----------------------------------------------------------");
		System.out.println("* 전화번호 관리 프로그램 *");
		System.out.println("----------------------------------------------------------");
	}
	public static void print_menu() { //method for printing the menus
		System.out.println("삽입:0, 삭제:1, 찾기:2, 전체보기:3, 종료:4>>");
	}
}
