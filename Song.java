//Song — name,length,type:enum,singerName,lang,writer
//about();updateName(),updateName(name),updateLength(),updateLength(length),update..,
//update(name,length,type,singerName,lang,writer);//

class Song{

String name;
static int length;
SingerName singerName;
Language language;
Writer writer;


void about()
{
	System.out.println(name);
	System.out.println(length); 
	System.out.println(singerName);
	System.out.println(language);
	System.out.println(writer);
	
}


void updateName()
{
	System.out.println("invoking update name deafult method");
	System.out.println("UPDATING THE DEATILS OF THE NAME="+name);
	this.name="VIGNESHROCKSTAR";
	System.out.println("UPDATING THE NAME="+this.name);
	
	this.name="SRIVIGNESH WORLD BEST ROCKSTAR";
	System.out.println("updating the name of the NEW RECORD==="+this.name);
	
}


void updateName(String name)
{
	System.out.println("UPDATING THE NEW MEMBER OF THE REPORT");
	this.name=name;
	System.out.println(this.name);
	
	
}


void updateLength()
{
	System.out.println("updating the new length of the song");
	this.length=4;
	System.out.println(this.length);
	this.length=11;
	System.out.println("updating new lenth of the song ");
	System.out.println(this.length);
	
}


void updateLength(int length)
{
	System.out.println("UPDATING THE NEW LENGTH OF THE SOONG");
	this.length=length;
	System.out.println(this.length);
}


void update(String name,int length,SingerName singerName,Language language,Writer writer)
{
	System.out.println("UPDATING ALL THE NEW SONG REQUIREMENTS OF THE MOVIE");
	this.name=name;
	this.length=length;
	this.singerName=singerName;
	this.language=language;
	this.writer=writer;
	System.out.println(this.name);
	System.out.println(this.length);
	System.out.println(this.singerName);
	System.out.println(this.language);
	System.out.println(this.writer);
	System.out.println("UPDATING THE SONG NAME =="+this.name);
	System.out.println("length of the song=="+this.length);
	System.out.println("NAME OF THE SINGER=="+this.name);
	System.out.println("LANGUAGE OF THE SONG=="+this.singerName);
	System.out.println("WRITER OF THE SONG=="+this.writer);
	
}




static
{
   System.out.println(length);	
                         
}





}


