//HeadSet -- type:enum,price,volume,displayDetails(),changeVolume();
class HeadSet{
Types types;
int price;
float volume;

void updateDisplayDetails()
{
	this.types=types;
	this.price=price;
	this.volume=volume;
	System.out.println(this.types);
	System.out.println(this.price);
	System.out.println(this.volume);
	
}
void updateChangeVolume()
{
	System.out.println("UPDATING VOLUME REQUIREMENTS");
	this.volume=volume;
	this.volume=volume+100;
	System.out.println(this.volume);
}



}