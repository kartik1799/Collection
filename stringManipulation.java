package StringExercise;


public class stringManipulation
{
    public static void main(String args[])
    {
        try
        {
            String str = "Java Exercises";

            stringManipulation st = new stringManipulation();

            compareLexicographically();

            getValue(str);

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

            int num = s1.compareTo(s2);

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
}
