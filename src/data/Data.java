package data;

import personal.*;

class Data extends Personal {
    public static void main(String[] args) {
        Personal data = new Personal();
        data.setId(101);
        int id = data.getId();

        data.setName("Shruti");
        String name = data.getName();

        data.setSalary(1000);
        int sal = data.getSalary();

        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + sal);

        //data.privateMethod();           // (ERROR) : private method can't be accessed outside the class
        //data.protectedMethod();        // (ERROR) : protected method can't be accessed everywhere
        Data d = new Data();             // protected method can be accessed by subclass in other packages
        d.protectedMethod();
    }
}
