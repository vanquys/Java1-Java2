
public class Voucher {
	private String store;
	private Money money;
	public Voucher(String store, String currencyCode, int amount ) {
		this.store = store;
		this.money = new Money(currencyCode, amount);
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
	/**
	 * @return the money
	 */
	public Money getMoney() {
		return money;
	}
	/**
	 * @param money the money to set
	 */
	public void setMoney(Money money) {
		this.money = money;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Voucher)) {
			return false;
		}
		Voucher o = (Voucher)obj;

		return o.store == this.store;
	}
	
}
