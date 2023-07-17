//Program to check whether it's profit or loss . if so, how much?
//
//
//
class ProfitLoss_Check{

	public static void main(String[] args){

	int SellingPrice = 300;//1200;
	int CostPrice = 300;//500;//1000;

	if (SellingPrice > CostPrice)
		System.out.println("Profit of Rs." + (SellingPrice - CostPrice));
	else if(CostPrice > SellingPrice)
		System.out.println("Loss of Rs." + (CostPrice - SellingPrice));
	else
		System.out.println("Neither Profit Nor Loss");

     }
   }
