import java.util.*;
import java.io.*;

//Read only region start
class UserMainCode
{
  public int isPalindrome(int input1)
{
//Read only region end
//Write code here...
int temp=input1,rem=0,sum=0;
while(input1>0)
{
   rem=input1%10;
sum=sum*10+rem;
input1/=10;
}
if(sum==temp) return 2;
else return 1;
}
