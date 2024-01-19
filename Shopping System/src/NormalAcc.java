public abstract class NormalAcc extends ShopAcc {
    // Fields specific to NormalAcc
    private static final float deliveryCharges = 5.0f; // Assuming a default delivery charge

    // Constructors
    // Public constructor with parameters accNo, accNm, charges
    public NormalAcc(int accNo, String accNm, float charges,float deliveryCharges) {
        super(accNo, accNm, charges);
    }

    // Properties
    // Read-only property for deliveryCharges
    public static float getDeliveryCharges() {
        return deliveryCharges;
    }

    // Overridden bookProduct method
    @Override
    public void bookProduct(String item, float price) {
        // Additional logic specific to NormalAcc, if any
        // Here, we allow delivery charges for the product
        float totalCharges = price + getCharges() + getDeliveryCharges();
        System.out.println("Product booked for account " + getAccno() + ": " + item);
        System.out.println("Total charges: " + totalCharges);
    }

    // Overridden toString method
    @Override
    public String toString() {
        return "NormalAcc " +
                "accNo=" + getAccno() +
                ", accNm='" + getAccNm() + '\'' +
                ", charges=" + getCharges() +
                ", deliveryCharges= "  + getDeliveryCharges() 
                ;
    }
}
