import java.util.*;
	import java.io.*;
	//Read only region start
	class UserMainCode{
	public int totalHillWeight(int input1,int input2,int input3)
	{
	    //Read only region end
	    // Write code here..
			int tot_level=input1,head=input2,increment=input3;
        int tot=head,sum=head;
        int level=2;
        while(tot_level-->1)
        {    
            sum+=increment;
            tot=(tot+(sum*level));
            level++;
        }
        return tot;
	}
}
