#include<stdio.h>
#include<stdlib.h>
struct Treenode{
	int data;
	struct Treenode *left;
	struct Treenode *right;
	int height;
};
typedef struct Treenode treenode;
void inorder(treenode *root)
{
	if(root != NULL)
	{
		inorder(root->left);
		printf("%d ",root->data);
		inorder(root->right);
	}
}
treenode *minval(treenode *root)
{
	treenode *temp = root;
	while(temp && temp->left)
	{
		temp = temp->left;
	}
	return temp;
}
treenode *create(int val)
{
	treenode *newnode = (treenode*)malloc(sizeof(treenode));
	newnode->data = val;
	newnode->left = NULL;
	newnode->right = NULL;
	newnode->height = 1;
	return newnode;
}
treenode *insert(treenode *root,int val)
{
	if(root == NULL)
	{
		return create(val);
	}
	else if(val < root->data)
	{
		root->left = insert(root->left,val);
	}
	else if(val > root->data)
	{
		root->right = insert(root->right,val);
	}
	return root;
}
treenode *del(treenode *root,int val)
{
	if(root == NULL)
	{
		return NULL;
	}
	else if(val < root->data)
	{
		root->left = del(root->left,val);
	}
	else if(val > root->data)
	{
		root->right = del(root->right,val);
	}
	else
	{
		if(root->left == NULL)
		{
			treenode *temp = root->right;
			free(root);
			return temp;
		}
		else if(root->right == NULL)
		{
			treenode *temp = root->left;
			free(root);
			return temp;
		}
		//two nodes
		else{
			treenode *curr = minval(root->right);
			root->data = curr->data;
			root->right = del(root->right,curr->data);
	}
}
	return root;
}
int main()
{
treenode *root = NULL;
int n;
scanf("%d",&n);
int arr[n];
for(int i = 0; i < n ; i++)
{
	scanf("%d",&arr[i]);
}
for(int i = 0; i < n ;i++)
{
	root = insert(root,arr[i]);
}
int key;
scanf("%d",&key);
inorder(root);
//root = del(root,key);
printf("\n");
root = del(root,key);
inorder(root);
}