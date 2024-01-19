public class EntryPoint {

    public static void main(String[] args) {
        // a. Assign instance of GSShopFactory to ShopFactory reference.
        ShopFactory shopFactory = new GSShopFactory();

        // b. Instantiate GSPrimeAcc and refer it through reference PrimeAcc.
        PrimeAcc primeAcc = shopFactory.getNewPrimeAcc(1, "PrimeUser", 50.0f, true);

        // c. Instantiate GSNormalAcc and refer it through reference NormalAcc.
        NormalAcc normalAcc = shopFactory.getNewNormalAcc(2, "NormalUser", 30.0f, 5.0f);

        // d. Invoke bookProduct() method.
        primeAcc.bookProduct("Smartphone", 500.0f);
        normalAcc.bookProduct("Laptop", 800.0f);

        // e. Invoke toString() method.
        System.out.println("Prime Account Details:");
        System.out.println(primeAcc.toString());

        System.out.println("\nNormal Account Details:");
        System.out.println(normalAcc.toString());
    }
}
