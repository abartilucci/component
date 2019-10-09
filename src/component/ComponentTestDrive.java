package component;

public class ComponentTestDrive {
	public static void main (String args[]) {

		Component disksInventory = new Complex();
		Component drivesInventory = new Complex();	
	
		Component techInventory = new Complex();

		techInventory.add(disksInventory);
		techInventory.add(drivesInventory);		
		
		disksInventory.add( new ItemStrg("Verbatim") );
		disksInventory.add( new ItemStrg("Maxell") );
		disksInventory.add( new ItemStrg("Philips") );
		
		Component CD_ROM = new Complex();
		Component DVD_ROM = new Complex();
	
		
		CD_ROM.add( new ItemInt(100) );
		CD_ROM.add( new ItemInt(50) );
		CD_ROM.add( new ItemInt(50) );

		disksInventory.add( CD_ROM );
		disksInventory.add( DVD_ROM );
		
		
		DVD_ROM.add( new ItemInt(100) );
		DVD_ROM.add( new ItemInt(100) );
		DVD_ROM.add( new ItemInt(100) );
		
		
		drivesInventory.add( new ItemStrg("Toshiba") );
		drivesInventory.add( new ItemStrg("WD") );
		
		Component SSD = new Complex();
		drivesInventory.add( SSD );

		SSD.add( new ItemInt(15) );
		SSD.add( new ItemInt(5) );

		drivesInventory.add( new ItemInt(400) );
		

		
		SumInt sum = new SumInt();
		SumInt sm = new SumInt();

		
		disksInventory.accept(sum);
		drivesInventory.accept(sm);
		
		System.out.println( " Sum of the two Component is " + sum.getSum() );
		System.out.println( " Sum of the two Component is " + sm.getSum() );

		System.out.println( 	CD_ROM.equals(DVD_ROM) );
		
		Component dvd_brand = new ItemStrg ("Maxtor");
		Component dvd_items = new ItemInt(100);
		
		Component cd_brand = new ItemStrg ("Philips");
		Component cd_b = new ItemStrg ("Philips");
		Component cd_items = new ItemInt(20);
		Component cd_it = new ItemInt(20);

		
		
		System.out.println( dvd_brand.equals(dvd_items) );
		System.out.println( dvd_brand.equals(cd_items) );
		System.out.println( dvd_brand.equals(DVD_ROM) );
		
		
		System.out.println( cd_brand.equals(cd_b) );
		System.out.println( dvd_brand.equals(cd_items) );
		System.out.println( dvd_brand.equals(DVD_ROM) );
		System.out.println( cd_items.equals(cd_it) );

		
		System.out.println( cd_items.equals(dvd_items) );
		
		System.out.println( disksInventory.equals(techInventory) );



	}


}
