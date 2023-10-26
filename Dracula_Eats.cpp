#include <iostream>
#include <bits/stdc++.h>
using namespace std;
void func()
{
    int n;
    cin>>n;
    int ans;
    if((n-1)%7==0)
    {
        ans=(n-1)/7;
    }
    else
    {
        ans=(n-1)/7+1;
    }
    cout<<ans<<endl;
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
