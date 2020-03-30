package movies;

public class Movie {

    // Initialized name and category
    String name;
    String category;

    // Constructor for name and category
    public Movie (String name, String category) {
        this.name = name;
        this.category = category;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}
