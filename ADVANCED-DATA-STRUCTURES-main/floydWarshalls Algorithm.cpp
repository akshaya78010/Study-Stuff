#include<bits/stdc++.h>
using namespace std;
void floydWarshallsAlgorithm(int n,int m,vector<vector<int>>&grid)
{
	for(int k = 1 ; k <= n ; k++)
	{
		for(int j =1 ; j <= n ; j++)
		{
			for(int i =1 ; i <= n ; i++)
			{
				if(grid[i][k] != INT_MAX && grid[k][j] != INT_MAX){
				grid[i][j] = min(grid[i][j],grid[i][k] + grid[k][j]);
			}
			}
		}
	}
}
int main()
{
	int n,m;
	cin>>n>>m;
	vector<vector<int>>grid(n+1,vector<int>(n+1,INT_MAX));
    for(int i = 1 ; i < grid.size() ; i++)
    {
        grid[i][i] =0;
    }
	for(int i =1 ; i <= m ; i++)
	{
		int u,v,weight;
		cin>>u>>v>>weight;
		grid[u][v] = weight;
	}
	floydAlgorithm(n,m,grid);
	for(int i =1 ; i <= n ; i++)
	{
		cout<<i<<"-->";
		for(int j =1 ; j <= n ; j++)
		{
			cout<<grid[i][j]<<" ";
		}
		cout<<'\n';
	}
	//Time Complexity - O(n^3)
	//Space Complexity - O(n^2)
}
