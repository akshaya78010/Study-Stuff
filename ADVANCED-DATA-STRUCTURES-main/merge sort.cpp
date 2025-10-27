#include<stdio.h>
void print(int *arr,int n)
{
	for(int i = 0; i<n ; i++)
	{
		printf("%d ",arr[i]);
	}
}
void merge(int *arr,int start,int mid ,int end)
{
	int i = start;
	int j = mid+1;
	int b[100];
	int k = 0;
	while(i <= mid && j <= end)
	{
		if(arr[i] < arr[j])
		{
			b[k++] = arr[i++];
		}
		else
		{
			b[k++] = arr[j++];
		}
	}
	while(i <= mid)
	{
		b[k++] = arr[i++];
	}
	while(j <= end)
	{
		b[k++] = arr[j++];
	}
	int length = end -start+1;
	k=0;
	for(int i  = start ; i<= end ; i++)
	{
		arr[i] = b[k++];
	}
}
void merge_sort(int *arr,int start,int end)
{
	if(start >= end)
	{
		return;
	}
	int mid = (start+end) >> 1;
	merge_sort(arr,start,mid);
	merge_sort(arr,mid+1,end);
	merge(arr,start,mid,end);
}
int main()
{
	int n;
	scanf("%d",&n);
	int arr[n];
	for(int i  =0; i<n ; i++)
	{
		scanf("%d",&arr[i]);
	}
	print(arr,n);
	merge_sort(arr,0,n-1);
	print(arr,n);
}
