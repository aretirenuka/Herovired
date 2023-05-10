import java.util.*;
class Author
{
	String name,email;
	char gender;
	public Author(String name,String email,char gender)//parameterized constructor
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public void displayAuthorDetails()//displaying details
	{
		System.out.println(name+" "+email+" "+gender);
	}
}
class Book
{
	String bname;
	float price;
	int qty;;
	Author a;//author obj declared as parameter
	public Book(String bname,float price,int qty,Author a)//parameterized constructor
	{
		this.bname=bname;
		this.price=price;
		this.qty=qty;
		this.a=a;
	}
	public void displayBookInfo()//displaying book details
	{
		System.out.println("Book Name = "+bname);
		System.out.println("Author Name = "+a.name);//obj.name
		System.out.println("Author Email = "+a.email);
		System.out.println("Author gender = "+a.gender);
		System.out.println("price = "+price);
		System.out.println("quantity = "+qty);
	}
}
public class Wiproprogram
{
public static void main(String[] args){
		Author a1=new Author("bhavya","deepu@aec.edu.in",'F');
		Book b1=new Book("java oops",250,150,a1);
		b1.displayBookInfo();
		}
	}
