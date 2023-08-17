package electronicShop;

import java.util.*;

class Electronic {
	public static void getBack()
	{
		 System.out.println("\n**--Please Select what do you want Buy**- ");
			System.out.println("1.LAPTOP\n2.MOBILE\n3.TV\n4.FRIDGE");
			 Electronic.getElectronic();
	}
	
	public static void getLogin()
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Your Name:");
		 String name=sc.nextLine();
		 System.out.println("Enter Your Address:");
		 String address=sc.nextLine();
		 System.out.println("Enter Your Phone No:");
		 Long number=sc.nextLong();
		 System.out.println("!~~Press 1 To Submit~~!");
		 int sub=sc.nextInt();
		 if (sub==1)
		 {
			 
			 System.out.println("       -!!!&&Thank you Submit Your Records-!!!$$    \n\n");
			  System.out.println("Your name->:"+name);
			 System.out.println("Your Address->:"+address);
			 System.out.println("Your PhoneNo.->:"+number);
			 getBack();
		 }
		 else 
		 {
			 System.out.println("Please Give Valid Input-");
			 
			
		 }
	
		}
	
	public static void Exit() {
		System.out.println(" !!@@@@@_____________________*********Thank You for Visiting********____________________@@@@@@!!");
	}
	
	public static void getPayment() {
		 Scanner sc =new Scanner(System.in);
		int no=sc.nextInt();
		if(no==1) {
			System.out.println("$$$$$$--Please Select Payment Method--*$$$$$$\n");
			System.out.println("1.Online\n2.Cash ");
			int pay=sc.nextInt();
			
			switch(pay)
			{
			
			case 1:
				System.out.println(" ^^You Selected Online Mode^^\n");
				System.out.println("Input Mobile Number:");
				Long numb=sc.nextLong();
				System.out.println("Input UPI No:");
				int upi=sc.nextInt();
				System.out.println("$~ Transaction Is Successfully Done ~$\n\n");
				break;
			case 2:
				System.out.println(" ^^You Selected Offline Mode^^\n");
				System.out.println("\n ~~Thanks for Giving Me Cash~~'-\n  **^ye BAVA Online ka Chakkar Apne ko Jamtahich nhi hai^**\n");
			    break;
	        default:
			    	System.out.println("Ohk No Problem You do not selected Payment Option");
			    	Exit();
			}
			;
			System.out.println("\n               *@~~~CONGRATULATION ON YOUR BEST SHOPPING~~~@*\n\n              *----~Please Come Again in My Electronic shop~----*"
					+ "\n\n\n\n\n");
			Exit();
			
		}
		else
		{
          System.out.println("Please Select valid number");
          getPayment();
		}
		
	}
	
	
			public static void getElectronic() {
		
		
		 Scanner sc =new Scanner(System.in);
		String num=sc.nextLine();
	
	 switch(num){
	 case "1":
		 System.out.println("         @@@@@@@@@@@~~~Amazing You Selected Laptop~@@@@@@@@@@\n ");
		 Laptop.getLaptop();
	 break;
	 case "2":
		 System.out.println("         @@@@@@@@@~~~Amazing You Selected Mobile~~~@@@@@@@@\n ");
		Mobile.getMobile();
	 break;
	 case "3":
		 System.out.println("         @@@@@@@@@~~~Amazing You Selected Tv~~~@@@@@@@@@\n");
		 Tv.getTv();
	 break;
	 case "4":
		 System.out.println("         @@@@@@@@@~~~Amazing You Selected Fridge~~~@@@@@@@@@\n");
		 Fridge.getFridge();
		 break;
	 default:
		 System.out.println("PLEASE SELECT VALID NUMBER--*");
		 getElectronic();
	 }
   }
}

/////////// LAPTOP BRANDS---****

class Laptop extends Electronic {

	Laptop() {

	}
	
