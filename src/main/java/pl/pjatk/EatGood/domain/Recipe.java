package pl.pjatk.EatGood.domain;

import javax.persistence.*;

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    @Column(columnDefinition = "TEXT")
    private String summary;
    @Column(columnDefinition = "TEXT")
    private String instructions;
    private String image;
    private int readyInMinutes;
    private int servings;
    @Enumerated(EnumType.STRING)
    private Cuisines cuisines;

    public Recipe(Integer id, String title, String summary, String instructions, String image, int readyInMinutes, int servings, Cuisines cuisines) {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.instructions = instructions;
        this.image = image;
        this.readyInMinutes = readyInMinutes;
        this.servings = servings;
        this.cuisines = cuisines;
    }

    public Recipe() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getReadyInMinutes() {
        return readyInMinutes;
    }

    public void setReadyInMinutes(int readyInMinutes) {
        this.readyInMinutes = readyInMinutes;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public Cuisines getCuisines() {
        return cuisines;
    }

    public void setCuisines(Cuisines cuisines) {
        this.cuisines = cuisines;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", instructions='" + instructions + '\'' +
                ", image='" + image + '\'' +
                ", readyInMinutes=" + readyInMinutes +
                ", servings=" + servings +
                ", cuisines=" + cuisines +
                '}';
    }
}