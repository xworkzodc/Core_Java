//Shoe -- size:enum, price,brand,type:enum, displayDetails(),changePrice()
class Shoe{
Size size;
int price;
String brand;
Type type;

void displayDetails()
{

System.out.println("INVOKING DEFAULT METHOD :");
this.size=Size.TEN;
System.out.println(this.size);
this.price=price;
System.out.println(price);
this.brand=brand;
System.out.println(this.brand);
this.type=type;
System.out.println(this.type);


}

void changePrice()
{
	System.out.println("CHANGING THE PRICE OF THE SHOE :");
	this.price=price;
	price=price+500;
	System.out.println(price);
}

}





