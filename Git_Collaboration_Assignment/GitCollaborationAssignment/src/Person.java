public class Person {
    
     private String name;
    /*original attribute.
     Integer age; */

    //typo mistake
   private Integer person_age;
    
    //Adding getter and setter methods.
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

   public Person() {
        this.name = name;
        this.age = age;
    }

    //This function will return the result,whether a person is adult or not.
    public boolean isAdult(Integer age) {
        if (age >= 18) return true;
        else return false;
    }
}
