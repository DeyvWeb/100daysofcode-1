class Third {
    // Association (how does class knows about the other class)   - connection or relationship between two separate classes and how objects of the separate classes associate with each other.   
// one to one, one to many, many to one, many to many

    //Concept of Aggregation 

    String city, state, country;

    int pinCode;

    public Third(String city, String state, String country, int pinCode)
    {
        this.city = city;
        this.state = state;
        this.country = country;
        this.pinCode = pinCode;
        
    }

}

class Student{
    String name;
    int rollNo;
    Third third;
    int pinCode;
    public Student(String name, int rollNo, Third third)
    {
        this.name = name;
        this.rollNo = rollNo;
        this.third = third;
    }

    void display()
    {
        System.out.println("Name: "+name+ "Roll no : " +rollNo);
        System.out.println("Address ");
        System.out.println(third.city + " "+ third.state + " " + third.country);
        System.out.println("\n");

    }


}

public static void main(String args[])
{
  Third addr1 = new Third ("CHENNAI" , "TAMILNADU", "INDIA", 630043);
  Third addr2 = new Third("RANCHI", "JHARKHAND", "INDIA", 825001);
  Student st1 = new Student("Deyvant R.K Bhardwa", 19233, addr1);
  Student st2 = new Student("Oshi Kumari", 13223, addr2);
  st1.display();
  st2.display();
  
}