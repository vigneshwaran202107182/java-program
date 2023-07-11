//Return 2nd digit
import java.io.*;
import java.util.*;
class ReturnDecondDigit{
  public static void main(string[] args){
    Scanner input1=new Scanner(System.in);
    int input2= input1.nextInt();
    if (input2>0){
      int a=input2%10;
      return a;
    }
    else{
      int b=input2%10*-1;
      return b;
    }
  }
} 
