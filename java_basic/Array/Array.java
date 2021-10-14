public class Array {

  public static void main(String[] args) {
    // int[] score = new int[5];
    // System.out.println(score.length);

    // 従来のfor文での例
    int[] score = { 20, 30, 40, 50, 80 };
    for (int i = 0; i < score.length; i++) {
      System.out.println(score[i]);
    }

    // 拡張 for 文の例
    for (int value : score) {
      System.out.println(value);
    }

    extraArray();
  }

  private static void extraArray() {
    int[] a = { 1, 2, 3, 4, 5 };
    int[] b;
    b = a;
    b[0] = 100;
    System.out.println(a[0]);
  }
}
