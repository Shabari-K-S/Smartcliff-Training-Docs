/**
 * Array of Objects
 */

class Students{
    int studentId=0;
    String studentName="";

    public void display(){
        System.out.println(
                "Student Id: " + this.studentId
                + "\nStudent Name: " + this.studentName
        );
    }
}

public class Main {
    public static void main(String[] args) {
//        Students batch_1[] = new Students[10];
//        batch_1[0] = new Students();
//        batch_1[1] = new Students();
//
//        batch_1[0].studentId = 137;
//        batch_1[1].studentId = 161;
//        batch_1[0].studentName = "Shabari K S";
//        batch_1[1].studentName = "Swathi V" ;
//
//        batch_1[0].display();
//        batch_1[1].display();
//
        int[][] arr = new int[3][];
        arr[1] = new int[2];
        arr[0] = new int[3];
        int len = 0;
        for(int i=0;i<arr.length;i++){
            try {
                len = arr[i].length;
            }catch (Exception e){
                len=0;
            }
            for(int j=0;j<len;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}