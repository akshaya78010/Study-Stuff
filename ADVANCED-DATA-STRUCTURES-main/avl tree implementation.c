/*#include<stdio.h>
#include<stdlib.h>
struct Treenode{
	int data;
	struct Treenode*left;
	struct Treenode*right;
	int height;
};
typedef struct Treenode treenode;
//inorder traversal
void inorder(treenode *root)
{
	if(root != NULL)
	{
		inorder(root->left);
		printf("%d ",root->data);
		inorder(root->right);
	}
	return;
}
//to find the height 
int Height(treenode *root)
{
	if(root == NULL)return 0;
	return root->height;
}
//to get balance factor
int getbalance(treenode *root)
{
	if(root == NULL)return 0;
	return (Height(root->left)-Height(root->right));
}
//to find maximum
int max(int a,int b)
{
	return a>b?a:b;
}
//left rotation
treenode *left_rotation(treenode *root)
{
	treenode *a = root->right;
	treenode *x1 = a->left;
	a->left = root;
	root->right = x1;
	a->height = 1 + max(Height(a->left),Height(a->right));
	root->height = 1 + max(Height(root->left),Height(root->right));
	return a;
}
//right rotation
treenode *right_rotation(treenode *root)
{
	treenode *a = root->left;
	treenode *x1 = a->right;
	a->right = root;
	root->left = x1;
	a->height = 1 + max(Height(a->left),Height(a->right));
	root->height = 1 + max(Height(root->left),Height(root->right));
	return a;
}
//creating a newnode
treenode *create(int val)
{
	treenode *newnode = (treenode*)malloc(sizeof(treenode));
	newnode->data = val;
	newnode->left = NULL;
	newnode->right = NULL;
	newnode->height = 1;
	return newnode;
}
//inserting the node
treenode *insert(treenode *root,int val)
{
	if(root == NULL)
	{
		return create(val);
	}
	if(val < root->data)
	{
		root->left = insert(root->left,val);
	}
	else if(val > root->data)
	{
		root->right = insert(root->right,val);
}
return root;
root->height = 1 + max(Height(root->left),Height(root->right));
int balance_factor = getbalance(root);
if(balance_factor > 1 && val < root->left->data)
{
	return left_rotation(root);
}
else if(balance_factor < -1 && val > root->right->data)
{
	return right_rotation(root);
}
else if(balance_factor > 1 && val > root->left->data)
{
	root->left = left_rotation(root->left);
	return right_rotation(root);
}
else if(balance_factor < -1 && val < root->right->data)
{
	root->right = right_rotation(root->right);
	return left_rotation(root->left);
}
return root;
}
int main()
{
	treenode *root = NULL;
	root = insert(root,10);
	root = insert(root,20);
	root = insert(root,30);
	root = insert(root,40);
	inorder(root);
}
/*#include<stdio.h>
#include<stdlib.h>
struct Treenode{
	int data;
	struct Treenode *left;
	struct Treenode *right;
	int height;
};
typedef struct Treenode treenode;
int max(int a,int b)
{
	return a > b? a : b;
}
int Height(treenode *root)
{
	if(root == NULL)
	{
		return 0;
	}
	return root->height;
}
void inorder(treenode *root)
{
	if(root != NULL)
	{
		inorder(root->left);
		printf("%d ",root->data);
		inorder(root->right);
	}
}
treenode *left_rotation(treenode *root)
{
	treenode *a = root->right;
	treenode *x1 = a->left;
	//rotattion
	a->left = root;
	root->right = x1;
	//update heights
	root->height = 1 + max(Height(root->left),Height(root->right));
	a->height = 1 + max(Height(a->left),Height(a->right));
	return a;
}
treenode *right_rotation(treenode *root)
{
	treenode *a = root->left;
	treenode *x1 = a->right;
	a->right = root;
	root->left = x1;
root->height = 1 + max(Height(root->left),Height(root->right));
	a->height = 1 + max(Height(a->left),Height(a->right));
	return a;
}
int get_balance(treenode *root){
	if(root == NULL)return 0;
	return (Height(root->left) - Height(root->right));
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
treenode *insert(treenode*root,int val)
{
	if(root == NULL)
	{
		return create(val);
	}
	if(val < root->data)
	{
		root->left = insert(root->left,val);
	}
	else if(val > root->data)
	{
		root->right = insert(root->right,val);
	}
	else
	{
		return root;
	}
	root->height = 1 + max(Height(root->left),Height(root->right));
	int Balance_factor = get_balance(root);
	if(Balance_factor > 1 && val < root->left->data)
	{
		//left left->right rotation
		return right_rotation(root);
	}
	 if(Balance_factor < -1 && val > root->right->data)
	{
		//right right->left rotation
		return left_rotation(root);
	}
     if(Balance_factor > 1 && val > root->left->data)
	{//left right rotation
		root->left = left_rotation(root->left);
		return right_rotation(root);
	}
   if(Balance_factor < -1 && val < root->right->data)
	{
		root->right = right_rotation(root->right);
		return left_rotation(root);
	}
	return root;
}
int main()
{
	treenode *root = NULL;
	int n;
	printf("enter the number of the nodes to be inserted:");
	scanf("%d\n",&n);
	for(int i = 1; i <= n ; i++)
	{
		int node;
		printf("enter the value of the node:");
		scanf("%d\n",&node);
		root = insert(root,node);
	}
	inorder(root);
}*/
#include<stdio.h>
#include<stdlib.h>
struct Treenode{
	int data;
	struct Treenode *left;
	struct Treenode *right;
	int height;
};
typedef struct Treenode treenode;
treenode *create(int val){
	treenode *newnode = (treenode*)malloc(sizeof(treenode));
	newnode->data = val;
	newnode->left = NULL;
	newnode->right = NULL;
	newnode->height = 1;
	return newnode;
}
void inorder(treenode *root)
{
	if(root != NULL)
	{
		inorder(root->left);
		printf("%d ",root->data);
		inorder(root->right);
	}
}
int max(int a,int b)
{
	return a > b?a:b;
}
int Height(treenode *root)
{
	if(root == NULL)
	{
		return 0;
	}
	return root->height;
}
int getbalance(treenode *root)
{
	if(root == NULL)
	{
		return 0;
	}
	return Height(root->left) - Height(root->right);
}
treenode  *left_rotation(treenode *x)
{
	treenode *y = x->right;
	treenode *t1 = y->left;
	y->left = x;
	x->right = t1;
	x->height = 1 + max(Height(x->left),Height(x->right));
	y->height = 1 + max(Height(y->left),Height(y->right));
	return y;
}
treenode *right_rotation(treenode *x)
{
	treenode *y = x->left;
	treenode *t1 = y->right;
	y->right = x;
	x->left = t1;
	x->height = 1 + max(Height(x->left),Height(x->right));
	y->height = 1 + max(Height(y->left),Height(y->right));
	return y;
}
treenode *insert(treenode *root,int key)
{
	if(root == NULL)
	{
		return create(key);
	}
	else if(key < root->data)
	{
		root->left = insert(root->left,key);
	}
	else if(key > root->data)
	{
		root->right = insert(root->right,key);
	}
	else{
		return root;
	}
	//finding heights
	
	root->height = 1 + max(Height(root->left),Height(root->right)); 
	
	//finding balance factor
	
	int bf = getbalance(root);
	
	//rotations
	 
	 //left left
	if(bf > 1 && key < root->left->data)
	{
		return right_rotation(root);
	}
    //left right
    else if(bf > 1 && key > root->left->data)
    {
    	root->left = left_rotation(root->left);
    	return right_rotation(root);
	}
	// right right
	else if(bf < -1 && key > root->right->data)
	{
		return left_rotation(root);
	}
	//right left
	else if(bf < -1 && key < root->right->data)
	{
		root->right = right_rotation(root->right);
		return left_rotation(root);
	}
	return root;
}
int main()
{
	int n;
	scanf("%d",&n);
	int nodes[n];
	for(int i = 0;  i <n ; i++)
	{
		scanf("%d",&nodes[i]);
	}
	treenode *root = create(nodes[0]);
	for(int i = 1; i < n ; i++)
	{
		root = insert(root,nodes[i]);
	}
	inorder(root);
}