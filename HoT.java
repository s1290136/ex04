import java.util.Random;
import java.util.Scanner;

class HoT{
public static void main(String[] args){
    int i,x=0,h=0,t=0;
    Random rnd = new Random();
    
Scanner sc = new Scanner(System.in);
System.out.println("Who are you?");
String name = sc.next();    
System.out.println("Hello, "+name+"!");

System.out.println("Tossing a coin...");
for(i=1;i<=3;i++){
x = rnd.nextInt(2);
System.out.printf("Round"+i+":");
if(x==1){
    h++;
    System.out.printf("Heads\n");
}
else{
    t++;
    System.out.printf("Tails\n");
}
}
System.out.println("Heads:"+h+",Tails:"+t);

}

}