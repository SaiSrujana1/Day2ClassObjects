
public class CreateChocolate {
	
public static void main(String[] args) {
	Chocolate cadburyDairyMilk=new Chocolate("Dark Milk",150.00,199,"Paperbox",false);
	Chocolate kitkat=new Chocolate("kitkat",60.00,99,"Paperbox",false);
	Chocolate fivestar=new Chocolate("fivestar",80.00,100,"Paperbox",false);
	Chocolate crispello=new Chocolate("crispello",40.00,20,"Paperbox",false);
	Chocolate Darkfantasy=new Chocolate("Darkfantasy",100.00,60,"Paperbox",false);
	Chocolate Fuse=new Chocolate("Fuse",40.00,20,"Paperbox",false);
	Chocolate Perk =new Chocolate("Perk",70.00,20,"Paperbox",false);
	Chocolate snickers=new Chocolate("snickers",40.00,20,"Paperbox",false);  
	Chocolate munch=new Chocolate("munch",40.00,20,"Paperbox",false);  
	Chocolate darkchocolate=new Chocolate("darkchocolate",40.00,20,"Paperbox",false);  
	
	
	Chocolate[] chocolateArray=new Chocolate[10];

	   
	   chocolateArray[0]= cadburyDairyMilk;
	   chocolateArray[1]=fivestar;
	   chocolateArray[2]=snickers;
	   chocolateArray[3]=Darkfantasy;
	   chocolateArray[4]=kitkat;
	   chocolateArray[5]=crispello;
	   chocolateArray[6]=Perk;
	   chocolateArray[7]=Fuse;
	   chocolateArray[8]=munch;
	   chocolateArray[9]=darkchocolate;
	   for(int i=0;i<chocolateArray.length;i++)
		   
	   {
		     System.out.println(chocolateArray[i]); 
	   }


}
}
