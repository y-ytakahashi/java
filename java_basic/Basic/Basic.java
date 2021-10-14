public class Basic {

  public static void main(String[] args) {
    int age = 20;
    // age = 20;
    System.out.print("hello" + age);
    // age = 31;
    // System.out.Println("next age" + age);
    int r = new java.util.Random().nextInt(90);
    System.out.println(r);

    // for (int i = 0; i < 100; i++) {
    //   int p = new java.util.Random().nextInt(90);
    //   System.out.println(p);
    // }
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        int ans = i * j;
        System.out.println(i + "*" + j + "=" + ans);
      }
    }
  }
}
