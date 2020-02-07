package task.NewYearGift.epam;

public class Gifts_NewYear {
	Chocolates choc_gift[];
	Sweets swt_gift[];
	int gift_wt=0;
	public Gifts_NewYear(Sweets s[],Chocolates c[])
	{
		this.swt_gift=s;
		this.choc_gift=c;
	}
	public void find_weight()
	{
		for(int i=0;i<swt_gift.length;i++)
		{
			gift_wt+=swt_gift[i].cost;
		}
		for(int i=0;i<choc_gift.length;i++)
		{
			gift_wt+=choc_gift[i].cost;
		}
		System.out.println("Total Weight of Children's gift is:"+gift_wt);
	}
	public void sort_chocolates()
	{
		for(int i=0;i<choc_gift.length-1;i++)
		{
			for(int j=0;j<choc_gift.length-i-1;j++)
			{
				if(choc_gift[j].cost>choc_gift[j+1].cost)
				{
					Chocolates temp=choc_gift[j];
					choc_gift[j]=choc_gift[j+1];
					choc_gift[j+1]=temp;
				}
			}
		}
	}
	public void find_candies()
	{
		System.out.println("Candies in the Children's Gift whose cost is less than 100 is:");
		for(int i=0;i<choc_gift.length;i++)
		{
			if(choc_gift[i].cost>=100)
			{
				break;
			}
			System.out.println("Name:"+choc_gift[i].name);
			System.out.println("Flavour:"+choc_gift[i].flavour);
			System.out.println("Cost:"+choc_gift[i].cost);
		}
	}

}
