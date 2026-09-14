public class Stringsa {
  public static boolean Palindrome(String str) {
    int n = str.length();
    int i = 0;

    while (i <= n / 2) {

      if (str.charAt(i) != str.charAt(n - 1 - i)) {
        return false;
      }
      i++;
    }

    return true;
  }


  //Ques. Given a route containing 4 directions (E,w,n,s), find the shortest path to reach destination. "WWSSSEENNEE" => "SEN" return in number
  public static void shortestRoute(String str){
    int x=0,i=0,y=0; 

    while(i < str.length()){
      char saI = str.charAt(i);

      if(saI == 'E') x++;
      if(saI == 'W') x--;
      if(saI == 'N') y++;
      if(saI == 'S') y--;

      i++;
    }

    int X = x*x; 
    int Y = y*y;
    float len = (float) Math.sqrt((X+Y));
    System.out.println("so your shortest path will be : "+ len + "units");
  }


  public static void main(String args[]) {

    // when strings defined with similar content using direct method then the same memory is pointed by both String objects .

    String str = "upendra dhami";
    String str1 = "upendra dhami";

    // but when you use new String it points to the another location so '== '
    // comparision don't works here so we use
    String str3 = new String("upendra dhami");

    // compares at object level
    // if(str == str1){
    // System.out.println(true);
    // }else{
    // System.out.println(false);
    // }

    // // comppare values
    // if(str.equals(str3)){
    // System.out.println(true);
    // }else{
    // System.out.println(false);
    // }

    // for(int i=0; i<str.length(); i++){
    // System.out.print(str.charAt(i) + " ");
    // }

    // System.out.println(Palindrome(str3));
    // System.out.println(Palindrome("noon"));

    shortestRoute("WNEENESENNN");
  }
}
