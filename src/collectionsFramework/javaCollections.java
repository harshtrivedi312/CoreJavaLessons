package collectionsFramework;

import java.sql.SQLOutput;
import java.util.*;

public class javaCollections {

    //Java collection means a single unit of objects.Java collections framework
    // provides many interfaces...such as set,List,QUEUE,Deque and classes like
    //ArrayList,Vector,LinkedList,PriorityQueue,HashSet,LinkedHashSet,TreeSet.

    //java collections framework represents a unified architecture for storing
    // and manipulating a group of objects.

    //Iterable

    //collection

    // LIST          // QUEUE                  // SET

    //ArrayList--the latest added element is to the last of the list      //Priority Queue          // HashSet
    //LinkedList-- nodes could be LIFO FIFO,could be sorted       //Deque                   // LinkedHashSet
    //vector--LIFO pushBack and PopBack        //ArrayDeque               SORTED SET
    //stack--LIFO                 TreeSet


    //Iterator interface provides a facility for iterating the elements in
    // a forward direction only.


    public static void main(String[] args) {
       // ArrList();
       // LinkList();
       // vector();
       // stack();
       // hashset();
        treeset();
    }


    public static void ArrList(){
        //ArrayList of integers

        ArrayList<Integer> numbers  = new ArrayList<>();

        //adding elements to the ArrayList

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        //accessing elements in the ArrayList
        System.out.println("Element at index 2: " + numbers.get(2));

        //Update an element in ArrayList
        numbers.set(3,45);
        System.out.println("updated element at index 3: " + numbers.get(3));

        //removing elements from ArrayList
        numbers.remove(1);
        System.out.println("Array ist size is modified by removing: " + numbers);

        //checking if element is present in the ArrayList
        System.out.println("is there number 50? " + numbers.contains(50));

        //for each loop Iterating over ArrayList
        System.out.println("elements in the ArrayList: ");
        for (int number : numbers){
            System.out.print(number+ " ");
        }
        System.out.println();

        // to get the size of an arrayList
        System.out.println("the size of the given array: " + numbers.size());

    }

    public static void LinkList(){
        LinkedList<String> names = new LinkedList<>();

        //add names to this Linked List
        names.add("Bob");
        names.add("Charlie");
        names.add("Joe");
        names.add("Eva");
        names.add("David");

        System.out.println("elements in Linked list:" + names);

        //at given index
        System.out.println("name at given index: " + names.get(4));

        //update a name
        names.set(3,"Daniel");
        System.out.println("revised name List: " + names);

        //removing a name from the LinkedList
        names.remove(4);
        System.out.println("removed name at index 4");

        //check if the name exists
        System.out.println("Does Eva name in LinkedList?" + names.contains("Eva"));

        //iterating
        for (String name : names){
            System.out.print(name + " ");
        }
        System.out.println();

        // final size
        System.out.println("size of this LinkedList: " +names.size());

    }

    public static void vector(){
        Vector<String> vector = new Vector<>();

        //add names to this Linked List
        vector.add("Bob");
        vector.add("Charlie");
        vector.add("Joe");
        vector.add("Eva");
        vector.add("David");

        //print all elemets
        System.out.println("vector contains: " + vector);

        //getting the capacity
        System.out.println("capacity of vector is:" + vector.capacity());

        //trim
        vector.trimToSize();
        System.out.println( "size of vector after trim to size:  "+ vector.capacity());

        //adding elements

        vector.add("Alice");
        vector.add("Katrina");
        System.out.println("new vector: " + vector);
        System.out.println("capacity after adding: " + vector.capacity());


        String firstElement = vector.firstElement();
        String lastElement = vector.lastElement();

        System.out.println(firstElement +" " + lastElement);

        //check if vector is empty
        System.out.println("is the vector empty? " + vector.isEmpty());

        //clearing vector
        vector.clear();
        System.out.println("vector after clearing: " + vector);

        //check if its empty
        System.out.println("vector is empty? " + vector.isEmpty());

    }

    public static void stack(){
        Stack<String> stack = new Stack<>();

        //add
        stack.push("Gayatri");
        stack.push("Driss");
        stack.push("Ekuye");

        //check if stack is empty?
        System.out.println("is this stack empty? " + stack.empty());

        //peaking the top element in stack
        String topElement = stack.peek();
        System.out.println(topElement);

        //popping elements from the stack
        String poppedElement = stack.pop();
        System.out.println("Popped element: "+ poppedElement );

        // check the stack
        System.out.println("is stack empty? " + stack.empty());

        //searching for element

        int index = stack.search("Driss");
        System.out.println("Index of searched element: " + index);

    }

    //SETS

    //create a hashSet of strings

    public static void hashset(){

        //HashSet does not guarantee the order of elements,
        // and it does not allow duplicate elements.

        HashSet<String> set = new HashSet<>();

        //adding to hashSet
        set.add("Apple");
        set.add("Bannana");
        set.add("Orange");
        set.add("Pineapple");

        //adding a duplicate element
        set.add("Apple");

        //checking size
        System.out.println("the size of hashSet: " + set.size());

        //check element id exists
        System.out.println("is Bannana there? " + set.contains("Bannana"));

        //remove form set
        set.remove("Orange");
        System.out.println("after Removing: " + set);

        //iterating
        System.out.println("elements in this set: ");
        for (String element : set){
            System.out.println(element + " ");
        }
        System.out.println();
    }

    //LinkedHashSet

    //LinkedHashSet is an implementation of the Set interface that maintains the
    // insertion order of elements, unlike HashSet. It combines the functionality of HashSet
    // and LinkedList, providing both the constant-time performance for basic operations and
    // the order-preserving behavior.

    //Tree Set
    //TreeSet is an implementation of the SortedSet interface that maintains elements in a
    // sorted order based on their natural ordering or a custom Comparator. It provides
    // efficient operations for adding, removing, and retrieving elements, and the elements
    // are always sorted in ascending order.

    public static void treeset(){

        TreeSet<Integer> tset = new TreeSet<>();

        tset.add(5);
        tset.add(4);
        tset.add(3);
        tset.add(2);
        tset.add(6);
        tset.add(1);

        //duplicate
        tset.add(2);

        //print size of treeSet
        System.out.println(tset.size());
        System.out.println(tset);



    }

}
