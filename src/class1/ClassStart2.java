package class1;

public class ClassStart2 {

    public static void main(String[] args) {

        String[] nameArr = {"학생1", "학생2"};
        int[] ageArr = {15, 16};
        int[] gradeArr = {90, 80};

        for(int i = 0; i < nameArr.length; i++){
            System.out.println("이름: [" + nameArr[i] + "] 나이: [" + ageArr[i] + "] 성적: [" + gradeArr[i] + "]");
        }   // end for

    }   // main

}   // class