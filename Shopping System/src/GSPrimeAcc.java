public class GSPrimeAcc extends PrimeAcc {
    // Fields
    private static final float charges = 0.0f;
    private static final float deliveryCharges = 0.0f;// Assuming a default charge for online shopping

    // Constructors
    // Public constructor with parameters accNo, accNm, and isPrime
    public GSPrimeAcc(int accNo, String accNm, boolean isPrime,float charges) {
        super(accNo, accNm, charges, isPrime);
    }

    // Methods
    // Overridden bookProduct method
    @Override
    public void bookProduct(String item, float price) {
        // Additional logic specific to ConcreteGSPrimeAcc, if any
        // Here, you can customize the behavior for booking a product in an online shopping context
        float totalCharges = price + getCharges() ;
        System.out.println("Product booked for account " + getAccno() + ": " + item);
        System.out.println("Total charges: " + totalCharges);
    }

    // Overridden toString method
    @Override
    public String toString() {
        return "GSPrimeAcc" +
                "accNo=" + getAccno() +
                ", accNm='" + getAccNm() + '\'' +
                ", charges=" + getCharges() +
                ", isPrime=" + isPrime() +
                ",deliveryCharges="+deliveryCharges
                ;
    }
}