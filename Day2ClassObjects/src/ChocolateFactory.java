
public class ChocolateFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chocolate cadburyDairyMilk=new Chocolate("Dark Milk",150.00,199.00,"Paperbox",false);
		Chocolate kitkat=new Chocolate("kitkat",60.00,99,"Paperbox",false);
		Chocolate fivestar=new Chocolate("fivestar",80.00,100,"Paperbox",false);
		Chocolate crispello=new Chocolate("crispello",40.00,20,"Paperbox",false);
		Chocolate Darkfantasy=new Chocolate("Darkfantasy",100.00,60,"Paperbox",false);
		Chocolate Fuse=new Chocolate("Fuse",40.00,20,"Paperbox",false);
		Chocolate Perk =new Chocolate("Perk",70.00,20,"Paperbox",false);
		Chocolate snickers=new Chocolate("snickers",40.00,20,"Paperbox",false);  
		Chocolate munch=new Chocolate("munch",40.00,20,"Paperbox",false);  
		Chocolate darkchocolate=new Chocolate("darkchocolate",40.00,20,"Paperbox",false);  

			
		System.out.println(cadburyDairyMilk);
		System.out.println(kitkat);
		System.out.println(fivestar);
		System.out.println(crispello);
		System.out.println(Darkfantasy);
		System.out.println(Fuse);
		System.out.println(Perk);
		System.out.println(snickers);
		System.out.println(munch);
		System.out.println(darkchocolate);

	

   boolean result=cadburyDairyMilk==fivestar;
	   System.out.println(result);
   
   if(cadburyDairyMilk instanceof Chocolate &&
		   fivestar instanceof Chocolate) 
   {
	   result=cadburyDairyMilk==snickers;
	   System.out.println(result);
   }
   Chocolate chok =cadburyDairyMilk;
    result=(cadburyDairyMilk==chok);
    System.out.println(result);
}

}











