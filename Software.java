class Software{
String name="JAVA";
static String lang="TELUGU";
Platform platform;
SoftwareTypes softwareTypes;
double version=5;



void about()
{
	
	System.out.println(this.lang);
	System.out.println(this.platform);
	System.out.println(this.softwareTypes);
	System.out.println(this.version);
}


void execute()
{

System.out.println("running execute");
double version=12.0;//local variable//
System.out.println(version);//local variable//
System.out.println(this.version);//whenever we used "this" it is showing reference it is becomming instance variable//
String name="SRIVIGNESH";
System.out.println(name);
String lang="KANNADA";
System.out.println(lang);
this.platform=Platform.WINDOWS;
System.out.println(platform);
this.platform=Platform.LINUX;
System.out.println(platform);
this.platform=Platform.SUNSOLORIS;
System.out.println(platform);

String platform="windows102936492";//here its a local variable//which is userdefined //
System.out.println(platform);
System.out.println(this.platform);//this is instance variable so here the previous value is stored//

String softwareTypes="PROGRAMMING";
System.out.println(softwareTypes);
System.out.println(this.softwareTypes);

//String softwareTypes="GAME";
System.out.println(softwareTypes);
System.out.println(this.softwareTypes);// here it is comming already executed in the main method//


System.out.println(version);//here the output is cooming from the 13 line we already initialised//
System.out.println(this.version);//this is the address of the instance variable;



}


static 
{
	System.out.println(lang);//3 line output
    //System.out.println(version);  //SoftwareTester.java:7: error: non-static variable version cannot be referenced from a static context//	
}


void updateVersion()
{
	System.out.println("VERSION BEFORE UPDATE"+this.version);//12.0
	this.version=version+5;
	this.version=version+100;
	this.version=version-90;
	System.out.println("VERSION AFTER UPDATING "+this.version);//13.0
	
}

void updateVersion(double version)
{
	this.version=version;
	System.out.println("VERSION IS UPDATED==="+this.version);
	
	this.version=version+10;
	System.out.println("version REUPDATED ==>"+this.version);
	
	this.version=version+1000;
	System.out.println("VERSION IS VERFIFIED AND UPDATED TO ==>"+this.version);
}

void updateVersion(String name,Platform platform)
{
	this.name=name;
	this.platform=platform;
	System.out.println("NAME IS UPDATED====="+this.name);
	System.out.println("PLATFORM IS UPDATED===="+this.platform);
}


void updateSoftwareTypes(String name,SoftwareTypes softwareTypes)
{
	this.name=name;
	this.softwareTypes=softwareTypes;
	System.out.println("NAME IS UPDATED ==>"+this.name);
	System.out.println("SOFTWARE TYPES UPDATED TO ===>"+this.softwareTypes);
}



}

