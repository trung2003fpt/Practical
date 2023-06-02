public class SpecCar extends Car{
    public int type;
    public SpecCar(){};
    public SpecCar(String maker, int price, int type){
        Car c = new Car();
        c.maker = maker;
        c.price = price;
        this.type = type;
    }
    public String toString(){
        return maker + "," + price + "," + this.type;
    }
    public void setData(){
        setMaker("XZ" + maker);
        price = price + 20;
        System.out.println(maker + "," + price);
    }
    public int getValue(){
        return price + (type < 7 ? 10:15);
    }
}