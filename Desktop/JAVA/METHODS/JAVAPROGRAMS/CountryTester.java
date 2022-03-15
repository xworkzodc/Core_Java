class CountryTester{
public static void main(String[] args){

Country country=new Country();

country.add("INDIA");
country.add("SOUTH AFRICA");
country.add("RUSSIA");
country.add("CHINA");
country.add("UKRAIN");
country.add("NORTH AMERICA");
country.add("SOUTH AMERICA");
country.add("POLAND");
country.add("FRANCE");
country.add("ITALY");
country.add("JAPAN");
country.add("CHILE");
country.add("SOUTH AMERICA");
country.add("ZIMBABWE");
country.add("ENGLAND");
country.add("SRI LANKA");
country.add("BELGIUM");
country.add("NEPAL");
country.add("TURKEY");
country.add("EGYPT");
country.add("NIGERIA");

boolean countryName=country.find("INDIA");
System.out.println(countryName);

country.display();
country.delete(2);
country.display();
country.delete(19);
country.display();
country.delete("UKRAIN");
country.display();

}






}