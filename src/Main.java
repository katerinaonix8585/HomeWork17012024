public class Main {
    public static void main(String[] args) {

        Color color = Color.RED;
        System.out.println(color.getRGB(color));

        Coin coin = Coin.PENNY;
        System.out.println(coin.value);

        Month month = Month.DECEMBER;
        System.out.println(month.getAmount(month));

    }
}