package FoodOrder;
import java.util.*;
public class FoodOrderingSystem
{
	public static void main(String args[])
	{	
		String ch;
		Scanner sc=new Scanner(System.in);
		OrderFood.menu();
		do	
		{
			System.out.print("\nPress 1 to choose Starters"
		                    +"\nPress 2 to choose Main Course"
		                    +"\nPress 3 to choose Desserts"
		                    +"\nPress 4 to choose Beverages"
		                    +"\n\nChoose category from our Menu:");
	    	int cat_choice=sc.nextInt();
	    	switch(cat_choice)
	    	{
        		case 1:System.out.println("I. Starters");
         	           OrderFood.starters();
	   	               System.out.print("\nChoose item from Starters:");
	    	           int it_choice1=sc.nextInt();
	    	           switch(it_choice1)
		   	           {
		   		           case 1:OrderFood.Quantity("Chilli Chicken   ",250); 
		   		                  break;
		   		           case 2:OrderFood.Quantity("Crab Lollipop    ",200); 
		   		                  break;
		   	               default:System.out.println("Invalid...Re-enter");
		   		       }
		               break;
		        case 2:System.out.println("II. Main Course");
		               OrderFood.maincourse();
	                   System.out.print("\nChoose item from MainCourse:");
		    	       int it_choice2=sc.nextInt();
		    	       switch(it_choice2)
			   	       {
			   		       case 3:OrderFood.Quantity("Chicken Biryani  ",100); 
			   		              break;
			   		       case 4:OrderFood.Quantity("Prawn Fried Rice ",120); 
			   		              break;
			   	           default:System.out.println("Invalid...Re-enter");
			   		   }
	                   break;
		        case 3:System.out.println("III. Desserts");
		               OrderFood.desserts();
	                   System.out.print("\nChoose item from Desserts:");
	    	           int it_choice3=sc.nextInt();
	    	           switch(it_choice3)
		   	    	   {
		   		            case 5:OrderFood.Quantity("Tender Pudding   ",90); 
		   			               break;
		   		            case 6:OrderFood.Quantity("Plum Cake        ",220); 
		   		                   break;
		                	default:System.out.println("Invalid...Re-enter");
		   		       }
	                   break;
	           case 4:System.out.println("IV. Beverages");
		              OrderFood.beverages();
	                  System.out.print("\nChoose item from Beverages:");
	    	          int it_choice4=sc.nextInt();
	    	          switch(it_choice4)
		   	          {
		   	        	    case 7:OrderFood.Quantity("Chikku Shake     ",80); 
		   			               break;
		   		            case 8:OrderFood.Quantity("Pomegranate Juice",70); 
		   	                	   break;
		   	                default:System.out.println("Invalid...Re-enter");
		   	       	  }
	                  break;
	           default:System.out.println("Invalid...Re-enter");
		    }
		    System.out.print("Continue ordering Press(Y/N):");
		    ch=sc.next();
	    }while(ch.equalsIgnoreCase("y"));
		System.out.print("Enter your Name:");
		String name=sc.next();
		System.out.print("Enter your Mob.No:");
		String no=sc.next();
		OrderFood.Billing();
	}
}
