public abstract class PrimeAcc extends ShopAcc {
    // Fields specific to PrimeAcc
    private boolean isPrime;
    private static final float deliveryCharges = 0.0f;

    // Constructors
    // Public constructor with parameters accNo, accNm, charges, isPrime
    public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges);
        this.isPrime = isPrime;
    }

    // Properties
    // Read-only property for isPrime
    public boolean isPrime() {
        return isPrime;
    }

    // Read-only property for deliveryCharges
    public static float getDeliveryCharges() {
        return deliveryCharges;
    }

    // Overridden bookProduct method
    @Override
    public void bookProduct(String item, float price) {
        // Additional logic specific to PrimeAcc, if any
        // Here, we don't allow extra charges for delivery
        float totalCharges = price + getCharges() ;
        System.out.println("Product booked for account " + getAccno() + ": " + item);
        System.out.println("Total charges: " + totalCharges);
    }

    // Overridden toString method
    @Override
    public String toString() {
        return "PrimeAcc{" +
                "accNo=" + getAccno() +
                ", accNm='" + getAccNm() + '\'' +
                ", charges=" + getCharges() +
                ", isPrime=" + isPrime +
                ",deliveryCharges="+deliveryCharges+
                '}';
    }
}
