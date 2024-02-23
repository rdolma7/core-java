package objectbasic.inheritance;

public class Employee extends Person{

    private String dept;
    private String position;

    public String getDept(){return dept;}
    public void setDept(String dept){this.dept = dept;}

    public String  getPosition(){return position;}
    public void setPosition(String position){this.position=position;}
}
