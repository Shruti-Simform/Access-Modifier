package personal;

public class Personal {
    public int id;
    protected String name;
    private int salary;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //GETTER & SETTER FOR SALARY
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    private void privateMethod() {
        System.out.println("Calling private method...");
    }

    protected void protectedMethod() {
        System.out.println("Calling protected method...");
    }

}
