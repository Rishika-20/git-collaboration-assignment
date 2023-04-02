public class Person {
    
     String name;
    Integer age;
    
    // setting getter and setter.
    public String getName() {
        return name;
    }    
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    //creating constructor.
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }   
}
