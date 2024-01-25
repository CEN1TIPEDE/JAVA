import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Library {
  private String name;
  private ArrayList<Employee> employees;
  private ArrayList<Book> books;

  //constructor
  public Library(String name)
  {
    this.name = name;
    employees = new ArrayList<Employee>();
    books = new ArrayList<Book>();
  }
//getters and setters
  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }


//method
  public void addEmployee(Employee m)
  {
    employees.add(m);
  }

  public boolean removeEmployee(int employeeId)
  {
    for(Employee m: employees)//for each: loop in every one each
    {
      if(m.getEmployeeId() == employeeId)
      {
        employees.remove(m);
        return true;
      }
    }
    return false;
  }

  public int getNumberOfEmployees()
  {
    return employees.size();
  }

  public double getTotalSalary()
  {
    double sum=0;
    for(Employee em: employees)
    {
      sum = sum + em.getSalary();
    }
    return sum;
  }

  public void addBook(Book b)
  {
    books.add(b);

    Collections.sort(books , new Comparator<Book>() {
      @Override
      public int compare(Book o1 , Book o2)
      {
        return o1.getId() - o2.getId();
      }
    });//for sorting
  }

  //method print
  public void printInfoOfAllBooks(){
    for(int i=0;i<this.books.size();i++){
        System.out.println("(id: "+this.books.get(i).getId()+", name : "+this.books.get(i).getName()+")");
    }
  }

  public int searchBookByName(String name)
  {
    int count = 0;

    for(Book b: books)
    {
      if(b.getName().equals(name))
      {
        count++;
      }
    }
    return count;
  }

  public int searchBookById(int id)
  {
    for(Book b: books)
    {
      if(b.getId() == id)
      {
        return books.indexOf(b);
      }
    }
    return -1;
  }

  public Book borrowBook(int id)
  {
    for(Book b: books)
    {
      if(b.getId() == id)
      {
       books.remove(b);
       return b;
      }
    }
    return null;
  }

  public void returnBook(Book b)
  {
    addBook(b);
  }

  public int getAmountOfBooks()
  {
    return books.size();
  }

}
