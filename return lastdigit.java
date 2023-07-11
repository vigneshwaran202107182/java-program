// Return last digit
import java.io.*;
import java.util.*;
class RturnLastDigit{
  public static void main(stringp[ args){
    Scanner a= new Scanner (System.in);
    int b=a.nextInt();
    if (b>0){
      int c=b%10;
      return c;
    }
    else{
      int d=b%10*-1;
      return d;
    }
  }  
}
