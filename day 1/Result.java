//Using if…….else if….  Else,  display whether result is  fail, pass, second class , first class, Distinction etc.



class Result
{
            public static void main(String args[] )
            {
      int marks=70;
     if(marks>63)
{
    System.out.println("Distinction");
}
else if(marks<=62 && marks>54)
{
System.out.println("First Class");
}

else if(marks<=54 && marks>45)
{
System.out.println("Second Class");
}
else if(marks<=45 && marks>33)
{
System.out.println("Pass");
}
else
{
System.out.println("Fail");
}
}
}


/*_______________________________________________
 OUTPUT
Distincton */
                       
