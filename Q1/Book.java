public class Book {
    public String title;
    public int price;
    public Book(){};
    public Book(String title, int price){
        this.title = title;
        this.price = price;
    }
    public String getTitle(){
        return title.toUpperCase();
    }
    public int getPrice(){
        return this.price;
 }
    public void setPrice(int price){
        this.price = price;
    }
}