import java.util.*;

class Phone{
	private String name;
	private String address;
	private String telNum;
	
	public Phone(String name, String address, String telNum){
		this.name = name;
		this.address = address;
		this.telNum = telNum;
	}
	
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public String getTelNum(){
		return telNum;
	}
	
	public String toString(){
		return name + " " + address + " " + telNum;
	}
}

public class PhoneBookApp {
	public static final int INSERT = 0;
	public static final int DELETE = 1;
	public static final int UPDATE = 2;
	public static final int SEARCH = 3;
	public static final int SHOWALL = 4;
	public static final int EXIT = 5;
	
	private Scanner scanner;
	private HashMap<String, Phone> map = new HashMap<String, Phone>();
	
	public PhoneBookApp(){
		scanner = new Scanner(System.in);
	}
	
	public void run(){
		System.out.println("---------------------------------------------------");
		System.out.println("전화 번호 관리 프로그램을 시작합니다. 파일로 저장하지 않습니다.");
		System.out.println("---------------------------------------------------");
		while(true){
			System.out.print("삽입:0, 삭제:1, 수정:2, 찾기:3, 전체보기:4, 종료:5>>");
			int menu = readNumber();
			switch(menu){
			case INSERT:
				insert(); break;
			case DELETE:
				delete(); break;
			case UPDATE:
				update(); break;
			case SEARCH:
				search(); break;
			case SHOWALL:
				showAll(); break;
			case EXIT:
				System.out.println("프로그램을 종료합니다..."); return;
			default:
				System.out.println("입력이 틀렸습니다. 다시 입력하세요."); continue;
			}
		}
	}
	
	private void insert(){
		System.out.print("이름>>");
		String name = scanner.next();
		if(map.get(name)!=null){
			System.out.println("이미 존재하는 사람입니다.");
			return;
		}
		
		System.out.print("주소>>");
		String address = scanner.next();
		System.out.print("전화번호>>");
		String telNum = scanner.next();
		
		map.put(name, new Phone(name, address, telNum));
	}
	
	private void delete(){
		System.out.print("이름>>");
		String name = scanner.next();
		Phone p = map.remove(name);
		if(p==null)
			System.out.println(name + "는 등록되지 않은 사람입니다.");
		else
			System.out.println(name + "은 삭제되었습니다.");
	}
	
	private void update(){
		System.out.print("이름>>");
		String name = scanner.next();
		Phone p = map.get(name);
		if(p == null)
			System.out.println(name + "는 등록되지 않은 사람입니다.");
		else{
			System.out.println("주소>>" + p.getAddress());
			System.out.print("전화번호>>" + p.getTelNum());
			System.out.print("바뀐번호>>");
			String telNum = scanner.next();
			map.remove(name);
			p = new Phone(name, p.getAddress(), telNum);
			map.put(name, p);
			System.out.println(p.toString());
			System.out.println("수정이 완료 되었습니다.");
		}
		
		
	}
	
	private void search(){
		System.out.print("이름>>");
		String name = scanner.next();
		Phone p = map.get(name);
		if(p == null)
			System.out.println(name + "는 등록되지 않은 사람입니다.");
		else
			System.out.println(p.toString());
	}
	
	private void showAll(){
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()){
			String name = it.next();
			Phone p = map.get(name);
			System.out.println(p.toString());
		}
	}
	
	private int readNumber(){
		int n=-1;
		try{
			n = scanner.nextInt();
		}catch(InputMismatchException e){
			return -1;
		}
		return n;
	}
	
	public static void main(String[] args){
		PhoneBookApp pb = new PhoneBookApp();
		pb.run();
	}
}