	public static void asusGet() {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		 switch(n1)
		 {
		 
		 case 1:
			System.out.println("####**finally you selected :> Asus-405**####\n");
			System.out.println("PRICE=45000\nCOLOR=SILVER\nRAM=4GB");
			System.out.println("!~~Press 1. for Buy~~!");
			getPayment();
			break;
		case 2:
			System.out.println("####**finally you selected :> Asus-410**####\n");
			System.out.println("PRICE=55000\nCOLOR=SILVER\nRAM=6GB");
			System.out.println("!~~Press 1. for Buy~~!");
			getPayment();
			break;
		case 3:
			System.out.println("####**finally you selected :> Asus-415**####\n");
			System.out.println("PRICE=65000\nCOLOR=SILVER\nRAM=8GB");
			System.out.println("!~~Press 1. for Buy~~!");
			getPayment();
			break;
		case 4:
			System.out.println("####**finally you selected :> Asus-420**####\n");
			System.out.println("PRICE=75000\nCOLOR=SILVER\nRAM=8GB");
			System.out.println("!~~Press 1. for Buy~~!");
			getPayment();
			break;
		case 5:
			Laptop.getLaptop();
			break;
		default:
			System.out.println("Please select valid number");
			asusGet();
            
		}
		
	}
	
	
	
	
	public static void getHP() {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		 switch(n1)
		 {
		 
		 case 1:
			System.out.println("####**finally you selected :> HP-405**####\n");
			System.out.println("PRICE=45000\nCOLOR=SILVER\nRAM=4GB");
			System.out.println("!~~Press 1. for Buy~~!");
			getPayment();
			break;
		case 2:
			System.out.println("####**finally you selected :>HP-410**####\n");
			System.out.println("PRICE=55000\nCOLOR=SILVER\nRAM=6GB");
			System.out.println("!~~Press 1. for Buy~~!");
			getPayment();
			break;
		case 3:
			System.out.println("####**finally you selected :> HP-415**####\n");
			System.out.println("PRICE=65000\nCOLOR=SILVER\nRAM=8GB");
			System.out.println("!~~Press 1. for Buy~~!");
			getPayment();
			break;
		case 4:
			System.out.println("####**finally you selected :> HP-420**####\n");
			System.out.println("PRICE=75000\nCOLOR=SILVER\nRAM=8GB");
			System.out.println("!~~Press 1. for Buy~~!");
			getPayment();
		case 5:
			Laptop.getLaptop();
			break;
		default:
			System.out.println("Please select valid number");
			getHP();
            
		}
		
	}
	
	
	
	public static void getDELL() {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		 switch(n1)
		 {
		 
		 case 1:
			System.out.println("####**finally you selected :> DELL-405**####\n");
			System.out.println("PRICE=45000\nCOLOR=SILVER\nRAM=4GB");
			System.out.println("!~~Press 1. for Buy~~!");
			getPayment();
			break;
		case 2:
			System.out.println("####**finally you selected :> DELL-410**####\n");
			System.out.println("PRICE=55000\nCOLOR=SILVER\nRAM=6GB");
			System.out.println("!~~Press 1. for Buy~~!");
			getPayment();
			break;
		case 3:
			System.out.println("####**finally you selected :> DELL-415**####\n");
			System.out.println("PRICE=65000\nCOLOR=SILVER\nRAM=8GB");
			System.out.println("!~~Press 1. for Buy~~!");
			getPayment();
			break;
		case 4:
			System.out.println("####**finally you selected :> DELL-420**####\n");
			System.out.println("PRICE=75000\nCOLOR=SILVER\nRAM=8GB");
			System.out.println("!~~Press 1. for Buy~~!");
			getPayment();
		case 5:
			Laptop.getLaptop();
			break;
		default:
			System.out.println("Please select valid number");
			getDELL();
            
		}
		
	}
	
	
	
	public static void getACER() {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		 switch(n1)
		 {
		 
		 case 1:
			System.out.println("####**finally you selected :> ACER-405**####\n");
			System.out.println("PRICE=45000\nCOLOR=SILVER\nRAM=4GB");
			System.out.println("!~~Press 1. for Buy~~!");
			getPayment();
			break;
		case 2:
			System.out.println("####**finally you selected :> ACER-410**####\n");
			System.out.println("PRICE=55000\nCOLOR=SILVER\nRAM=6GB");
			System.out.println("!~~Press 1. for Buy~~!");
			getPayment();
			break;
		case 3:
			System.out.println("####**finally you selected :> ACER-415**####\n");
			System.out.println("PRICE=65000\nCOLOR=SILVER\nRAM=8GB");
			System.out.println("!~~Press 1. for Buy~~!");
			getPayment();
			break;
		case 4:
			System.out.println("####**finally you selected :> ACER-420**####\n");
			System.out.println("PRICE=75000\nCOLOR=SILVER\nRAM=8GB");
			System.out.println("!~~Press 1. for Buy~~!");
			getPayment();
		case 5:
			Laptop.getLaptop();
			break;
		default:
			System.out.println("Please select valid number");
			getACER();
            
		}
		
	}
	
	
	
