public class piosenka{
  public static void main(String[] args){
  int licznik = 99;
  for(int i=99;i!=0;i--)
 {
    System.out.print(" " +licznik+" bottles of beer on the wall ");
    System.out.print(" "+ licznik+" bottles of beer. Take one down and pass it around - ");
    if(licznik==0)
	System.out.println((licznik-1)+" bottles of beer on the wall.");
else
    System.out.println("no more bottles of beer on the wall.");
    licznik--;
 }
  }
}

