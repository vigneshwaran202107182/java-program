import java.io.*;

import java.util.*;

// Read only region start class UserMainCode

public int add LastDigits (int input1, int input2)
{

// Read only region end

if(input1>0&&input2>0){

int num1=input1%10; int num2=input2%10;

int sum num1+num2;

return sum;

else if(input1<0&&input2>0){

int num3=input1%10*-1;

int num4=input2%10;

int sum1 = num3+num4;

return sum1;
else if(input1<e&&input2>0) { 
int num3=input1%10*-1;

int num4=input2%10;

int sum1 num3+num4;

return sum1;

}

else if(input1>0&&input2<0) {

int num5=input1%10;

int num6=input2%10*-1; int sum2 num5+num6;

return sum2;

}

else{

int num7=input1%10*-1;

int num8=input2%10*-1; int sum3 = num7+num8;

return sum3;

}
}
