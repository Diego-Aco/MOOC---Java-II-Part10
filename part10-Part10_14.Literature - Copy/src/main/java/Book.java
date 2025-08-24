public class Book {
    private String title;
    private int ageRecommendation;

    public Book(String title, int ageRecommendation){
        this.title=title;
        this.ageRecommendation=ageRecommendation;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAgeRecommendation() {
        return ageRecommendation;
    }

    public void setAgeRecommendation(int ageRecommendation) {
        this.ageRecommendation = ageRecommendation;
    }

    @Override
    public String toString(){
        return this.title + String.format(" (recommended for %s year-olds or older)", this.ageRecommendation);
    }

}
