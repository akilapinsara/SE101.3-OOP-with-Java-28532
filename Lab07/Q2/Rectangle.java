public class Rectangle extends Shape{
    private double len,wid;

    public Rectangle(double len, double wid) {
        this.len = len;
        this.wid = wid;
    }

    public void calArea(){
        area=len*wid;
    }
}
