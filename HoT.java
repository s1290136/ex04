import java.util.Random;
class HoT{
public static void main(String[] args){
    int i,x=0,h=0,t=0;
    Random rnd = new Random(); 
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
if(h > t) System.out.println("You won");
else System.out.println("You lost");
}

}