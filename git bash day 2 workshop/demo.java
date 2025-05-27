
package oops.encapsulation;


public class demo {
    public static void main (String args[]){
        student s1 = new student();
        s1.setName("Raman");
        s1.setEmail("ayan@gmail.com");
        s1.setRollno(123);
        System.out.println(s1.getName());
        System.out.println(s1.getEmail());
        System.out.println(s1.getRollno());
    }
}
