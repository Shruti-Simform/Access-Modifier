// IN PACKAGE 'personal'
package personal;

public class Personal {
    //VARIABLES WITH ACCESS MODIFIERS
    public int id;
    protected String name;
    private int salary;

    //PUBLIC GETTER & SETTER FOR ID
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    //GETTER & SETTER FOR NAME
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

    // PRIVATE METHOD
    private void privateMethod() {
        System.out.println("Calling private method...");
    }

    // PROTECTED METHOD
    protected void protectedMethod() {
        System.out.println("Calling protected method...");
    }

}
