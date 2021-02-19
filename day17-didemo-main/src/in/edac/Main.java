package in.edac;

public class Main {

	public static void main(String[] args) {
		
		// 1
		User user = new User();
		System.out.println(user.getId());
		System.out.println(user.getName());
		
		
		// 2 Intialized the members at the time of construction
		User user1 = new User(1, "mumbai", "mumbai@gmail.com", "221121");
		System.out.println(user1.getId());
		System.out.println(user1.getName());
		
		
		// 3
		User user2 = new User();
		System.out.println(user2.getId());
		System.out.println(user2.getName());
		
		user2.setId(100);
		user2.setName("Delhi");
		
		System.out.println(user2.getId());
		System.out.println(user2.getName());
	}
	
}
