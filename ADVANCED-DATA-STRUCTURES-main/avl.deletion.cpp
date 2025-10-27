#include<stdio.h>
#include<stdlib.h>
struct Treenode{
	int data;
	struct Treenode *left;
	struct Treenode *right;
	int height;
};
typedef struct Treenode treenode;
void inorder(treenode *root){
	if(root != NULL){
		inorder(root->left);
		printf("%d ",root->data);
		inorder(root->right);
	}
}
int max(int a,int b){
	return a > b? a : b;
}
int Height(treenode *root){
	if(root == NULL){
		return 0;
	}
	return root->height;
}
int get_balance(treenode *root){
	if(root == NULL){
		return 0;
	}
	return Height(root->left) - Height(root->right);
}
treenode *left_rotation(treenode *x)
{
	treenode *a = x->right;
	treenode *t1 = a->left;
	a->left = x;
	x->right = t1;
	x->height = 1 + max(Height(x->left),Height(x->right));
	a->height = 1 + max(Height(a->left),Height(a->right));
	return a;
}
treenode *right_rotation(treenode *x)
{
	treenode *a = x->left;
	treenode *t1 = a->right;
	a->right = x;
	x->left = t1;
	x->height = 1 + max(Height(x->left),Height(x->right));
	a->height = 1 + max(Height(a->left),Height(a->right));
	return a;
}
treenode *preorder_successor(treenode *root)
{
	treenode *temp = root;
	while(temp && temp->left){
		temp = temp->left;
	}
	return temp;
}
treenode *create(int val){
	treenode *newnode = (treenode*)malloc(sizeof(treenode));
	newnode->data = val;
	newnode->left =NULL;
	newnode->right = NULL;
	newnode->height = 1;
	return newnode;
}
treenode *insert(treenode *root,int val){
	if(root == NULL)
	{
		return create(val);
	}
	else if(val < root->data)
	{
		root->left = insert(root->left,val);
	}
	else if(val > root->data){
		root->right = insert(root->right,val);
	}
	else
	{
		return root;
	}
	root->height = 1 + max(Height(root->left),Height(root->right));
	int balance_factor = get_balance(root);
	if(balance_factor > 1 && val < root->left->data){
		return right_rotation(root);
	}
	else if(balance_factor >1 && val > root->left->data){
		root->left = left_rotation(root->left);
		return right_rotation(root);
	}
	else if(balance_factor < -1 && val > root->right->data){
		return left_rotation(root);
	}
	else if(balance_factor < -1 && val < root->right->data){
		root->right = right_rotation(root->right);
		return left_rotation(root);
	}
	return root;
}
treenode *del(treenode *root,int val){
	if(root == NULL){
		return NULL;
	}
	else if(val < root->data){
		root->left = del(root->left,val);
	}
	else if(val > root->data){
		root->right = del(root->right,val);
	}
	else
	{
		if(root->left == NULL){
			treenode *temp = root->right;
			free(root);
			return temp;
		}
		else if(root->right == NULL){
			treenode *temp = root->left;
			free(root);
			return temp;
		}
		else
		{
			treenode *current_node = preorder_successor(root->right);
			root->data = current_node->data;
			root->right = del(root->right,current_node->data);
		}
	}
	return root;
		root->height = 1 + max(Height(root->left),Height(root->right));
	int balance_factor = get_balance(root);
	if(balance_factor > 1 && get_balance(root->left) > 0){
		return right_rotation(root);
	}
	else if(balance_factor > 1 && get_balance(root->left) < 0){
		root->left = left_rotation(root->left);
		return right_rotation(root);
	}
	else if(balance_factor < -1 && get_balance(root->right)  < 0)
	{
		return left_rotation(root);
	}
	else if(balance_factor < -1 && get_balance(root->right) > 0)
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
	scanf("%d",&n);
	int arr[n];
	for(int i = 0; i  < n ; i++)
	{
		scanf("%d",&arr[i]);
	}
	for(int i =0 ; i <  n; i++)
	{
		root = insert(root,arr[i]);
	}
	int key;
	scanf("%d",&key);
	inorder(root);
	del(root,key);
	printf("\n");
	inorder(root);
}