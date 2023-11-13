class Student {
	private String name;
    private char gender;
    private int id,score;
  
  //contructor
  public Student(int id , String name, char gender, int score)
  {
    this.name = name;
    this.gender = gender;
    this.id = id;
    this.score = score;
  }
  
  //getter
  public String getName(){
  	return name;
  }
  public char getGender(){
  	return gender;
  }
  public int getId(){
  	return id;
  }
  public int getScore(){
  	return score;
  }
  
  //setter
	public void setName(String name){
  	this.name = name;
    }
    public void setGender(char gender){
      this.gender = gender;
    }
    public void setId(int id){
      this.id = id;
    }
    public void setScore(int score){
      this.score = score;
    }
  
  //method
  public char calGPA(){
    if(score>=80 && score<=100)
    {
      return 'A';
    }
    else if(score>=70 && score<=79)
    {
      return 'B';
    }
    else if(score>=60 && score<=69)
    {
      return 'C';
    }
    else if(score>=50 && score<=59)
    {
      return 'D';
    }
    else if(score>=0 && score<=49)
    {
      return 'F';
    }
    else//in this method is require something to return if anything doesn't fit condition above
    {
      return 'N';
    }
  }
  
}