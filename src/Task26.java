import java.util.*;
import java.lang.*;



class Task26 {
    public static void main (String[] args) {

        Student student1 = new Student( "Dawid","Pauka"," 83021811493 ");
        Student student2 = new Student( "Dawid","Pauka","83021811493");
        Student student3 = new Student("Paulina", "Kowalska", "86122712541");
        Student student4 = new Student("Sonia", "Nowak","18112612345");

        RatingsStudent r1 = new RatingsStudent(4.0,5.0,6.0);
        RatingsStudent r2 = new RatingsStudent(3.0,2.0,4.0);
        RatingsStudent r3 = new RatingsStudent(3.5,5.0,5.0);
        RatingsStudent r4 = new RatingsStudent(4.0,4.5,6.0);

        r1.getAverage();

        HashMap<Student,RatingsStudent> result = new HashMap<Student,RatingsStudent>();
        result.put(student1, r1);
        result.put(student2, r2);
        result.put(student3, r3);
        result.put(student4, r4);

        for (Map.Entry<Student,RatingsStudent>entry:result.entrySet()){
            System.out.println(" Object: < " + entry.getKey()+ " " + entry.getValue().getAverage()+ " > ");
        }


    }
}

class Student {
    private String firstName;
    private String lastName;
    private String peselId;

    public Student(String firstName, String lastName, String peselId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.peselId = peselId;
    }

    @Override
    public boolean equals( Object o) {
        Student student = (Student) o;
        return this.firstName.equals(student.firstName)&&lastName.equals(student.lastName)&&peselId.equals(student.peselId);
    }
    @Override
    public int hashCode(){
        return peselId.hashCode();
    }

    public String toString(){
        return firstName + "  " + lastName;
    }

}


class RatingsStudent{
    private Double math;
    private Double biology;
    private Double informatics;

    public RatingsStudent(Double math,Double biology,Double informatics){
        this.math = math;
        this.biology = biology;
        this.informatics = informatics;
    }
    public Double getRatingsMath(){
        return math;
    }
    public Double getRatingsBiology(){
        return biology;
    }
    public Double getRatingsInformatics(){
        return informatics;
    }

    public double getAverage(){
        return (math + biology + informatics)/3;
    }




}
