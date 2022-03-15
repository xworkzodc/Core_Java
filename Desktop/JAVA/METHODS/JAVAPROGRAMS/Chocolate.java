class Chocolate{
double money=200.0;
double chocoPrice=19.0;
double fixMoney=money;


void buy(int noOfChocolates)
{
System.out.println("RUNNING METHOD");
double tempMoney=noOfChocolates*chocoPrice;//TEMP=50
this.money=this.money-tempMoney;//100-50=50  VALUE=50

if(this.fixMoney>=tempMoney)//100>=50 satisfied
{
		System.out.println("HAVING MONEY WE CAN BUY CHOCOLATES"+this.money);
		double fixingMoney=this.money/this.chocoPrice;
		System.out.println("WE CAN STILL BUY CHOCOLATES");
		
		//100=50/10=5
}

else{
	double fixingMoney1=this.fixMoney/noOfChocolates;
	System.out.println("Money is less so u cannot buy");
}
















}

















}