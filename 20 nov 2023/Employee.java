class Employee extends Human{
  private int employeeId;
  private double salary;

  //constructor
  public Employee(int id , String name , int employeeId , double salary)
  {
    super(id, name);
    this.employeeId = employeeId;
    this.salary = salary;
  }

  //getters and setters
  public int getEmployeeId()
  {
    return employeeId;
  }

  public void setEmployeeId(int employeeId)
  {
    this.employeeId = employeeId;
  }

  public double getSalary()
  {
    return salary;
  }

  public void setSalary(double salary)
  {
    this.salary = salary;
  }
}
