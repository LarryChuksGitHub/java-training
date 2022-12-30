package chatper12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionTester {
    public static void main(String args[]){
       // setDemo();
        mapDemo();
    }

    public static void setDemo(){
        Set <String> fruit = new HashSet();
        fruit.add("apple");
        fruit.add("banana");
        fruit.add("lemon");
        fruit.add("Mango");
        fruit.add("berry");
        fruit.add("pineapple");
        fruit.add("Mango");

       // System.out.println(fruit.size());
       // System.out.println(fruit);
    /*    var i = fruit.iterator();
        while (i.hasNext()){
           // System.out.println(i.next());
        }

*/
    /*    System.out.println(fruit.size());
        for (String item: fruit){

            System.out.println(item);
        }
*/
        System.out.println(fruit.size());

       // fruit.forEach(item -> System.out.println(item));
        fruit.forEach(System.out ::println);

    }

    public static void mapDemo(){
        Map <String, Integer> fruitcalories = new HashMap<>();
        fruitcalories.put("banana",80);
        fruitcalories.put("apple",90);
        fruitcalories.put("banana",80);
        fruitcalories.put("lemon",80);
        fruitcalories.put("Mango",40);
        fruitcalories.put("berry",56);
        fruitcalories.put("pineapple",44);
        fruitcalories.put("Mango",58);

        System.out.println(fruitcalories.size());
      /*  for ( var entry: fruitcalories.entrySet()){
            System.out.println(entry.getValue());

        }
*/
        fruitcalories.forEach(
                (key, value) ->
                    System.out.println("Fruit: " + key + ", Calories: " + value));
    }
}
