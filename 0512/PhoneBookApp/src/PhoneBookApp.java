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
		System.out.println("��ȭ ��ȣ ���� ���α׷��� �����մϴ�. ���Ϸ� �������� �ʽ��ϴ�.");
		System.out.println("---------------------------------------------------");
		while(true){
			System.out.print("����:0, ����:1, ����:2, ã��:3, ��ü����:4, ����:5>>");
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
				System.out.println("���α׷��� �����մϴ�..."); return;
			default:
				System.out.println("�Է��� Ʋ�Ƚ��ϴ�. �ٽ� �Է��ϼ���."); continue;
			}
		}
	}
	
	private void insert(){
		System.out.print("�̸�>>");
		String name = scanner.next();
		if(map.get(name)!=null){
			System.out.println("�̹� �����ϴ� ����Դϴ�.");
			return;
		}
		
		System.out.print("�ּ�>>");
		String address = scanner.next();
		System.out.print("��ȭ��ȣ>>");
		String telNum = scanner.next();
		
		map.put(name, new Phone(name, address, telNum));
	}
	
	private void delete(){
		System.out.print("�̸�>>");
		String name = scanner.next();
		Phone p = map.remove(name);
		if(p==null)
			System.out.println(name + "�� ��ϵ��� ���� ����Դϴ�.");
		else
			System.out.println(name + "�� �����Ǿ����ϴ�.");
	}
	
	private void update(){
		System.out.print("�̸�>>");
		String name = scanner.next();
		Phone p = map.get(name);
		if(p == null)
			System.out.println(name + "�� ��ϵ��� ���� ����Դϴ�.");
		else{
			System.out.println("�ּ�>>" + p.getAddress());
			System.out.print("��ȭ��ȣ>>" + p.getTelNum());
			System.out.print("�ٲ��ȣ>>");
			String telNum = scanner.next();
			map.remove(name);
			p = new Phone(name, p.getAddress(), telNum);
			map.put(name, p);
			System.out.println(p.toString());
			System.out.println("������ �Ϸ� �Ǿ����ϴ�.");
		}
		
		
	}
	
	private void search(){
		System.out.print("�̸�>>");
		String name = scanner.next();
		Phone p = map.get(name);
		if(p == null)
			System.out.println(name + "�� ��ϵ��� ���� ����Դϴ�.");
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
