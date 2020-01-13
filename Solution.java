import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Set<Person> treeSet = new TreeSet<>();
        var arrayList = new ArrayList<Person>();

        
        addObject(treeSet);
        addObject(arrayList);

        Collections.sort(arrayList);

        System.out.println(arrayList);
        System.out.println(treeSet);

    }


    public static void addObject(Collection<Person> collection){
        collection.add(new Person(3, "Nikitovich"));
        collection.add(new Person(2, "Gaguna"));
        collection.add(new Person(1, "Vlad"));
        collection.add(new Person(4, "Karim"));
    }


}


class Person implements Comparable<Person>{
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        if(this.getId() > person.getId()){
            return 1;
        } else if(this.getId() < person.getId()){
            return -1;
        } else
            return 0;
    }
}