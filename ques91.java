import java.util.*;
class q91
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st string : ");
        String str1=sc.nextLine();
        System.out.print("Enter 2nd string : ");
        String str2=sc.nextLine();
        int i,j,c1,c2,count=0,len;
        int len1=str1.length();
        int len2=str2.length();
        if(len1!=len2)
        {
            System.out.println("STRINGS ARE NOT ANAGRAMS");
            System.exit(0);
        }
        len=len1;
        for(i=97;i<=122;i++)
        {
            c1=0;
            c2=0;
            for(j=0;j<len;j++)
            {
                char ch1=str1.charAt(j);
                char ch2=str2.charAt(j);
                if(ch1==(char)i) c1++;
                if(ch2==(char)i) c2++;
            }
            if(c1==c2)
                count++;
        }
        if(count==26)
            System.out.println("STRINGS ARE ANAGRAMS");
        else
            System.out.println("STRINGS ARE NOT ANAGRAMS");
    }
}