	public static void getLaptop() {

		System.out.println("**--Please select which brands do you like~~**");
		System.out.println("1.Asus\n2.Hp\n3.Dell\n4.Acer\n5.back to main menu");
		Scanner sc = new Scanner(System.in);
		int
		n = sc.nextInt();

		switch (n) {
		case 1:

			System.out.println("\n       ^^^ Wow to select Asus  Special Gaming Laptops^^^\n");
			System.out.println("**~~Please select ModelNo. in Asus Company~~** ");
			System.out.println("1.Asus-405\n2.Asus-410\n3.Asus-415\n4.Asus-420\n5.Back Menu");
			
			asusGet();
			break;
			
		case 2:

			System.out.println("\n       ^^^ Wow to select HP  Special beauty Laptops^^^\n");
			System.out.println("**~~Please select ModelNo. in HP Company~~** ");
			System.out.println("1.HP-405\n2.HP-410\n3.HP-415\n4.HP-420\n5.Back Menu");
			
			getHP();
			break;

		case 3:
 
			System.out.println("\n       ^^^ Wow to select DELL Special beauty Laptops^^^\n");
			System.out.println("**~~Please select ModelNo. in DELL Company~~** ");
			System.out.println("1.DELL-405\n2.DELL-410\n3.DELL-415\n4.DELL-420\n5.Back Menu");
			
			 getDELL();
            break;
			

		case 4:

			System.out.println("\n       ^^^ Wow to select ACER  Special beauty Laptops^^^\n");
			System.out.println("**~~Please select ModelNo. in ACER Company~~** ");
			System.out.println("1.ACER-405\n2.ACER-410\n3.ACER-415\n4.ACER-420\n5.Back Menu");
			
			getACER();
			break;
		case 5:
	
			 Electronic.getBack();
			break ;
			
			
		default:
			System.out.println("Please choose valid number");
           getLaptop();
		
		
		
		
		}
	}
}


/////////////  MOBILE BRAND----****
class Mobile extends Electronic {
	
	public static void getOppo() {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		 switch(n1)
		 {
		 
		 case 1:
			System.out.println("####**finally you selected :> OPPO-405**####\n");
			System.out.println("PRICE=10000\nCOLOR=SILVER\nRAM=4GB");
			System.out.println("!~~Press 1. for Buy~~!");
			getPayment();
			break;
		case 2:
			System.out.println("####**finally you selected :> OPPO-410**####\n");
			System.out.println("PRICE=15000\nCOLOR=SILVER\nRAM=6GB");
			System.out.println("!~~Press 1. for Buy~~!");
			getPayment();
			break;
		case 3:
			System.out.println("####**finally you selected :> OPPO-415**####\n");
			System.out.println("PRICE=20000\nCOLOR=SILVER\nRAM=8GB");
			System.out.println("!~~Press 1. for Buy~~!");
			getPayment();
			break;
		case 4:
			System.out.println("####**finally you selected :> OPPO-420**####\n");
			System.out.println("PRICE=30000\nCOLOR=SILVER\nRAM=8GB");
			System.out.println("!~~Press 1. for Buy~~!");
			getPayment();
			break;
		case 5:
			getMobile();
			break;
		default:
			System.out.println("Please select valid number");
			getOppo();
            
		}
		
	}
	
