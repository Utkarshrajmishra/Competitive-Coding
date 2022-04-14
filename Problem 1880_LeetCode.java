class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        char ch[]=new char[10]; int counter=97;
            for(int i=0;i<10;i++)
            {
                    ch[i]=(char)counter;
                    counter++;
            }
            int sum1=0,sum2=0,sum3=0;
            for(int i=0;i<firstWord.length();i++)
            {
                    char k=firstWord.charAt(i);
                    for(int j=0;j<10;j++)
                    {
                            if(ch[j]==k)
                            {
                                    sum1=(sum1*10)+j;
                            }
                    }
            }
            for(int i=0;i<secondWord.length();i++)
            {
                    char k=secondWord.charAt(i);
                    for(int j=0;j<10;j++)
                    {
                            if(ch[j]==k)
                            {
                                    sum2=(sum2*10)+j;
                            }
                    }
            }
            for(int i=0;i<targetWord.length();i++)
            {
                    char k=targetWord.charAt(i);
                    for(int j=0;j<10;j++)
                    {
                            if(ch[j]==k)
                            {
                                    sum3=(sum3*10)+j;
                            }
                    }
            }
            
            boolean flag=false;
            if(sum1+sum2==sum3)
                    flag=true;
            return flag;
    }
}
