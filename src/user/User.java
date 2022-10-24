package user;

public class User {
	//id, username, email, weight, height, gender,age, password
	
	private int id,age;
	private String username, email, gender, password;
	private Double weight, height, bmiTest;

	public User(int id, int age, String username, String email, String gender, String password, Double weight,
			Double height) {
		super();
		this.id = id;
		this.age = age;
		this.username = username;
		this.email = email;
		this.gender = gender;
		this.password = password;
		this.weight = weight;
		this.height = height;
		this.bmiTest = BMITest();
	}
	
	public Double BMITest() {
		return weight/(height*height);
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Double getWeight() {
		return weight;
	}
	
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	
	public Double getHeight() {
		return height;
	}
	
	public void setHeight(Double height) {
		this.height = height;
	}
	
	public Double getBmiTest() {
		return bmiTest;
	}
	
	public void setBmiTest(Double bmiTest) {
		this.bmiTest = bmiTest;
	}
	
	
	
	
	
}