	public static void getVivo() {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		 switch(n1)
		 {
		 
		 case 1:
			System.out.println("####**finally you selected :> VIVO-405**####\n");
			System.out.println("PRICE=10000\nCOLOR=SILVER\nRAM=4GB");
			System.out.println("!~~Press 1. for Buy~~!");
			getPayment();
			break;
		case 2:
			System.out.println("####**finally you selected :> VIVO-410**####\n");
			System.out.println("PRICE=15000\nCOLOR=SILVER\nRAM=6GB");
			System.out.println("!~~Press 1. for Buy~~!");
			getPayment();
			break;
		case 3:
			System.out.println("####**finally you selected :> VIVO-415**####\n");
			System.out.println("PRICE=20000\nCOLOR=SILVER\nRAM=8GB");
			System.out.println("!~~Press 1. for Buy~~!");
			getPayment();
			break;
		case 4:
			System.out.println("####**finally you selected :> VIVO-420**####\n");
			System.out.println("PRICE=30000\nCOLOR=SILVER\nRAM=8GB");
			System.out.println("!~~Press 1. for Buy~~!");
			getPayment();
			break;
		case 5:
			getMobile();
			break;
		default:
			System.out.println("Please select valid number");
			getVivo();
            
		}
		
	}
	
	public static void getRealmi() {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		 switch(n1)
		 {
		 
		 case 1:
			System.out.println("####**finally you selected :> REALMI-405**####\n");
			System.out.println("PRICE=10000\nCOLOR=SILVER\nRAM=4GB");
			System.out.println("!~~Press 1. for Buy~~!");
			getPayment();
			break;
		case 2:
			System.out.println("####**finally you selected :> REALMI-410**####\n");
			System.out.println("PRICE=15000\nCOLOR=SILVER\nRAM=6GB");
			System.out.println("!~~Press 1. for Buy~~!");
			getPayment();
			break;
		case 3:
			System.out.println("####**finally you selected :> REALMI-415**####\n");
			System.out.println("PRICE=20000\nCOLOR=SILVER\nRAM=8GB");
			System.out.println("!~~Press 1. for Buy~~!");
			getPayment();
			break;
		case 4:
			System.out.println("####**finally you selected :> REALMI-420**####\n");
			System.out.println("PRICE=30000\nCOLOR=SILVER\nRAM=8GB");
			System.out.println("!~~Press 1. for Buy~~!");
			getPayment();
			break;
		case 5:
			getMobile();
			break;
		default:
			System.out.println("Please select valid number");
			getRealmi();
            
		}
		
	}
	
	public static void getIphone() {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		 switch(n1)
		 {
		 
		 case 1:
			System.out.println("####**finally you selected :> IPHONE-6**####\n");
			System.out.println("PRICE=35000\nCOLOR=SILVER\nRAM=4GB");
			System.out.println("!~~Press 1. for Buy~~!");
			getPayment();
			break;
		case 2:
			System.out.println("####**finally you selected :> IPHONE-7**####\n");
			System.out.println("PRICE=45000\nCOLOR=SILVER\nRAM=6GB");
			System.out.println("!~~Press 1. for Buy~~!");
			getPayment();
			break;
		case 3:
			System.out.println("####**finally you selected :> IPHONE-x**####\n");
			System.out.println("PRICE=75000\nCOLOR=SILVER\nRAM=8GB");
			System.out.println("!~~Press 1. for Buy~~!");
			getPayment();
			break;
		case 4:
			System.out.println("####**finally you selected :> IPHONE-12**####\n");
			System.out.println("PRICE=100000\nCOLOR=SILVER\nRAM=8GB");
			System.out.println("!~~Press 1. for Buy~~!");
			getPayment();
			break;
		case 5:
			getMobile();
			break;
		default:
			System.out.println("Please select valid number");
			getIphone();
            
		}
		
	}
	
