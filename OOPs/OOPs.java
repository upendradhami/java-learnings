public class OOPs {
  public static void main(String args[]){

    // Pen p1 = new Pen();
    // p1.setcolor("yellow");
    // p1.setTip(8);
    // p1.color = "blue";
    // System.out.println("color and tip are " + p1.color + " & "+ p1.tip);

    Student s1 = new Student("harry");
    System.out.println(s1.name+ " " + s1.roll);  

    s1.roll = 43;
    System.out.println(s1.name+ " " + s1.roll);  


    int marks[] = {23,4,2};
    Student s2 = new Student("hero",47, marks);
    System.out.println(s2.name+ " is the name of student and roll is  " + s2.roll + " and marks are: ");  
    for(int i=0; i<s2.marks.length; i++){
      System.out.println(s2.marks[i]);
    }

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



class Student{
   String name;
   int roll;
   int[] marks = new int[3];

   Student(String name){
    this.name = name;             // single parameterized constructor
   }

   Student(String name, int roll, int[] marks){    // whole parameter containing constructor 

    this.name = name;
    this.marks = marks;                    
    this.roll = roll;
   }


  //  Student (Student sn){                               // copy constructor i.e similar to another object 
  //   this.name = sn.name;
  //   this.roll = sn.roll;
  //   this.marks = sn.marks;                      // this is shallow copy i.e for students marks the refernce is copied of copied object
  //  }

   
   Student (Student s1){                               // copy constructor i.e similar to another object 
    this.name = s1.name;
    this.roll = s1.roll;
    for(int i=0; i<s1.marks.length; i++){
             this.marks[i] = s1.marks[i];             // deep copied i.e copied but iin  a new array with new object 
    }
   }

}
