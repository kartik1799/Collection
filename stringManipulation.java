package StringExercise;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;

public class stringManipulation
{
    public static void main(String args[])
    {
        try
        {
            String str = "Java Exercises";

            stringManipulation st = new stringManipulation();

            compareLexicographically();

            removeDuplicates();

            firstNonRepeating();

            frequent();

            removeFromAnotherString();

            reverseWords();

            reverseEveryWord();

            removePAndLA();

            countDuplicates();

            rotationString();

            endsWithString();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
    public static void getValue(String s)
    {
        try
        {
            System.out.println(s.charAt(0));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void unicodePointAt(String s)
    {
        try
        {
            int val1=s.codePointAt(1);

            int val2=s.codePointAt(7);

            System.out.println(val1);

            System.out.println(val2);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void unicodePointBefore(String s)
    {
        try
        {
            int val1=s.codePointBefore(1);

            int val2=s.codePointBefore(7);

            System.out.println(val1);

            System.out.println(val2);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void unicodePointCount(String s)
    {
        try
        {
            int count=s.codePointCount(1,10);

            System.out.println(count);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void compareLexicographically()
    {
        try
        {
            String s1="This is Exercise 1";

            String s2="This is Exercise 2";

            int num=s1.compareTo(s2);

            if(num<0)
            {
                System.out.println("\"" +s1+ "\"" + " is less than " + "\"" +s2+ "\"");
            }

            else if(num==0)
            {
                System.out.println("\"" +s1+ "\"" + " is equal to " + "\"" +s2+ "\"");
            }
            else
            {
                System.out.println("\"" +s1+ "\"" + " is greater than " + "\"" +s2+ "\"");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void compareLexicographicallyIgnoreCase() {
        try {
            String s1 = "This is Exercise 1";

            String s2 = "This is exercise 1";

            int num = s1.compareToIgnoreCase(s2);

            if (num < 0) {
                System.out.println("\"" + s1 + "\"" + " is less than " + "\"" + s2 + "\"");
            } else if (num == 0) {
                System.out.println("\"" + s1 + "\"" + " is equal to " + "\"" + s2 + "\"");
            } else {
                System.out.println("\"" + s1 + "\"" + " is greater than " + "\"" + s2 + "\"");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void concatenateStrings()
    {
        try
        {
            String s1="String";

            String s2="Manipulation";

            String s3=s1.concat(s2);

            System.out.println(s3);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void containsString()
    {
        try
        {
           String s1="This is String Manipulation";

           String s2="String";

            System.out.println(s1.contains(s2));

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void compareStringBuffer(String s)
    {
        try
        {
            String s1="String Exercise";

            String s2="String Manipulation";

            StringBuffer strbuf=new StringBuffer(s1);

            System.out.println(s1.contentEquals(strbuf));

            System.out.println(s2.contentEquals(strbuf));

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void stringCharacterArray()
    {
        try
        {
            char[] arr=new char[]{'1','2','3','4'};

            String str=String.copyValueOf(arr,1,3);

            System.out.println(str);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void stringEndsWith(String s)
    {
        try
        {
            String s1="Python Exercises";

            String s2="Python Exercise";

            String end="se";

            System.out.println(s1.endsWith(end));

            System.out.println(s2.endsWith(end));

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void stringEquals(String s)
    {
        try
        {
            String s1="Python";

            String s2="Java";

            String compare="Python";

            boolean b1=s1.equals(compare);

            boolean b2=s2.equals(compare);

            System.out.println(b1);

            System.out.println(b2);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void stringEqualsIgnoreCase(String s)
    {
        try
        {
            String s1="python";

            String s2="Java";

            String compare="Python";

            boolean b1=s1.equalsIgnoreCase(compare);

            boolean b2=s2.equalsIgnoreCase(compare);

            System.out.println(b1);

            System.out.println(b2);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void currentDateTime()
    {
        try
        {
            Calendar c=Calendar.getInstance();

            System.out.format("%tB %te, %tY%n",c,c,c);

            System.out.format("%tl:%tM %tp%n",c,c,c);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void getContentsAsByteArray()
    {
        try
        {
            String str="Python Exercise";

            byte[] arr=str.getBytes();

            String s1=new String(arr);

            System.out.println(s1);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void uniqueIdentifier()
    {
        try
        {
            String s1="This is String Manipulation";

            int hash=s1.hashCode();

            System.out.println(hash);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void getIndexByCharacter()
    {
        try
        {
            String s1="This is String Manipulation";

            int index=s1.indexOf('a',0);

            System.out.println(index);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void lastIndex()
    {
        try
        {
            String s1="This is String Manipulation";

            int index=s1.lastIndexOf("a",s1.length()-1);

            System.out.println(index);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void regionMatches()
    {
        try
        {
            String s1="This is String Manipulation";

            String s2="String Exercise";

            boolean b1=s2.regionMatches(0,s1,8,6);

            boolean b2=s1.regionMatches(15,s2,7,5);

            System.out.println(b1);

            System.out.println(b2);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void replaceCharacter()
    {
        try
        {
            String s1="This is String Manipulation";

            String s2=s1.replace("t","p");

            System.out.println(s2);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void replaceSubstring()
    {
        try
        {
            String s1="This is String Manipulation";

            String s2=s1.replaceAll("String","Spring");

            System.out.println(s2);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void startsWithString()
    {
        try
        {
            String s1="This is String Manipulation";

            String s2="Python Exercises";

            String s3="This";

            System.out.println(s1.startsWith(s3));

            System.out.println(s2.startsWith(s3));

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void findSubstring()
    {
        try
        {
            String s1="This is String Manipulation";

            String s2=s1.substring(8,13);

            System.out.println(s2);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void createCharacterArray()
    {
        try
        {
            String s1="This is String Manipulation";

            char[] arr=s1.toCharArray();

            System.out.println(arr);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void toLowerUpperCase()
    {
        try
        {
            String s1="This is String Manipulation";

            String s2=s1.toLowerCase();

            String s3=s1.toUpperCase();

            System.out.println(s2);

            System.out.println(s3);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void trimSpaces()
    {
        try
        {
            String s1="  This is String Manipulation  ";

            String trim=s1.trim();

            System.out.println(s1);

            System.out.println("After trimming white spaces"+trim);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void removeDuplicates()
    {
        try
        {
            String s1="This is String Manipulation";

            char[] arr=s1.toCharArray();

            String s2="";

            for(char value:arr)
            {
                if(s2.indexOf(value)==-1)
                {
                    s2=s2+value;
                }
            }
            System.out.println(s2);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void firstNonRepeating()
    {
        try
        {
            String s1="This is String Manipulation";

            s1=s1.toLowerCase();

            for(int i=0;i<s1.length();i++)
            {
                boolean unique= true;

                for(int j=0;j<s1.length();j++)
                {
                    if(i!=j && s1.charAt(i)==s1.charAt(j))
                    {
                        unique=false;

                        break;
                    }
                }
                if(unique==true)
                {
                    System.out.println(s1.charAt(i));

                    break;
                }
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void divideAndReverse()
    {
        try
        {
            ArrayList<String> arr=new ArrayList<String>(Arrays.asList("a","b","c","d","e","f","g","h","i"));

            StringBuffer str=new StringBuffer();

            for(String s:arr)
            {
                str.append(s);
            }

            for(int i=0;i<str.length();i+=3)
            {
                StringBuffer s1=new StringBuffer();

                for(int j=i;j<(i+3);j++)
                {
                    s1.append(str.charAt(j));
                }
                System.out.println(s1.reverse());
            }


        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void frequent()
    {
        try
        {
            ArrayList<Character> arr=new ArrayList<Character>();

            String s="successes";

            for(int i=0;i<s.length();i++)
            {
                if(!arr.contains(s.charAt(i))){
                arr.add(s.charAt(i));
                }
            }
            ArrayList<Integer> arr1=new ArrayList<Integer>();

            ArrayList<Character> arr2=new ArrayList<Character>();

            for(int i=0;i<arr.size();i++)
            {
                int count=0;

                for(int j=0;j<s.length();j++)
                {
                    if(s.charAt(j)==arr.get(i))
                    {
                        count+=1;
                    }
                }
                arr1.add(count);

                arr2.add(arr.get(i));
            }

            int max=Collections.max(arr1);

            for(int i=0;i<arr1.size();i++)
            {
             if(arr1.get(i)==max)
             {
                 System.out.println(arr2.get(i));

                 break;
             }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void removeFromAnotherString()
    {
        try {
            String s1 = "This is String Manipulation";

            String s2 = "knot";

            char arr[] = new char[s1.length()];

            char[] mask = new char[256];

            for (int i = 0; i < s2.length(); i++) {
                mask[s2.charAt(i)]++;
            }

            for (int i = 0; i < s1.length(); i++)
            {
                if (mask[s1.charAt(i)] == 0)
                {
                    System.out.print(s1.charAt(i));
                }
            }
            System.out.println("\n");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void secondMostFrequent()
    {
        try
        {
            ArrayList<Character> arr=new ArrayList<Character>();

            String s="successes";

            for(int i=0;i<s.length();i++)
            {
                if(!arr.contains(s.charAt(i))){
                    arr.add(s.charAt(i));
                }
            }
            ArrayList<Integer> arr1=new ArrayList<Integer>();

            ArrayList<Character> arr2=new ArrayList<Character>();

            for(int i=0;i<arr.size();i++)
            {
                int count=0;

                for(int j=0;j<s.length();j++)
                {
                    if(s.charAt(j)==arr.get(i))
                    {
                        count+=1;
                    }
                }
                arr1.add(count);

                arr2.add(arr.get(i));
            }
            ArrayList<Integer> a1=(ArrayList<Integer>)arr1.clone();

            Collections.sort(arr1);

            int n=arr1.get(arr1.size()-2);

            for(int i=0;i<a1.size();i++)
            {
                if(a1.get(i)==n)
                {
                    System.out.println(arr2.get(i));

                    break;
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void reverseWords()
    {
        try
        {
            String str="This is String Manipulation";

            String[] s=str.split(" ");

            for(int i=s.length-1;i>=0;i--)
            {
                System.out.print(s[i]+" ");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void reverseEveryWord()
    {
        try {
            System.out.println("\n");

            String str = "This is String Manipulation";

            String[] s = str.split(" ");

            for (String i:s)
            {
                StringBuffer c=new StringBuffer(i);

                System.out.print(c.reverse()+" ");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void removePAndLA()
    {
        try
        {
            System.out.println("\n");

            String str="Manipulation";

            char[] arr=str.toCharArray();

            for(int i=0;i<arr.length;i++)
            {
                if (arr[i]=='p')
                {
                    continue;
                }
                else if(i+1<arr.length && arr[i]=='l' && arr[i+1]=='a')
                {
                    ++i;
                }
                else
                {
                    System.out.print(arr[i]);
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void countDuplicates()
    {
        try
        {
            System.out.println("\n");

            String str="Manipulation";

            char[] chr=str.toCharArray();

            String s1="";

            for(char s:chr)
            {
                if(s1.indexOf(s)==-1)
                {
                    s1=s1+s;
                }
            }

            int[] arr=new int[256];

            char c;

            for(int i=0;i<str.length();i++)
            {
                c=str.charAt(i);

                ++arr[c];
            }
            for(int i=0;i<s1.length();i++)
            {
                if(arr[s1.charAt(i)]>1)
                {
                    System.out.println(s1.charAt(i)+" appears: "+arr[s1.charAt(i)]+" times");
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void rotationString()
    {
        try
        {
           String s="ABCDA";

           String s1="CDAAB";

           String concat=s+s;

           if(s.length()==s1.length() && concat.contains(s1))
           {
               System.out.println("They are rotations of each other");
           }
           else
           {
               System.out.println("They are not rotations of each other");
           }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void endsWithString()
    {
        try {
            System.out.println("\n");

            String str = "This is String Manipulation";

            if(str.endsWith("no"))
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void startWithString()
    {
        try {
            System.out.println("\n");

            String str = "This is String Manipulation";

            if(str.startsWith("This"))
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void cutAndAppend()
    {
        try {
            System.out.println("\n");

            String str1 = "String";

            String str2="Manipulation";

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }







}
