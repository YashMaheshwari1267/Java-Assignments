package collection.assignments;

public class ParkedCarOwnerDetails {
	private String ownerName;
	private String carmodel;
	private String carNo;
	private String ownerMobNo;
	private String owneraddress;
	
	
	public ParkedCarOwnerDetails(String ownerName, String carmodel, String carNo, String ownerMobNo,
			String owneraddress) {
		super();
		this.ownerName = ownerName;
		this.carmodel = carmodel;
		this.carNo = carNo;
		this.ownerMobNo = ownerMobNo;
		this.owneraddress = owneraddress;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getCarmodel() {
		return carmodel;
	}

	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getOwnerMobNo() {
		return ownerMobNo;
	}

	public void setOwnerMobNo(String ownerMobNo) {
		this.ownerMobNo = ownerMobNo;
	}

	public String getOwneraddress() {
		return owneraddress;
	}

	public void setOwneraddress(String owneraddress) {
		this.owneraddress = owneraddress;
	}
	
	
}
