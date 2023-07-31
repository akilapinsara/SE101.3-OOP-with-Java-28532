public class CylinderContainer extends Container{

    public double calVolume(){
        double volume=Math.PI*getRad()*getRad()*getHei();
        return volume;
    }

}
