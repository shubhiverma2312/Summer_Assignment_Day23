import java.util.*;
class q92
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        int i,j,len,c=0,maxf=0;
        char chmaxf=' ';
        len=str.length();
        for(i=97;i<=122;i++)
        {
            c=0;
            for(j=0;j<len;j++)
            {
                char ch=str.charAt(j);
                if(ch==(char)i) c++;
            }
            if(c!=0)
            {
                if(c>maxf)
                {
                    maxf=c;
                    chmaxf=(char)i;
                }
            }
        }
        System.out.println("FREQUENCY OF "+chmaxf+" IS MAXIMUM");
        System.out.println("FREQUENCY = "+maxf);
    }
}