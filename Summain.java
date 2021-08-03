import java.util.*;
class Summain{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int number=sc.nextInt();
int sum=0;
for(int i=1;i<=number;i++){
// We can write i++ as i=i+1
sum=sum+i;
}
System.out.println("Sum="+ sum);
}
}
