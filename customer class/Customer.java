public class Customer{
    private String firstname;
    private String lastname;
    private int customerId;

    public Customer(String fn , String ln , int id)
    {
    firstname = fn;
    lastname = ln;
    customerId = id;
    }

    public String getFn()
    {
        return firstname;
    }

    public void setFn(String firstname)
    {
        this.firstname = firstname;
    }

    public String getLn()
    {
        return lastname;
    }

    public void setLn(String lastname)
    {
        this.lastname = lastname;
    }

    public int getCusID()
    {
        return customerId;
    }

    public void setCusId(int customerId)
    {
        this.customerId = customerId;
    }

}