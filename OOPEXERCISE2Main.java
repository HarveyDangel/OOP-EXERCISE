public class OOPEXERCISE2Main
{
	public static void main(String[] args)
	{
		Tank tank; //create object tank
		
		LaserTank Lasertank = new LaserTank(50, "LT22", 100, 25); // new object of the Lasertank class ( numCharge, regID, HP, Armor)
		ArtilleryTank Artillerytank = new ArtilleryTank(25, "AT07", 75, 50); // new object of the Artillerytank class ( numBullet, regID, HP, Armor)
		
		tank = Lasertank; // morphing the superclass object Tank into LaserTank class object Lasertank
		System.out.println(tank.Shoot()+" is fired by "+tank.getRegID()); // print the shoot method of LaserTank and its regID
		
		tank = Artillerytank; // morphing the superclass object Tank into ArtilleryTank class object Artillerytank
		System.out.println(tank.Shoot()+" is fired by "+tank.getRegID()); // print the shoot method of ArtilleryTank and its regID
	}
}
