#include<bits/stdc++.h>
using namespace std;
static bool cmp(const vector<int>&a,const vector<int>&b) {
    return a[1] < b[1];
}
int main() {
    vector<vector<int>>v = {{3,2,1},{1,5,2},{11,7,8}};
     sort(v.begin(),v.end());  // based on first value
     for(int i = 0 ; i < v.size() ; i++) {
         for(int j = 0 ; j < v[i].size() ; j++) {
             cout<<v[i][j]<<" ";
         }
         cout<<endl;
     } 
    sort(v.begin(),v.end(),cmp);
 .