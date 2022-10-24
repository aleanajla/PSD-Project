package recipe;

public class Recipe {
	//id, adminId, title, method, ingredients, calorie, sugar, fiber, protein, fat, saturate, carbs, category
	private int id, adminId;
	private String title, method, ingredients,category;
	private Double calorie, sugar, fiber, protein, salt, fat, saturate, carbs;
	
	public Recipe(int id, int adminId, String title, String method, String ingredients, String category, Double calorie,
			Double sugar, Double fiber, Double protein, Double salt, Double fat, Double saturate, Double carbs) {
		super();
		this.id = id;
		this.adminId = adminId;
		this.title = title;
		this.method = method;
		this.ingredients = ingredients;
		this.category = category;
		this.calorie = calorie;
		this.sugar = sugar;
		this.fiber = fiber;
		this.protein = protein;
		this.salt = salt;
		this.fat = fat;
		this.saturate = saturate;
		this.carbs = carbs;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Double getCalorie() {
		return calorie;
	}
	public void setCalorie(Double calorie) {
		this.calorie = calorie;
	}
	public Double getSugar() {
		return sugar;
	}
	public void setSugar(Double sugar) {
		this.sugar = sugar;
	}
	public Double getFiber() {
		return fiber;
	}
	public void setFiber(Double fiber) {
		this.fiber = fiber;
	}
	public Double getProtein() {
		return protein;
	}
	public void setProtein(Double protein) {
		this.protein = protein;
	}
	public Double getSalt() {
		return salt;
	}
	public void setSalt(Double salt) {
		this.salt = salt;
	}
	public Double getFat() {
		return fat;
	}
	public void setFat(Double fat) {
		this.fat = fat;
	}
	public Double getSaturate() {
		return saturate;
	}
	public void setSaturate(Double saturate) {
		this.saturate = saturate;
	}
	public Double getCarbs() {
		return carbs;
	}
	public void setCarbs(Double carbs) {
		this.carbs = carbs;
	}
	
	
	
}
