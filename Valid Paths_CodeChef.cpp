#include<bits/stdc++.h>
#define int long long
#define mod 1000000007
using namespace std;
int ans;
vector<vector<int>>v;
vector<int> dp,dp1;
void dfs(int cur, int par)
{
    dp[cur]=1,dp1[cur]=1;
    int sum=0, cnt=0;
    for(int i=0;i<v[cur].size();i++)
    {
        int node=v[cur][i];
        if(node!=par)
        {
            dfs(node,cur);
            dp[cur]+=(2*dp[node]%mod);
            dp[cur]%=mod;
            cnt++;
            dp1[cur]+=dp1[node];
            dp1[cur]%=mod;
            dp1[cur]+=dp[node];
            dp1[cur]%=mod;
            sum+=dp[node];
        }
    }
    for(int i=0;i<v[cur].size();i++)
    {
        int node=v[cur][i];
        if(node!=par)
        {
            dp1[cur]+=(dp[node]*((sum-dp[node])+mod)%mod)%mod;
            dp1[cur]%=mod;
        }
    }
}
signed main()
{
    int t;
    cin>>t;
    while(t-->0)
    {
        ans=0;
        int n;
        cin>>n;
        dp.clear(); 
        v.clear();
        dp1.clear();
        v.resize(n+1);
        dp.resize(n+1);
        dp1.resize(n+1);
        for(int i=1;i<n;i++)
        {
            int l,r;
            cin>>l>>r;
            v[l].push_back(r);
            v[r].push_back(l);
        }
        dfs(1,1);
        int ans=dp1[1]%mod;
        cout<<ans<<endl;
    }
}
