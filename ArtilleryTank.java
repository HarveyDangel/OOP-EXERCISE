public class ArtilleryTank extends Tank{
	// protected unique attribute of the subclass ArtilleryTank
		protected int numBullet;
		// constructor of the subclass ArtilleryTank
		public ArtilleryTank( int numBullet, String regID, int HP, int Armor){
			super (regID, HP, Armor); // calling the constructor of the superclass via "super" to be usee by subclass
			this.numBullet = numBullet;
		}

		@Override // override to create own version to the superclass shoot method
		public String Shoot()
		{
			return "High Explosive Bullet";
		}
		//methods
		public int getnumbullet(){
			return numBullet;
		}
		public void setnumbullet(int numBullet){
			this.numBullet = numBullet;
		}
}
