package Opgave10_9;

public class Course {
    private String courseName;
    private String [] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName){
        this.courseName = courseName;
    }

    //Til første opgave bruger jeg addStudent metoden til automatisk at øge array størrelsen hvis der er pladsmangel.
    //Ved hjælp af loop, kopierer jeg indholdet til et nyt, større array. Kilde: Introduction to java programming s.279
    public void addStudent(String student){
        if(numberOfStudents == students.length){
            String[] targetArray = new String[students.length + 1];
            for (int i = 0; i < students.length; i++){
                targetArray[i] = students[i];
            }
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents(){
        return students;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    public String getCourseName(){
        return courseName;
    }

    public void dropStudent(String student){
        for(int i=0; i < students.length; i++){ //Loop
            if(student.equals(students[i])){ //hvis navnet i dropStudent("") er lig med et navn på listen...
                students[i] = null; //... sættes elevens værdi/navn til null
                numberOfStudents--; //et index bliver slettet
                while (i < numberOfStudents){ //???
                    students[i] = students[i+1];
                    i++;
                }
            }
        }
    }

    public void clear(){
        students = new String[100]; //Gendanner array
        numberOfStudents = 0; //sletter alle index ved at sætte indexværdi til 0
    }
}
