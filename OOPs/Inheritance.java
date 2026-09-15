public class Inheritance{
   public static void main(String[] args){

    Pieces dolphins = new Pieces();
    dolphins.breathe();

    Animals Lion = new Animals();
    Lion.eat();
    Lion.live();
    


   }
}

class vertebrates{
  void eat(){
    System.out.println("they can eat ");
  }
  


}

class Pieces extends vertebrates{
  int fins;
  void breathe(){
    System.out.println("they breathe through fins ");
  }

  void live(){
    System.out.println("they live in water");
  }
}


class Animals extends vertebrates{
  int legs;
  void live(){
    System.out.println("they live on land");
  }
}