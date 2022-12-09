import java.util.*;
class books {
Scanner sc = new Scanner(System.in);
String name,author;
int price,num_pages;
books(){
}

books(String name,String author,int price,int num_pages)
{
this.name = name;
this.author = author;
this.price = price;
this.num_pages = num_pages;
}

void getdata()
{
System.out.println("Enter the name of the book");
name = sc.nextLine();
System.out.println("Enter the name of the author");
author = sc.nextLine();
System.out.println("Enter the price");
price = sc.nextInt();
System.out.println("Enter the number of pages");
num_pages = sc.nextInt();
}
public String toString()
{
return ("Name : "+name+"\nAuthor : "+author+"\nPrice : "+price+"\nNumber of pages : "+num_pages);
}
}

class Main
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
//books b1 = new books("Mehta","neil",56,154);
//System.out.println("Constructor values : \n"+b1);
System.out.println("Enter the number of object of books");
int n = sc.nextInt();
books s[] = new books[n];
for(int i = 0;i<n;i++)
{
s[i] = new books();
System.out.println("Enter the details of "+(i+1)+"book");
s[i].getdata();
}
for(int i = 0;i<n;i++)
{
System.out.println("\nDetails of the book"+(i+1));
System.out.println(s[i]);
}
}
}
