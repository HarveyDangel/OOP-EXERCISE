public abstract class Tank{
	// protected attributes of superclass Tank
	protected String regID;
	protected int HP;
	protected int Armor;
	// constructor of superclass Tank with parameters 
	public Tank (String regID, int HP, int Armor){
		this.regID = regID;
		this.HP = HP;
		this.Armor = Armor;
	}
	//abstract method of superclass Tank
	public abstract String Shoot();
	//methods of the superclass
	public String getRegID(){
		return regID;
	}
	public void setRegID(String regID){
		this.regID=regID;
	}
	public int gethp(){
		return HP;
	}
	public void sethp(int HP){
		this.HP=HP;
	}
	public int getarmor(){
		return Armor;
	}
	public void setarmor(int Armor){
		this.Armor=Armor;
	}
}
