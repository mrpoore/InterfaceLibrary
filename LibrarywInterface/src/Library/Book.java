package Library;

public class Book implements Item{

	private String callNumber;
	private boolean checkedOut;
	private long custID;
	
	@Override
	public void setCallNumber(String callNum) {
		callNumber = callNum;
		
	}

	@Override
	public String getCallNumber() {
		return callNumber;
	}

	@Override
	public boolean checkOut(long customerID) {
		if (checkedOut)
		return false;
		
		setCheckedOut(true);
		setCustomerID(customerID);
		return true;
	}

	@Override
	public void setCheckedOut(boolean checked) {
		checkedOut = checked;
	}

	@Override
	public boolean getCheckedOut() {
		return checkedOut;
	}

	@Override
	public void setCustomerID(long customerID) {
		
		
	}

	@Override
	public long getCustomerID() {
		// TODO Auto-generated method stub
		return custID;
	}


}
