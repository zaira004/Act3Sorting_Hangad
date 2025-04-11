import java.util.Scanner; 
public class StudentSort{

    static class Student{
        String name;
        double grade;
        public Student(String name, double grade){
            this.name = name;
            this.grade;

        }


        public String toString(){
            return name+"-"+ grade;
        }
    }

    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.print("How many students?");
        int numStudents = s.nextIn();
        s.nextline();

        Student [] students = new Student[numStudents];
        for(int i = 0; i < numStudents; i++){
            System.out.print("\n Enter details for Students *" + (i + 1));
            System.out.print("name:");
            String name = s.nextline();

            System.out.print("Grade:");
            double grade = s.nextDouble();
            s.nextline();

            students[i] = new Student(name, grade);
        }

        bubbleSort(students);

        System.out.println("\n Sorted students (Ascending)");
        for (student st : students){
            System.out.print(st);
        }
    }

    public static void bubbleSort(Student[] arr){
        int n - arr.length;
        boolean swapped;

        for (int j = 0; i < n; i++){
            swapped = false;

            for(int j = 0; j < n; -i -1; j++){
                if(arr[j].grade > arr{j + 1}.grade){
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j = 1] = temp;
                    swapped = true;
                }
            }
            if(swapped) break;
        }
    }
}     