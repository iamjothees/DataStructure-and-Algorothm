#include<iostream>
using namespace std;

struct node
{
    int data;
    node *left, *right;
}

class BinaryTree
{
    private:
    node *root, *btm;

    public:
    BinaryTree()
    {
        root = NULL;
        btm = NULL;
    }

    void add(int x)
    {
        node tmp = new node;
        tmp->data = x;
        tmp->left = NULL;
        tmp->right = NULL;
        
        if (root == NULL)
        {
            root = tmp;            
            btm = tmp;
        }

        else if (btm->left == NULL)
        {
            btm->left = tmp;
        }

        else if (btm->right == NULL)
        {
            btm->right = tmp;
            if ()
        }

        else if ()

    }
}

int main()
{

}