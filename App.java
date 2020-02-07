package task.NewYearGift.epam;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        int no_of_sweets;
        int no_of_chocolates;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the total number of sweets in gift:");
        no_of_sweets=scan.nextInt();
        Sweets s[]=new Sweets[no_of_sweets];
        for(int i=0;i<no_of_sweets;i++)
    	{
    		System.out.println("Enter details of the sweet "+(i+1)+":");
    		System.out.print("Name of the sweet:");
    		String sname=scan.next();
    		System.out.print("Quantity it holds:");
    		int squantity=scan.nextInt();
    		System.out.print("Cost of sweet:");
    		int scost=scan.nextInt();
    		s[i]=new Sweets(sname,squantity,scost);
    	}
    	System.out.println("Enter total number of Chocolates in the Gift:");
    	no_of_chocolates=scan.nextInt();
    	Chocolates c[]=new Chocolates[no_of_chocolates];
    	for(int i=0;i<no_of_chocolates;i++)
    	{
    		System.out.println("Enter details of Chocolate "+(i+1)+":");
    		System.out.print("Name of the chocolate:");
    		String cname=scan.next();
    		System.out.print("Flavour it has:");
    		String cflavour=scan.next();
    		System.out.print("Cost of the chocolate:");
    		int ccost=scan.nextInt();
    		c[i]=new Chocolates(cname,cflavour,ccost);
    	}
    	Gifts_NewYear n=new Gifts_NewYear(s,c);
    	n.find_weight();
    	n.sort_chocolates();
    	n.find_candies();
    	scan.close();
        
    }
}
