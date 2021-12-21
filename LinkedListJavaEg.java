class Node
{
    int data;
    Node next;
}

class SinglyLinkedListEg
{
    private Node head;
    private Node tail;

    SinglyLinkedListEg()
    {
        head = null;
        tail = null;
    }

    SinglyLinkedListEg(int input)
    {
        add(input);
    }

    public void add(int input)
    {
        Node temp = new Node();
        temp.data = input;
        temp.next = null;

        if (head == null)
        {
            head = temp;
            tail = temp;
        }

        else
        {
            tail.next = temp;
            tail = temp;
        }
    }

    public void show()
    {
        Node ptr = head;

        while(ptr != null)
        {
            System.out.println(ptr.data);
            ptr = ptr.next;
        }

    }
}

class Main
{
    public static void main(String[] args)
    {
        SinglyLinkedListEg l1 = new SinglyLinkedListEg(5);
        l1.add(4);
        l1.add(3);
        l1.add(8);
        l1.show();
    }    
}