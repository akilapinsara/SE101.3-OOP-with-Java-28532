class SuperB {
 int x;
 void setIt(int n) {
 x = n;
 }
 void increase() {
 x = x + 1;
 }
 void triple() {
 x = x * 3;
 }
 int returnIt() {
 return x;
 }
}
class SubC extends SuperB {
 void triple() {
 x = x + 3; 
 }
 void quadruple() {
 x = x * 4; 
 }
}
public class TestInheritance {
 public static void main(String[] args) {
 SuperB b = new SuperB();
 b.setIt(2);
 b.increase();
 b.triple();
 System.out.println(b.returnIt()); 
 SubC c = new SubC();
 c.setIt(2);
 c.increase();
 c.triple();
 System.out.println(c.returnIt());
 }
