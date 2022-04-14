#include <iostream>
#include<vector>
using namespace std;

int main() {
	// your code goes here
	int a,b,c,t,d,A,B,C;
	cin>>d;
	vector<string> str ;
	for(int i=0;i<d;i++)
	{
	    cin>>a;
	    cin>>b;
	    cin>>c;
	    cin>>t;
	    cin>>A;
	    cin>>B;
	    cin>>C;
	    if( (A>=a && B>=b && C>=c) && A+B+C>=t)
	    str.push_back("YES");
	    else
	    str.push_back("NO");
	}
	for(int i=0;i<str.size();i++)
	{
	    cout<<str[i]<<endl;
	}
	return 0;
}