	public static void getMobile() {

		System.out.println("**--Please select which brands do you like~~**");
		System.out.println("1.OPPO\n2.VIVO\n3.REALMI\n4.IPHONE\n5.Main menu");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		switch (n) {
		case 1:

			System.out.println("\n       ^^^ Wow to select Oppo Mobile  S^^^\n");
			System.out.println("**~~Please select ModelNo. in Oppo Company~~** ");
			System.out.println("1.OPPO-405\n2.OPPO-410\n3.OPPO-415\n4.OPPO-420\n5.Back Menu");
			
			getOppo();
			break;
			
		case 2:

			System.out.println("\n       ^^^ Wow to select Smart Vivo Mobile^^^\n");
			System.out.println("**~~Please select ModelNo. in VIVO Company~~** ");
			System.out.println("1.VIVO-405\n2.VIVO-410\n3.VIVO-415\n4.VIVO-420\n5.Back Menu");
			
			getVivo();
			break;

		case 3:
 
			System.out.println("\n       ^^^ Wow to select Nice Realmi Mobile ^^^\n");
			System.out.println("**~~Please select ModelNo. in REALMI Company~~** ");
			System.out.println("1.REALMI-405\n2.REALMI-410\n3.REALMI-415\n4.REALMI-420\ne.Back Menu");
			
			 getRealmi();
            break;
			

		case 4:

			System.out.println("\n       ^^^ Wow to select Awesome IPHONE Mobile   ^^^\n");
			System.out.println("**~~Please select ModelNo. in IPHONE Company~~** ");
			System.out.println("1.IPHONE-6\n2.IHONE-7\n3.IPHONE-X\n4.IPHONE-12\n5.Back Menu");
			
			getIphone();
			break;
		case 5:
	
			 Electronic.getBack();
			break ;
			
			
		default:
			System.out.println("Please choose valid number");
           getMobile();
		
		
		
		
		}
	}
}

