public class Person {
    
   private  String name;
   private Integer age;
    
  // adding getter and setter method. 

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
      public Person() {
        this.name = name;
        this.age = age;
    }
   
    //This function will return the result,whether a person is adult or not.
    public boolean isAdult(Integer age) {
        if (age >= 18) return true;
        else return false;
    }
    //creating constructor.
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }   
}
