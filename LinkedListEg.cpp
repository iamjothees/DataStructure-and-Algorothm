#include<iostream>
using namespace std;
struct node
{
    int data;    node* next;
};

class SinglyLinkedList
{
    private:
    node *head, *tail;

    public:
    SinglyLinkedList()
    {
        head = NULL;
        tail = NULL;
    }

    void add(int n)
    {
        node *temp = new node;
        temp->data = n;
        temp->next = NULL;

        if (head == NULL)
        {
            head = temp;
            tail = temp;
        }
        else
        {
            tail->next = temp;
            tail = temp;
        }
    }

    void show()
    {
        node *ptr = head;

        while(ptr != NULL)
        {
            cout<<ptr->data<<endl;
            ptr = ptr->next;
        }

    }
};

int main()
{
    SinglyLinkedList obj1;
    obj1.add(5);
    obj1.add(3);
    obj1.add(6);

    obj1.show();

}
