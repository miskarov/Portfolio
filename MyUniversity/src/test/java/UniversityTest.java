import org.junit.Assert;
import org.junit.Test;
import university.Student;
import university.University;

public class UniversityTest {
    @Test
    public void addStudentTest() {
        Student student1 = new Student ("Vasya");
        University univer = new University("ONPU");
        Assert.assertEquals(0, univer.getStudents().length);
        univer.addStudent(student1);
        Assert.assertEquals(1, univer.getStudents().length);
    }
    @Test
    public void removeStudentTest() {
        Student student1 = new Student ("Vasya");
        Student student2 = new Student ("Petya");
        University univer = new University("ONPU");
        Assert.assertEquals(0, univer.getStudents().length);
        univer.addStudent(student1);
        univer.addStudent(student2);
        Assert.assertEquals(2, univer.getStudents().length);
        univer.removeStudent(student2);
        Assert.assertEquals(1, univer.getStudents().length);



    }
    @Test
    public void editStudentTest() {
        Student student1 = new Student ("Vasya");
        Student student2 = new Student ("Petya");
        University univer = new University("ONPU");
        Assert.assertEquals(0, univer.getStudents().length);
        univer.addStudent(student1);
        univer.addStudent(student2);
        Assert.assertEquals(2, univer.getStudents().length);
        univer.editStudent(student2);
        Assert.assertEquals(2, univer.getStudents().length);
        
    }
}
