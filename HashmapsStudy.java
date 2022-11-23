import java.util.HashMap;

public class HashmapsStudy {
    public static void main(String[] args) {
        HashMap<String, Integer> examScore = new HashMap<String, Integer>();

        // adding to a hashmap
        examScore.put("Math", 98);
        examScore.put("Science", 95);
        examScore.put("English", 100);
        System.out.println(examScore.toString());

        // printing single value
        System.out.println(examScore.get("English"));

        // put if absent
        examScore.putIfAbsent("English", 65);
        System.out.println(examScore);

        // replace method
        examScore.replace("Math", 110);
        System.out.println(examScore);

        // size of a hash map
        System.out.println(examScore.size());

        // check if a map key exists
        System.out.println(examScore.containsKey("Math"));

        // check if a map value exists
        System.out.println(examScore.containsValue(110)); 

        // get or default
        examScore.getOrDefault("RME", -1);
        System.out.println(examScore);

        // clear a hash map
        examScore.clear();
        System.out.println(examScore);

        // check if a hash map is empty
        System.out.println(examScore.isEmpty());

        examScore.put("Math", 98);
        examScore.put("Science", 95);
        examScore.put("English", 100);
        // for each loop
        examScore.forEach((subject, score) -> {
            System.out.println(String.format("You got %d in %s.", score, subject));
        });
    }
}
