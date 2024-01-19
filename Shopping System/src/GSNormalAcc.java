public class GSNormalAcc extends NormalAcc {
	
    // Constructors
    // Public constructor with parameters accNo, accNm, charges, and deliveryCharges
    public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
        super(accNo, accNm, charges, deliveryCharges);
        //this.getDeliveryCharges();
        
    }

    // Methods
    // Overridden bookProduct method
    @Override
    public void bookProduct(String item, float price) {
        // Additional logic specific to GSNormalAcc, if any
        // Here, you can customize the behavior for booking a product in an online shopping context
        float totalCharges = price + getCharges() + getDeliveryCharges();
        System.out.println("Product booked for account " + getAccno() + ": " + item);
        System.out.println("Total charges: " + totalCharges);
    }
}
