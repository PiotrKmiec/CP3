public class Student{
    // attributes
    String name;
    int age;
    String albumId;
    boolean validity = false;
    int semester;
    double gradeAverage;
    
    // methods
    public void isIdValid(){
        if(this.validity){
            System.out.print("The student's ID ("+this.albumId+") is valid!\n");
        }else{
            System.out.print("The student's ID ("+this.albumId+") is NOT valid!\n");
        }
        return;
    }
    
    public void displayDetails(){
        String content = "Student name: "+this.name+"\nSemester number: "+this.semester+"\nGrade avg.: "+this.gradeAverage+"\n";
        System.out.print(content);
        return;
    }
    public void changeIdValidity(boolean status){
        this.validity = status;
        return;
    }
    public void displayIdDetails(){
        String content = "Student name: "+this.name+"\nAlbum ID: "+this.albumId+"\nID is valid: "+this.validity+"\n";
        System.out.print(content);
        return;
    }
    
    public void sayHello(){
        System.out.print("Hello!\n");
        return;
    }
    public void displayName(){
        System.out.print("My name is "+this.name+"\n");
        return;
    }
    public void displayAge(){
        System.out.print("Im "+this.age+" years old\n");
        return;
    }
    
    public static void main(String[] args){
        Student student1 = new Student();
        student1.name = "Ola";
        student1.age = 23;
        student1.albumId = "221548";
        student1.validity = true;
        student1.semester = 3;
        student1.gradeAverage = 4.02;
        // display the information
        student1.displayDetails();
        student1.displayIdDetails();
        student1.isIdValid();
        student1.changeIdValidity(false);
        student1.isIdValid();
    }
}