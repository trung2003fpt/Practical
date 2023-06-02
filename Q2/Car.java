public class Car {
    public String maker;
    public int price;
    public Car(){};
    public Car(String maker, int price){
        this.maker = maker;
        this.price = price;
    }
    public String getMaker(){
        return this.maker;
    }
    public int getPrice(){
        return this.price;
    }
    public void setMaker(String maker){
        this.maker = maker;
    }
    public String toString(){
        return maker + "," + price;
    }
}