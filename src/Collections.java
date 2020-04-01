import java.util.ArrayList;
import java.util.HashMap;

public class Collections {
    public static void main(String[] args) {

        // *************************************************** //
        // ********* ArrayList and its Methods *************** //
        // *************************************************** //

        // 1. Initialize an ArrayList of Strings, called roasts
//        ArrayList<String> roasts = new ArrayList<>();
//        //   add light, medium, medium, dark to the array list, one at a time
//        roasts.add("light");
//        roasts.add("medium");
//        roasts.add("medium");
//        roasts.add("dark");
//
//        System.out.println(roasts);
//        // 2. Check to see if the list contains "dark" , and then "espresso"
//
//        System.out.println(roasts.contains("dark"));
//        System.out.println(roasts.contains("espresso"));
//        // 3. Find the last index of "medium" in the array
//
//        System.out.println(roasts.lastIndexOf("medium"));
//        // 4. Check if the array list is empty
//
//        System.out.println(roasts.isEmpty());
//        // 5. Assign the array list an empty ArrayList object, and then check if empty
//
//        ArrayList<String> emptyList = new ArrayList<>();
//        System.out.println(emptyList.isEmpty());
//
//        // 6. Remove the espresso roast
//        roasts.add(2, "espresso");
//        System.out.println(roasts);
//
//        roasts.remove("espresso");
//        System.out.println(roasts);
//
//        // 7. Remove the element at index 2
//        roasts.remove(2);
//        System.out.println(roasts);


        // *************************************************** //
        // ********* Hash Maps and their Methods ************* //
        // *************************************************** //

        // 1. Create a HashMap called usernames that contains:
        //   a. first name
        //   b. Github username
        HashMap<String, String> usernames = new HashMap<>();
        usernames.put("Bob", "userbob");
        usernames.put("Jane", "userjane");
        usernames.put("Sam", "usersam");

        System.out.println(usernames);

        // 2. re-initialize the HashMap using the .clear() method
        usernames.clear();
        System.out.println(usernames);

        // 3. use the .put() method to add "Casey" -> "fridaynext" back to the map
        usernames.put("Bob", "userbob");
        System.out.println(usernames);

        // 4. use the .putIfAbsent() method to add
        usernames.putIfAbsent("Jane", "userjane");
        usernames.putIfAbsent("Bob", "newbob");
        System.out.println(usernames);

        //   a. "Vivian" -> "viviancan"
        //   b. "Casey" -> "XpenguinX"
        // 5. What happend with the .putIfAbsent()? Did both items get added? Why/why not?
            // putIfAbsent will ONLY add if key is absent
        // 6. Use the .remove() method to remove "Casey"
        usernames.remove("Bob");
        System.out.println(usernames);

        // 7. Use the .replace() method to change Vivian's username to "viviancandev"
        usernames.replace("Jane", "newjane");
        System.out.println(usernames);

        // 8. Use the .clear() method to clear the map
        usernames.clear();
        System.out.println(usernames);

        // 9. Use the .isEmpty() method to verify that it was cleared
        System.out.println(usernames.isEmpty());

    }
}