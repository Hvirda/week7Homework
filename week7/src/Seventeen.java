public class Seventeen {
    /*
    17. Person
Write a class with the name Person. The class needs three fields (instance variables) with the names
firstName, lastName of type String and age of type int.
Write the following methods(instance methods):
*Method named getFirstName without any parameters, it needs to return the value of the firstName
field.
*Method named getLastName without any parameters, it needs to return the value of the lastName
field.
*Method named getAge without any parameters, it needs to return the value of the age field.
*Method named setFirstName with one parameter of type String, it needs to set the value of the
firstName field.
*Method named setLastName with one parameter of type String, it needs to set the value of the
lastName field.
*Method named setAge with one parameter of type int, it needs to set the value of the age field. If
the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
*Method named isTeen without any parameters, it needs to return true if the value of the age field is
greater than 12 and less than 20, otherwise, return false.
*Method named getFullName without any parameters, it needs to return the full name of the person.
*In case both firstName and lastName fields are empty, Strings return an empty String.
*In case firstName is an empty String, return firstName.
*In case lastName is an empty String, return lastName.
     */

    public static void main(String[] args) {
        Seventeen sv=new Seventeen();
        sv.setFirstName(" ");
        sv.setLastName(" ");
        sv.setAge(10);
        System.out.println("fullname is= : "+sv.getFullName());
        System.out.println("teen= "+sv.isTeen());
        sv.setFirstName("John");

        sv.setAge(19);
        System.out.println("fullname is= : "+sv.getFullName());
        System.out.println("teen= "+sv.isTeen());
        sv.setLastName("Smith");
        System.out.println("fullname= "+sv.getFullName());



    }
    String firstName;
    String lastName;
    int age;
    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age<0&&age>100){
            age=0;
        }
        this.age = age;
    }
    public boolean isTeen(){
        if (age>12 && age<20)
            return true;
        else
            return false;
    }
    public String getFullName(){
        if(firstName.isEmpty())
            return "firstname empty";

       else if (lastName.isEmpty()){
            return "lastname empty";
        } else if (firstName.isEmpty()&&lastName.isEmpty()) {
           return "both are empty";

        } else
        return firstName+" "+lastName;
    }

}