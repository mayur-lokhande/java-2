package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class User {
	private int id;
	private String userName;
	private String password;
	private String email;

	public User(int id, String userName, String password, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email + "]";
	}

}

class UserDTO {
	private int id;
	private String userName;
	private String email;

	public UserDTO(int id, String userName, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", email=" + email + "]";
	}

}

public class StreamMapExample {

	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		users.add(new User(232, "mayur", "mayur@123", "mayur@gmail.com"));
		users.add(new User(453, "rahul", "rahul@009", "rahul@gmail.com"));
		users.add(new User(534, "omkar", "omkar@7799", "omkar@gmail.com"));

		System.out.println("-------using adv.for loop-------");
		// using adv.for loop
		List<UserDTO> usersDTO = new ArrayList<>();
		for (User user : users) {
			usersDTO.add(new UserDTO(user.getId(), user.getUserName(), user.getEmail()));
		}
		for (UserDTO dto : usersDTO) {
			System.out.println(dto);
		}

		// System.out.println("-------stream().map() using normal way-------");
		// stream().map() using normal way
		/*
		 * users.stream().map(new Function<User, UserDTO>() {
		 * 
		 * @Override public UserDTO apply(User user) { return new UserDTO(user.getId(),
		 * user.getUserName(), user.getEmail()); } });
		 */

		// stream().map() using lambda expression
		System.out.println("-------stream().map() using lambda expression-------");
		List<UserDTO> userdto = users.stream()
				.map((User user) -> new UserDTO(user.getId(), user.getUserName(), user.getEmail()))
				.collect(Collectors.toList());
		userdto.forEach(System.out::println);

	}

}