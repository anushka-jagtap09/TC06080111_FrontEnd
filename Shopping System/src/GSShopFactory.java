
public class GSShopFactory extends ShopFactory {
    @Override
    public GSPrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        return new GSPrimeAcc(accNo, accNm, isPrime, charges);
    }

    @Override
    public GSNormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
        return new GSNormalAcc(accNo, accNm, charges, deliveryCharges);
    }

	@Override
	public NormalAcc getNewNormalAcc(int accNo, String accNm, float charges) {
		// TODO Auto-generated method stub
		return null;
	}
}