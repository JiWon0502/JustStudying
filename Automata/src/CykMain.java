import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
 
public class CykMain {
	public static int ruleCnt = 0;
	//HashMap의 key값 = String, value값 = String array
	private static HashMap<String, ArrayList<String>> ruleMap = new HashMap<String, ArrayList<String>>();
	private static String w;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("규칙의 개수를 입력하세요=>");
		ruleCnt = sc.nextInt(); //gets the number of rules
		sc.nextLine();
		System.out.println(ruleCnt + "개의 규칙을 입력하세요");

		for(int i = 0 ; i<ruleCnt; i++) {
			String lnstr = sc.nextLine(); //gets one rule
			String[] str = lnstr.split(">"); //split the string by '>'
			if(str.length == 2) { //String이 > 기준으로 2개로 나눠진 것이 각자 배열처럼 저장됨
				String key = str[1]; //우변을 key로 저장하므로 str[0]이 아닌 str[1]을 저장
				ArrayList<String> lst = ruleMap.get(key.trim());
				if(lst == null) { // 이전에 같은 key가 입력된 적 없는 경우
					lst = new ArrayList<String>();
					lst.add(str[0].trim());//add str[0] to the list of values
					ruleMap.put(key, lst); //새로운 key, value를 넣는다
				}
				else lst.add(str[0].trim()); //key가 있는 경우 add var to the rule
			}
			else { //error handle
				System.out.println("다시 입력하세요");
				i--;
			}
		}
		//key값을 정수로 정한 HashMap - key값은 makeKey메소드에서 생성
		HashMap<Integer, ArrayList<String>> parseVarMap = new HashMap<Integer, ArrayList<String>>();
		System.out.println("\n멤버 확인이 필요한 문자열을 입력하세요.");
		w = sc.nextLine().trim();//입력받고, 공백 제거하기
		int wlen = w.length();

		for(int len=1; len<=wlen; len++){ //길이를 하나씩 증가 
			for(int i=1, j=len; j<=wlen; i++, j++){ //길이에 따라 한 줄의 각 셀에 들어갈 수 있도록 j만 증가시키며 V(i,j)구하기
				Integer newkey = makeKey(i,j,wlen);
				ArrayList<String> newVars = new ArrayList<String>(); //V(i,j)
				if(len == 1){ //즉, 11 22 33 44 55...인 경우
					String findkey = w.substring(i-1, i); //심볼 추출
					ArrayList<String> ruleVar = ruleMap.get(findkey); //심볼을 갖고 있는 변수 찾기 
					if(ruleVar != null && !ruleVar.isEmpty()){
						for(String var : ruleVar){
							newVars.add(var);
						}
						parseVarMap.put(newkey, newVars);
					}
					continue;
				}
				else {
					for(int k = i; k<j; k++) {//V(i,k)+ V(k+1,j)의 형태 찾기
						Integer key1 = makeKey(i, k, wlen); //매핑시키기 위해서 key를 새로 생성하는 메소드 사용
						Integer key2 = makeKey(k+1, j, wlen); //동일하게 key 생성
						//V(i,k) ,  V(k+1,j)
						for(String var1 : parseVarMap.get(key1)) { //key1에 대한 value, key2에 대한 value 전부 차례대로 가져와서 검사
							for(String var2 : parseVarMap.get(key2)) {
								String findkey = var1 + var2;//key 값을 찾는다
								ArrayList<String> ruleVar = ruleMap.get(findkey); //key값에 맞는 value 찾기
								if(ruleVar != null && !ruleVar.isEmpty()) {
									for(String var : ruleVar) {
										if(!newVars.contains(var)) newVars.add(var); //없는 key값인 경우 add
									}
									parseVarMap.put(newkey, newVars);//찾은 변수들 집어넣음
								}
							}
						}
						parseVarMap.put(newkey, newVars);//마지막에도 찾은 변수들 집어넣음
					}
				}
			}
		}
		//to find out if whether S is in the last
		Integer lastkey = makeKey(1, wlen, wlen); //last key값을 만들어준다
		boolean bAccept = false;
		for(String var: parseVarMap.get(lastkey)) { //lastkey값의 값 중 하나 이상이 S를 포함하는지 확인
			if(var.contains("S")){
				bAccept = true;
				break;//하나 이상만 포함해도 되므로 바로 break;
			}
		}
		//lastkey값의 값 중 하나 이상이 S를 포함하면 Accept
		if(bAccept) System.out.println("Accept");
		//S가 없으면 start variable에서 시작해서 끝을 볼 수 있는 방법이 없는 것이므로 Reject
		else System.out.println("Reject");
		sc.close();
	}
	//to make (i,j) key
	private static int makeKey(int i , int j, int len) {
		int key = (i*len)+j; //임의로 unique한 key값을 만들 수 있는 연산 사용
		return key;
	}
}
