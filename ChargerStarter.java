class ChargerStarter
{
public static void main(String[] args){




Charger charger=new Charger();

charger.about();

charger.updateColor();

charger.updateColor("SAMSUNG","CABLE-A"); //doubt

charger.updateType();

charger.updateType("HEWLETPACKYARD",100);

charger.updateWatts();

charger.updateWatts(Watts.FIFTYWATTS,true);

charger.updateBrand();

charger.updateBrand("AVITO");

charger.updatePinType();

charger.updatePinType(100,PinType.USBB);

charger.updatePinType(105,PinType.USBC);

charger.updatePinType(100,PinType.USBD);

charger.updatePinType(100,PinType.USBE);

charger.updateusb();

charger.updateusb("CABLEAAA123");

charger.updateWireLength();

charger.updateWireLength("100");

charger.updateboolean();


charger.updateboolean(true);

charger.updateChargerProperities();



charger.updateChargerProperities(Color.WHITE,Type.rapidchargers,Watts.THIRTYWATTS,"NOKIA",PinType.USBB,100,true);




















}




}