import java.io.*;
import  java.util.*;   
// Read only region start
class UserMainCode
{
public int weightOfString(String input1,int inpput2){
// Read only region end
// Write code here...
	
	// Write code here...
		// ASCII : char-96 (a-97)

        char arr[]=input1.toCharArray();
        //String str1="abcdefghijklmnopqrstuvwxyz";
        String str="aeiou";
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(str.indexOf(Character.toLowerCase(arr[i]))!=-1) 
            {
                if(input2==1) sum+=(Character.toLowerCase(arr[i]))-96;
            }
            else if(Character.toLowerCase(arr[i])>=97 && Character.toLowerCase(arr[i])<=122)
            {
                sum+=(Character.toLowerCase(arr[i]))-96;
            }
        }
        return sum;
	}
}
