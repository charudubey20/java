//using switch ….case   display whether character is vowel or not.


public class Vowel
{
  public static void main(String[] args)
{

 char ch='d';
switch(ch)
{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
System.out.println(ch + " is vowel");
    break;
 default:
 System.out.println(ch + " is consonant");
 }
 }
}
