#include<bits/stdc++.h>
using namespace std;
int main() {
	int n;
	long long k;
	long long x, y;
	vector<pair<long long, long long> >a;
	cin >> n >> k;
	for (int i = 0; i < n; i++) {
		cin >> x >> y;
		a.push_back({ x,y }); //a[i].first=A_i, a[i].second=B_i
	}
	sort(a.begin(), a.end());
	for (int i = 0; i < n; i++) {
		if (a[i].first > k)break;
		k += a[i].second;
	}
	cout << k << endl;
	return 0;
}
