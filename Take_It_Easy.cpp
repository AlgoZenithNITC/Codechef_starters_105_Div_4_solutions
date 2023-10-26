#include <iostream>
#include <bits/stdc++.h>
using namespace std;
void func()
{
    int n;
    cin>>n;
    vector<int>v(n);
    for(int i=0;i<n;i++)
    {
        cin>>v[i];
    }
    long long sum=0;
    for(int i:v)
    {
        sum+=i;
    }
    bool b=true;
    if(sum%n!=0)
    {
        b=false;
        cout<<"No"<<endl;
    }
    if(b)
    {
     long long f=sum/n;
     int i=0;
     for( i=0;i<n;i++)
     {
         if(((abs(f-v[i]))%2)!=0)
         {
         cout<<"No"<<endl;
         break;
         }
     }
     if(i==n)
     {
         cout<<"Yes"<<endl;
     }
    }
    
}

int main() {
	// your code goes here
	int t;
	cin>>t;
	for(int i=0;i<t;i++)
	{
	    func();
	}
	return 0;
}
