import java.util.*;
class q90
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        int i,j,c,len;
        len=str.length();
        for(i=0;i<len;i++)
        {
            c=0;
            for(j=0;j<len;j++)
            {
                if(str.charAt(i)==str.charAt(j));
                {
                    c++;
                }
            }
            if(c>2)
            {
                System.out.println("FIRST REPEATING CHARACTACTER : "+str.charAt(i));
                System.exit(0);
            }
        }
        System.out.println("NO REPEATING CHARACTER FOUND");
    }
}