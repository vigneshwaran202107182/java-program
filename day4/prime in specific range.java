 int k=0,count=0;
        while(input1<=input2){
            for(int i=2;i<input1;i++){
                if(input1%i==0){
                    k++;
                }
            }
            if(k==0){
                count++;
            }
            input1++;
            k=0;
        }
        return count;
		
	}
}
