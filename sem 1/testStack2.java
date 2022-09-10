import java.util.Scanner;

public class testStack2 {
    public static void main(String[] args) {
        stack st = new stack();
        Scanner s = new Scanner(System.in);

        try {
            System.out.println("Enter the capacity of the stack");
            int capacity = s.nextInt();
            st.setCapacity(capacity);
            for (int i = 0; i < capacity; i++) {
                System.out.println("Enter the elements to be pushed");
                String num = s.next();
                st.push(Integer.parseInt(num));
                

                System.out.println("do you want to pop last number?");
                String choice = s.next();
                if (choice.equalsIgnoreCase("y")) {
                    st.pop();
                }
            }

            System.out.println("The elements in the stack are" + st.display());
            System.out.println("The size of the stack is " + st.size());
            System.out.println("The first number is " + st.first());
            System.out.println("The top number is " + st.atTop());
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}