///////////////// TV BRAND----****
	class Tv extends Electronic {
		
		
		
		
		public static void getSony() {
			Scanner sc=new Scanner(System.in);
			int n1=sc.nextInt();
			 switch(n1)
			 {
			 
			 case 1:
				System.out.println("####**finally you selected :> SONY-405**####\n");
				System.out.println("PRICE=10000\nCOLOR=SILVER\nSIZE=4CM");
				System.out.println("!~~Press 1. for Buy~~!");
				getPayment();
				break;
			case 2:
				System.out.println("####**finally you selected :> SONY-410**####\n");
				System.out.println("PRICE=15000\nCOLOR=SILVER\nSIZE=6CM");
				System.out.println("!~~Press 1. for Buy~~!");
				getPayment();
				break;
			case 3:
				System.out.println("####**finally you selected :> SONY-415**####\n");
				System.out.println("PRICE=20000\nCOLOR=SILVER\nSIZE=8CM");
				System.out.println("!~~Press 1. for Buy~~!");
				getPayment();
				break;
			case 4:
				System.out.println("####**finally you selected :> SONY-420**####\n");
				System.out.println("PRICE=30000\nCOLOR=SILVER\nSIZE=8CM");
				System.out.println("!~~Press 1. for Buy~~!");
				getPayment();
				break;
			case 5:
				getTv();
				break;
			default:
				System.out.println("Please select valid number");
				getSony();
	            
			}
			
		}
		
		public static void getOnida() {
			Scanner sc=new Scanner(System.in);
			int n1=sc.nextInt();
			 switch(n1)
			 {
			 
			 case 1:
				System.out.println("####**finally you selected :> ONIDA-405**####\n");
				System.out.println("PRICE=10000\nCOLOR=SILVER\nSIZE=4CM");
				System.out.println("!~~Press 1. for Buy~~!");
				getPayment();
				break;
			case 2:
				System.out.println("####**finally you selected :> ONIDA-410**####\n");
				System.out.println("PRICE=15000\nCOLOR=SILVER\nSIZE=6CM");
				System.out.println("!~~Press 1. for Buy~~!");
				getPayment();
				break;
			case 3:
				System.out.println("####**finally you selected :> ONIDA-415**####\n");
				System.out.println("PRICE=20000\nCOLOR=SILVER\nSIZE=8CM");
				System.out.println("!~~Press 1. for Buy~~!");
				getPayment();
				break;
			case 4:
				System.out.println("####**finally you selected :> ONIDA-420**####\n");
				System.out.println("PRICE=30000\nCOLOR=SILVER\nSIZE=8CM");
				System.out.println("!~~Press 1. for Buy~~!");
				getPayment();
				break;
			case 5:
				getTv();
				break;
			default:
				System.out.println("Please select valid number");
				getOnida();
	            
			}
			
		}
		
		public static void getSamsung() {
			Scanner sc=new Scanner(System.in);
			int n1=sc.nextInt();
			 switch(n1)
			 {
			 
			 case 1:
				System.out.println("####**finally you selected :> SAMSUNG-405**####\n");
				System.out.println("PRICE=10000\nCOLOR=SILVER\nSIZE=4CM");
				System.out.println("!~~Press 1. for Buy~~!");
				getPayment();
				break;
			case 2:
				System.out.println("####**finally you selected :> SAMSUNG-410**####\n");
				System.out.println("PRICE=15000\nCOLOR=SILVER\nSIZE=6CM");
				System.out.println("!~~Press 1. for Buy~~!");
				getPayment();
				break;
			case 3:
				System.out.println("####**finally you selected :> SAMSUNG-415**####\n");
				System.out.println("PRICE=20000\nCOLOR=SILVER\nSIZE=8CM");
				System.out.println("!~~Press 1. for Buy~~!");
				getPayment();
				break;
			case 4:
				System.out.println("####**finally you selected :> SAMSUNG-420**####\n");
				System.out.println("PRICE=30000\nCOLOR=SILVER\nSIZE=8CM");
				System.out.println("!~~Press 1. for Buy~~!");
				getPayment();
				break;
			case 5:
				getTv();
				break;
			default:
				System.out.println("Please select valid number");
				getSamsung();
	            
			}
			
		}
		
		public static void getLg() {
			Scanner sc=new Scanner(System.in);
			int n1=sc.nextInt();
			 switch(n1)
			 {
			 
			 case 1:
				System.out.println("####**finally you selected :> LG-6**####\n");
				System.out.println("PRICE=35000\nCOLOR=SILVER\nSIZE=4CM");
				System.out.println("!~~Press 1. for Buy~~!");
				getPayment();
				break;
			case 2:
				System.out.println("####**finally you selected :> LG-7**####\n");
				System.out.println("PRICE=45000\nCOLOR=SILVER\nSIZE=6CM");
				System.out.println("!~~Press 1. for Buy~~!");
				getPayment();
				break;
			case 3:
				System.out.println("####**finally you selected :> LG-x**####\n");
				System.out.println("PRICE=75000\nCOLOR=SILVER\nSIZE=8CM");
				System.out.println("!~~Press 1. for Buy~~!");
				getPayment();
				break;
			case 4:
				System.out.println("####**finally you selected :> LG-12**####\n");
				System.out.println("PRICE=100000\nCOLOR=SILVER\nSIZE=8CM");
				System.out.println("!~~Press 1. for Buy~~!");
				getPayment();
				break;
			case 5:
				getTv();
				break;
			default:
				System.out.println("Please select valid number");
				getLg();
	            
			}
			
		}
		
		public static void getTv() {

			System.out.println("**--Please select which brands do you like~~**");
			System.out.println("1.SONY\n2.ONIDA\n3.SAMSUNG\n4.LG\n5.Main menu");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();

			switch (n) {
			case 1:

				System.out.println("\n       ^^^ Wow to select Fabulous SONY TV   ^^^\n");
				System.out.println("**~~Please select ModelNo. in SONY Company~~** ");
				System.out.println("1.SONY-405\n2.SONY-410\n3.SONY-415\n4.SONY-420\n5.MAIN Menu");
				
				getSony();
				break;
				
			case 2:

				System.out.println("\n       ^^^ Wow to select Smart ONIDA TV^^^\n");
				System.out.println("**~~Please select ModelNo. in VIVO Company~~** ");
				System.out.println("1.ONIDA-405\n2.ONIDA-410\n3.ONIDA-415\n4.ONIDA-420\n5.Back Menu");
				
				getOnida();
				break;

			case 3:
	 
				System.out.println("\n       ^^^ Wow to select Nice SAMSUNG TV ^^^\n");
				System.out.println("**~~Please select ModelNo. in SAMSUNG Company~~** ");
				System.out.println("1.SAMSUNG-405\n2.SAMSUNG-410\n3.SAMSUNG-415\n4.SAMSUNG-420\n5.Back Menu");
				
				 getSamsung();
	            break;
				

			case 4:

				System.out.println("\n       ^^^ Wow to select Awesome LG TV  ^^^\n");
				System.out.println("**~~Please select ModelNo. in LG Company~~** ");
				System.out.println("1.LG-6\n2.LG-7\n3.LG-X\n4.LG-12\n5.Back Menu");
				
				getLg();
				break;
			case 5:
		
				 Electronic.getBack();
				break ;
				
				
			default:
				System.out.println("Please choose valid number");
	           getTv();
			
			
			
			
			}
		}
	}


	

