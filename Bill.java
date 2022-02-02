package FoodOrder;
public class Bill 
{
    String itemname;
    int qty;
    double amt,tot;
    public Bill(String itemname,int qty,double amt,double tot)
    {
	    this.itemname=itemname;
	    this.qty=qty;
	    this.amt=amt;
	    this.tot=tot;
    }
}
