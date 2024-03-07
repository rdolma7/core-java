package objectbasic.inheritance;

import java.util.List;

public class Manager extends Person{

    private String dept;
    private double bonus;
    private List<Employee> tree;

    public String getDept(){return dept;}
    public void setDept(String dept){this.dept=dept;}

    public double getBonus(){return bonus;}
    public void setBonus(double bonus){this.bonus=bonus;}
    public List<Employee> getTree(){return tree;}
    public void setTree(List<Employee>tree){this.tree=tree;}
}
