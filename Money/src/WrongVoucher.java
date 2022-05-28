
public class WrongVoucher extends Money{
	private String store;

	public WrongVoucher(String currencyCode, int amount, String store) {
		super(currencyCode, amount);
		this.store = store;
	}

	/**
	 * @return the store
	 */
	public String getStore() {
		return store;
	}

	/**
	 * @param store the store to set
	 */
	public void setStore(String store) {
		this.store = store;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof WrongVoucher)) {
			return false;
		}
		
		WrongVoucher o = (WrongVoucher)obj;
		return o.getAmount() == this.getAmount(); 
	}
	
}
