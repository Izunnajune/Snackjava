public class SchoolTest {
 
public static void main(String... args){
 School school = new School();
   
school.setSchoolName("Maranatha College");

school.setNumberOfStudent(200);

System.out.println("Name of my School is " +school.getSchoolName());
System.out.println("We have " +school.getNumberOfStudent() + "students");
  }
}