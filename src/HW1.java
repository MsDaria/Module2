public class HW1 {
    public static void section1(){
        Employee employee = new Employee();

        employee.setName("Даша");
        employee.setAge(13);
        employee.setSalary(50000);

        System.out.println("Имя: " + employee.getName());
        System.out.println("Возраст: " + employee.getAge() + " лет");
        System.out.println("Зарплата: " + employee.getSalary() + " долларов");
    }
}

class Person {
    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Employee extends Person{
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

