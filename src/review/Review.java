package review;

public class Review {
	//id, userId, rating, desc
	private int id, userId;
	private Double rating;
	private String description;
	
	public Review(int id, int userId, Double rating, String description) {
		super();
		this.id = id;
		this.userId = userId;
		this.rating = rating;
		this.description = description;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
