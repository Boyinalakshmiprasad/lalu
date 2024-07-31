class ams{
public static void main(String args[]){
int num=132,count=3,rev=0,sum=0,tem=num;
while(num>0)
{
 int rem=num%10;
int power=(int)Math.pow(rem,count);
sum=sum+power;
num=num/10;
}
System.out.println(sum);
tem=num;
if(sum==tem)
System.out.println("it is a amstrong");
else
System.out.println("it is not  a amstrong");
}
}
