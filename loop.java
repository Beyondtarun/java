import java.util.*;
class loop{
public static void main(String[] args){
 
//table of 5
/*for (int i=1; i<=10;i++){
System.out.println(" 5 * " + i + " = " +(i*5));
}*/

Scanner sc= new Scanner(System.in);

//sum of n numbers
int sum=1;
System.out.println("Enter number : ");
int a=sc.nextInt();
/*for(int i=0; i<=a;i++)
{
sum=sum+i;
}
System.out.println("Sum of  "+a+" numbers is : "+sum);*/

for(int i=1; i<=a ; i++)
{
sum=sum*i;
}
System.out.println(sum);

}
}