class SoftwareTester{
public static void main(String[] args){

Software software=new Software();

software.about();

software.execute();
System.out.println(Software.lang);
//System.out.println(Software.version);SoftwareTester.java:7: error: non-static variable version cannot be referenced from a static context


software.updateVersion();
software.updateVersion(5);
software.updateVersion("JAVA",Platform.WINDOWS);
//software.updatesoftwareTypes("javascript",SoftwareTypes.DOS);//IT WILL NOT TAKE BECUASE WE WERE NOT DECLARE IN THE ENUM VALUES//
software.updateSoftwareTypes("javascript",SoftwareTypes.DESIGN);


}


}