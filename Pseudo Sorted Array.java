#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t-->0)
	{
	    int n,count=0;
	    cin>>n;
	    int array[n];
	    for(int i=0;i<n;i++)
	    {
	        cin>>array[i];
	        if(i>=1 && array[i-1]>array[i] )
	        {
	            int temp=array[i-1];
	            array[i-1]=array[i];
	            array[i]=temp;
	            
	            if(i>=2 && array[i-2]>array[i-1])
	            {
	                count+=2;
	            }
	            else if(i==1)
	            {
	                count+=1;
	            }
	            else
	            {
	                count+=1;
	            }
	        }
	    }
	    if(count<2)
	    {
	        cout<<"YES"<<endl;
	    }
	    else 
	    {
	        cout<<"NO"<<endl;
	    }
	}
	return 0;
}
