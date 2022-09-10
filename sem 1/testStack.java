import java.util.Scanner;

public class testStack {
    public static void main(String[] args) {
        stack st = new stack();
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the capacity of the stack");
        int capacity = s.nextInt();
        st.setCapacity(capacity);
    try{
        System.out.println("Enter the elements to be pushed");
        for (int i = 0; i < capacity; i++) {
            String f = s.next();
            if(f.equals("")){
                break;
            }   
            Integer num = Integer.valueOf(f);
            st.push(num);
            System.out.println("do you want to push more elements");
            String choice = s.next();
            if (choice.equalsIgnoreCase("y")) {
                continue;
            } else {
                break;
            }
        }
        }catch( Exception e){
            System.out.println("invalid input");
        }

        System.out.println("The elements in the stack are" + st.display());  
        System.out.println("The size of the stack is " + st.size());
        System.out.println("The first number is " + st.first());
        System.out.println("The top number is " + st.atTop());
    }
}