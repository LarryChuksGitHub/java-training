package chatper12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestResults {

    public static Map grades;

    public static void main(String args []){
        grades = getOriginalGrades();
        grades.forEach(
            (key, value) ->
                 System.out.println("Student: " + key + ", first grade: " + value ));
        System.out.println("---------------------------------");
        grades = getMakeUpGrades();
        grades.forEach(
                (key, value) ->
                        System.out.println("Student: " + key + ", make up grade: " + value));
        System.out.println("---------------------------------");
        getFinalGrade();
    }

    public static Map getOriginalGrades(){
        Map <String, Integer> grades = new HashMap();
        grades.put("Angie", 24);
        grades.put("Dave", 32);
        grades.put("Lisi", 80);
        grades.put("Raja", 50);
        grades.put("Shashi", 79);
        grades.put("Bas", 40);
        grades.put("Carlos", 59);
        grades.put("Amber", 55);
        grades.put("Rex", 95);
        grades.put("Jason", 63);
        grades.put("Nikolay", 32);
        //grades.forEach(
           //     (key, value) ->
              //          System.out.println("Student: " + key + ", first grade: " + value));

        return grades;

    }

    public static Map getMakeUpGrades(){

        Map grades = new HashMap();
        grades.put("Angie", 97);
        grades.put("Dave", 82);
        grades.put("Lisi", 76);
        grades.put("Raja", 89);
        grades.put("Shashi", 79);
        grades.put("Bas", 98);
        grades.put("Carlos", 80);
        grades.put("Amber", 95);
        grades.put("Rex", 90);
        grades.put("Jason", 62);
        grades.put("Nikolay", 79);
      /*  grades.forEach(
               (key, value) ->
                       System.out.println("Student: " + key + ", make up grade: " + value));
        */
        return grades;
    }

    public static void getFinalGrade(){
        Map <String, Integer> original = getOriginalGrades();
        Map <String, Integer> makeUp = getMakeUpGrades();
        for (var grades: original.entrySet()){
            Integer firstgrade = original.get(grades.getKey());
            Integer makeUpgrade = makeUp.get(grades.getKey());
            if (makeUpgrade > firstgrade){
                original.put(grades.getKey(), makeUpgrade);
               // finalgrades = getMakeUpGrades();
            } else {
                makeUp.put(grades.getKey(), firstgrade);
               // finalgrades = getOriginalGrades();
            }
        }
        original.forEach(
                (key, value) ->
                        System.out.println("Student: " + key + ", Final grade: " + value));
    }

}