//////////////  FRIDGE BRAND------****
	class Fridge extends Electronic {
		
		

		public static void getWhirlpool() {
			Scanner sc=new Scanner(System.in);
			int n1=sc.nextInt();
			 switch(n1)
			 {
			 
			 case 1:
				System.out.println("####**finally you selected :> Whirlpool-405**####\n");
				System.out.println("PRICE=10000\nCOLOR=SILVER\nSTAR=**");
				System.out.println("!~~Press 1. for Buy~~!");
				getPayment();
				break;
			case 2:
				System.out.println("####**finally you selected :> Whirlpool-410**####\n");
				System.out.println("PRICE=15000\nCOLOR=SILVER\nSTAR=***");
				System.out.println("!~~Press 1. for Buy~~!");
				getPayment();
				break;
			case 3:
				System.out.println("####**finally you selected :> Whirlpool-415**####\n");
				System.out.println("PRICE=20000\nCOLOR=SILVER\nSTAR=****");
				System.out.println("!~~Press 1. for Buy~~!");
				getPayment();
				break;
			case 4:
				System.out.println("####**finally you selected :> Whirlpool-420**####\n");
				System.out.println("PRICE=30000\nCOLOR=SILVER\nSTAR=*****");
				System.out.println("!~~Press 1. for Buy~~!");
				getPayment();
				break;
			case 5:
				getFridge();
				break;
			default:
				System.out.println("Please select valid number");
				getWhirlpool();
	            
			}
			
		}
		
		public static void getGodrej() {
			Scanner sc=new Scanner(System.in);
			int n1=sc.nextInt();
			 switch(n1)
			 {
			 
			 case 1:
				System.out.println("####**finally you selected :> ONIDA-405**####\n");
				System.out.println("PRICE=10000\nCOLOR=SILVER\nSTAR=**");
				System.out.println("!~~Press 1. for Buy~~!");
				getPayment();
				break;
			case 2:
				System.out.println("####**finally you selected :> ONIDA-410**####\n");
				System.out.println("PRICE=15000\nCOLOR=SILVER\nSTAR=***");
				System.out.println("!~~Press 1. for Buy~~!");
				getPayment();
				break;
			case 3:
				System.out.println("####**finally you selected :> ONIDA-415**####\n");
				System.out.println("PRICE=20000\nCOLOR=SILVER\nSTAR=****");
				System.out.println("!~~Press 1. for Buy~~!");
				getPayment();
				break;
			case 4:
				System.out.println("####**finally you selected :> ONIDA-420**####\n");
				System.out.println("PRICE=30000\nCOLOR=SILVER\nSTAR=*****");
				System.out.println("!~~Press 1. for Buy~~!");
				getPayment();
				break;
			case 5:
				getFridge();
				break;
			default:
				System.out.println("Please select valid number");
				getGodrej();
	            
			}
			
		}
		
		public static void getSamsung() {
			Scanner sc=new Scanner(System.in);
			int n1=sc.nextInt();
			 switch(n1)
			 {
			 
			 case 1:
				System.out.println("####**finally you selected :> SAMSUNG-405**####\n");
				System.out.println("PRICE=10000\nCOLOR=SILVER\nSTAR=**");
				System.out.println("!~~Press 1. for Buy~~!");
				getPayment();
				break;
			case 2:
				System.out.println("####**finally you selected :> SAMSUNG-410**####\n");
				System.out.println("PRICE=15000\nCOLOR=SILVER\nSTAR=***");
				System.out.println("!~~Press 1. for Buy~~!");
				getPayment();
				break;
			case 3:
				System.out.println("####**finally you selected :> SAMSUNG-415**####\n");
				System.out.println("PRICE=20000\nCOLOR=SILVER\nSTAR=****");
				System.out.println("!~~Press 1. for Buy~~!");
				getPayment();
				break;
			case 4:
				System.out.println("####**finally you selected :> SAMSUNG-420**####\n");
				System.out.println("PRICE=30000\nCOLOR=SILVER\nSTAR=*****");
				System.out.println("!~~Press 1. for Buy~~!");
				getPayment();
				break;
			case 5:
				getFridge();
				break;
			default:
				System.out.println("Please select valid number");
				getSamsung();
	            
			}
			
		}
		
		public static void getLg() {
			Scanner sc=new Scanner(System.in);
			int n1=sc.nextInt();
			 switch(n1)
			 {
			 
			 case 1:
				System.out.println("####**finally you selected :> LG-6**####\n");
				System.out.println("PRICE=35000\nCOLOR=SILVER\nSTAR=**");
				System.out.println("!~~Press 1. for Buy~~!");
				getPayment();
				break;
			case 2:
				System.out.println("####**finally you selected :> LG-7**####\n");
				System.out.println("PRICE=45000\nCOLOR=SILVER\nSTAR=***");
				System.out.println("!~~Press 1. for Buy~~!");
				getPayment();
				break;
			case 3:
				System.out.println("####**finally you selected :> LG-x**####\n");
				System.out.println("PRICE=75000\nCOLOR=SILVER\nSTAR=****");
				System.out.println("!~~Press 1. for Buy~~!");
				getPayment();
				break;
			case 4:
				System.out.println("####**finally you selected :> LG-12**####\n");
				System.out.println("PRICE=100000\nCOLOR=SILVER\nSTAR=*****");
				System.out.println("!~~Press 1. for Buy~~!");
				getPayment();
				break;
			case 5:
				getFridge();
				break;
			default:
				System.out.println("Please select valid number");
				getLg();
	            
			}
			
		}
		
		public static void getFridge() {

			System.out.println("**--Please select which brands do you like~~**");
			System.out.println("1.WHIRLPOOL\n2.GODREJ\n3.SAMSUNG\n4.LG\n5.Main menu");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();

			switch (n) {
			case 1:

				System.out.println("\n       ^^^ Wow to select Fabulous Whirlpool   ^^^\n");
				System.out.println("**~~Please select ModelNo. in Whirlpool Company~~** ");
				System.out.println("1.Whirlpool-405\n2.Whirlpool-410\n3.Whirlpool-415\n4.Whirlpool-420\n5.MAIN Menu");
				
				getWhirlpool();
				break;
				
			case 2:

				System.out.println("\n       ^^^ Wow to select Smart Godrej ^^^\n");
				System.out.println("**~~Please select ModelNo. in Godrej Company~~** ");
				System.out.println("1.Godrej-405\n2.Godrej-410\n3.Godrej-415\n4.Godrej-420\n5.Back Menu");
				
				getGodrej();
				break;

			case 3:
	 
				System.out.println("\n       ^^^ Wow to select Nice SAMSUNG  ^^^\n");
				System.out.println("**~~Please select ModelNo. in Samsung Company~~** ");
				System.out.println("1.Samsung-405\n2.Samsung-410\n3.Samsung-415\n4.Samsung-420\n5.Back Menu");
				
				 getSamsung();
	            break;
				

			case 4:

				System.out.println("\n       ^^^ Wow to select Awesome LG   ^^^\n");
				System.out.println("**~~Please select ModelNo. in LG Company~~** ");
				System.out.println("1.LG-6\n2.LG-7\n3.LG-X\n4.LG-12\n5.Back Menu");
				
				getLg();
				break;
			case 5:
		
				 Electronic.getBack();
				break ;
				
				
			default:
				System.out.println("Please choose valid number");
	           getFridge();
			
			
			
			
			}
		}
	}


	

	

	////// DRIVER CLASS------MAIN METHOD************&&&&&********#######//////////

class Electronics
{
   
	 public static void main(String [] args)
	
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("*********/// WELCOME TO IN ELECTRONIC SHOP ////***********\n\n\n");
		 System.out.println("--Please Fill The Login Details--\n");
		
			 
		 Electronic.getLogin();
		 Electronic.getElectronic();
	 }
			 }
  
  


