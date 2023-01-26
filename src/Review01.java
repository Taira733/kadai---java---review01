public class Review01 {

    public static void main(String[] args) {
      int price = 1500; // int型変数priceを宣言し、1500を代入
      int tax = 10; // int型変数taxを宣言し、10を代入

      // taxメソッドを呼び出し、処理結果をint型変数に代入
      int result = taxMethod(price,tax);
      System.out.println(price + "円の商品の税込価格は" + (price + result)
      + "円（消費税は" + result + "円）です。");

    }

    public static int taxMethod(int price, int tax) {
        int result = price * tax / 100;
        return result;

    }
}