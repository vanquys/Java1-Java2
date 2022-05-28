
public class Money {
	private String currencyCode;
	private int amount;

	public Money(String currencyCode, int amount) {
		this.currencyCode = currencyCode;
		this.amount = amount;
	}

	public Money() {
	}

	/**
	 * @return the currencyCode
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}

	/**
	 * @param currencyCode the currencyCode to set
	 */
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if (!(obj instanceof Money)) {
			return false;
		}
		Money o = (Money)obj;
		
		return o.amount == this.amount;
		
	}
}
