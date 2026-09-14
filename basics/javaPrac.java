public class javaPrac {
  public static void countVowels(String str) {
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      char letter = str.charAt(i);
      if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
        count++;
      }
    }

    System.out.println("total lowercase vowels are : " + count);
  }

  public static boolean checkAnagram(String str1, String str2) {
    boolean val = false;

    if (str1.equals(str2))
      return true;

    if (str1.length() != str2.length()) {
      return false;
    } else {
      for (int i = 0; i < str1.length(); i++) {
        for (int j = 0; j < str2.length(); j++) {
          if (str1.charAt(i) == str2.charAt(j)) {
            val = true;
            break;
          } else {
            val = false;
          }
        }
      }
    }

    return val;
  }

  public static void main(String args[]) {
    countVowels("HEllo Guys A e a");
    String str = "ApnaCollege".replace("l", "");
    System.out.println(str);

    System.out.println(checkAnagram("helol", "olleh"));
    System.out.println(str.intern());
    System.out.println();
  }
}
