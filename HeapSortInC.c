#include <stdio.h>
void main()
{
    int heap[10], n, no, i, j, c, root, temp;  
    printf("\n Enter no of elements :");
    scanf("%d", &n);
    printf("\n Enter the nos : ");
    no=n;
    for (i = 0; i < no; i++)
        scanf("%d", &heap[i]);

    do
    {
        for (i = 1; i < no; i++)
        {
            c = i;
            do
            {
                root = (c - 1) / 2;             
                if (heap[root] < heap[c])   /* to create MAX heap array */
                {
                    temp = heap[root];
                    heap[root] = heap[c];
                    heap[c] = temp;
                }
                c = root;
            } while (c != 0);
        }
        printf("Heap array : ");
        for (i = 0; i < no; i++)
            printf("%d\t ", heap[i]);
        {
            temp = heap[0];
            heap[0] = heap[no-1];
            heap[no-1] = temp;
        }
        no--;
    }while(no>0);
        
     printf("\n The sorted array is : ");
    for (i = 0; i < n; i++)
       printf("\t %d", heap[i]);
}
