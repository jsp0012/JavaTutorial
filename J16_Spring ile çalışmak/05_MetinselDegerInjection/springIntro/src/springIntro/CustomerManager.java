package springIntro;

public class CustomerManager implements ICustomerService{
	
	private ICustomerDal customerdal;
	
	

	public void setCustomerdal(ICustomerDal customerdal) {
		this.customerdal = customerdal;
	}



	public void add()
	{
		customerdal.add();
	}

}
