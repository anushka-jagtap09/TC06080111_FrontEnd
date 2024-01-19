
public abstract class ShopAcc {
	//fields
	private int accNo;
	private String accNm;
	private float charges;
	
	//constructor // this refer to current object 
	public ShopAcc(int accNo,String accNm,float charges) {
		this.accNo=accNo;
		this.accNm=accNm;
		this.charges=charges;
	}
	
	//properties 
	//read only 
	public int getAccno() {
		return accNo;
		
	}
	
	public String getAccNm(){
		return accNm;
		
	}
	
	public void setAccNm(String accNm) {
		this.accNm=accNm;
	}
	
	
	
	public float getCharges() {
		return charges;
	}
	
	public abstract void bookProduct(String item,float price);
	public void displayItem() {
		System.out.println("Item booked for account"+accNo+":");
		
	}

	public abstract String toString();
	
}
