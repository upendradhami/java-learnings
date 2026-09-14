package OOPs;
public class OOPs {
  public static void main(String args[]){

    Pen p1 = new Pen();
    p1.setcolor("yellow");
    p1.setTip(8);
    p1.color = "blue";
    System.out.println("color and tip are " + p1.color + " & "+ p1.tip);
  }
}

class Pen{
  String color;
  int tip;

  void setcolor(String str){
    color = str;
  }

  void setTip(int n){
     tip = n;
  }
}
