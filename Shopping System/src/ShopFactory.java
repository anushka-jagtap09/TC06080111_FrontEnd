
public abstract class ShopFactory {
    // Abstract factory method to create a new PrimeAcc
    public abstract PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime);

    // Abstract factory method to create a new NormalAcc
    public abstract NormalAcc getNewNormalAcc(int accNo, String accNm, float charges);

	public GSNormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		// TODO Auto-generated method stub
		return null;
	}
}
