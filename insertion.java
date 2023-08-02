public class insertion {
    public static void main(String []args)
    {
        int a[]=new int[]{6,3,4,1,2,3};

        Insertiosort(a);
        for (int ans:a) {
            System.out.print(ans+" ");
        }
    }

    private static void Insertiosort(int[] a) {

        for (int i=1;i<a.length;i++)
        {
            int temp=a[i];
            int j=i-1;
            while (j>=0 && a[j]>temp)
            {

                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;

            
        }
    }
}


