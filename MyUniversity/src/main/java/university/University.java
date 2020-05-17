package university;

public class University {
    String name;
    Student[] students;
    public University(String name) {
        this.name = name;
        students = new Student[0];
    }

    public Student[] getStudents() {
        return this.students;
    }
    public void addStudent(Student student) {
        Student[] tempStudents = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            tempStudents[i] = students[i];
        }
        tempStudents[tempStudents.length - 1] = student;
        students = tempStudents;
    }
    public void removeStudent(Student student) {
        //перебираем весь массив
        for (int i = 0; i < students.length; i++) {

            //проверяем существует ли такой студент
            if (students[i].equals(student)) {
                //если существует то..
                //создаем массив на 1 меньше, чем оригинал
                Student[] tempStudents = new Student[students.length - 1];
                //помечаем юзера null-ом, чтобы не переносить в новый массив
                students[i] = null;
                //перебираем массив студентов, чтобы перенести их в новый массив
                //и определяем для этого счетчик нового массива
                int counterOfUsersWichAreMovedToNewArray = 0;
                for (int j = 0; j < students.length; j++) {
                    // переносим только тех, что не null
                    if (students[j] != null) {
                        // В ячейку нового массива вставляем юзера из старого
                       tempStudents[counterOfUsersWichAreMovedToNewArray] = students[j];
                        // Увеличиваем счетчик юзеров нового массива на 1
                        counterOfUsersWichAreMovedToNewArray++;
                    }
                }
                //Говорим, что переменная класса теперь ссылается на новый массив
                students = tempStudents;
                        break;
            }
        }
    }
    public void editStudent(Student student) {

        int length = students.length;
        for (int i = 0; i < length; i++) {
            if (students[i].equals(1))
                students[i] = null; }
        for (int i = 0; i < length; i++) {
            System.out.println(students[i]); }
    }
}
