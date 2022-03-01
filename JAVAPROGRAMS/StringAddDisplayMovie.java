class StringAddDisplayMovie{

String[] movieNames=new String[20];
int tempValue=0;

void addMovieName(String movieNames)
{

System.out.println("MOVIE NAMES ="+movieNames);
this.movieNames[tempValue]=movieNames;
tempValue=tempValue+1;


}

void displayMovieNames()
{

for(int n=0;n<movieNames.length;n++)
{
System.out.println("DISPLAYING MOVIES NAMES =");
String movieName=this.movieNames[n];
System.out.println(movieName);
}

} 



}