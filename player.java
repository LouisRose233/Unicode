public class player
{
  String firstname;
  String lastname;

  public player(String firstname, String lastname)
  {
    this.firstname = firstname;
    this.lastname = lastname;
  }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getFullName()
    {
      return firstname + " " + lastname;
    }

}