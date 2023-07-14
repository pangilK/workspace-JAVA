package extends5_customer;

public class VIPCustomer extends GoldCustomer {
	
	private int agentID; 	// 담당직원
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		super.customerGrade = "VIP";
		super.bonusRatio = 0.05;
		super.saleRatio = 0.2;
		this.agentID = agentID;
	}

	@Override
	public String showCustomerInfo() {
		// TODO Auto-generated method stub
		return super.showCustomerInfo()+ " 담당 직원 번호는 : "+this.agentID+" 입니다.";
	}
	
	
}
