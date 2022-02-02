package FoodOrder;
import java.util.*;
public class OrderFood 
{
	static void menu()
	{
		System.out.println("Welcome to Delicious Food\n**************************************************************"
			            	+"\n\t\t\tStarters"
                            +"\n1.Chilli Chicken\t\t\t\t250"
                            +"\n2.Crab Lollipop\t\t\t\t\t200"
                            +"\n\n\t\t\tMain Course"
                            +"\n3.Chicken Biryani\t\t\t\t100"
                            +"\n4.Prawn Fried Rice\t\t\t\t120"
                            +"\n\n\t\t\tDesserts"
                            +"\n5.Tender Pudding\t\t\t\t90"
                            +"\n6.Plum Cake\t\t\t\t\t220"
                            +"\n\n\t\t\tBeverages"
                            +"\n7.Chikku Shake\t\t\t\t\t80"
                            +"\n8.Pomegranate Juice\t\t\t\t70"
                            +"\n**************************************************************");
    }
	static void starters()
	{
		System.out.println("1. Chilli Chicken\t\t250\n2. Crab Lollipop\t\t200"); 
	}
	static void maincourse()
	{
		System.out.println("3. Chicken Biryani\t\t100\n4. Prawn Fried Rice\t\t120");
	}
	static void desserts()
	{
		System.out.println("5. Tender Pudding\t\t90\n6. Plum Cake\t\t\t220");
	}
	static void beverages()
	{
		System.out.println("7. Chikku Shake\t\t\t80\n8. Pomegranate Juice\t\t70");
	}
	static ArrayList<Bill> list=new ArrayList<Bill>();
	static void Quantity(String itemname,int amt)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter quantity >"+itemname+":");
		int qty=sc.nextInt();
		double tot=qty*amt;
		list.add(new Bill(itemname,qty,amt,tot));
	}
    static void Billing()
	{
		double total=0.0;
		double GST;
		System.out.println("\nItem\t\t\t\tQty\tPrice\t   Total-Price\n--------------------------------------------------------------");
		for(Bill i:list)
		{
			System.out.println(i.itemname+"\t\t"+i.qty+"\t"+i.amt+"\t\t"+i.tot);
			total+=i.tot;
		}
		if(total<800 && total>200)
		{
			GST=total*0.03;
			total+=GST;
			System.out.println("--------------------------------------------------------------\nGST [3%]    :\t\t\t\t\t\t"+GST);
		}
		else if(total>=800 && total<2000)
		{
			GST=total*0.05;
			total+=GST;
			System.out.println("--------------------------------------------------------------\nGST [5%]    :\t\t\t\t\t\t"+GST);
		}
		else if(total>=2000 && total<5000)
		{
			GST=total*0.09;
			total+=GST;
			System.out.println("--------------------------------------------------------------\nGST [9%]    :\t\t\t\t\t\t"+GST);
		}
		else if(total>=5000 && total<8000)
		{
			GST=total*0.12;
			total+=GST;
			System.out.println("--------------------------------------------------------------\nGST [12%]    :\t\t\t\t\t\t"+GST);
		}
		else if(total>=8000)
		{
			GST=total*0.18;
			total+=GST;
			System.out.println("--------------------------------------------------------------\nGST [18%]    :\t\t\t\t\t\t"+GST);
		}
		System.out.println("Total amount:\t\t\t\t\t\t"+total);
		System.out.println("\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-\n            Thank You...Please Visit Again!!!!!\n*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
	}	
}
