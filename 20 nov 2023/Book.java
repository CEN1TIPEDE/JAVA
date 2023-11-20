class Book {
  private int id;
  private String name;

  //construstor
  public Book(int id , String name)
  {
    this.id = id;
    this.name = name;
  }

  //getters and setters
  public int getId()
  {
    return id;
  }

  public void setId(int id)
  {
    this.id = id;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }
}