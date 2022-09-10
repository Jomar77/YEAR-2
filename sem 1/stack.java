public class stack {
    private int num[], top, capacity;

    public stack() {
        top = -1;
        setCapacity(5);

    }

    public stack(int capacity) {
        top = -1;
        setCapacity(capacity);
    }

    public void push(int data) {
        if (isFull()) {
            System.err.println("Stack is full");
        } else {
            top++;
            num[top] = data;
            compare();
            System.out.println(top + " " + num[top]);
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.err.println("Stack is empty");
            return -1;
        } else {
            return num[top];
        }
    }

    public void compare() {
        for (int i = 0; i < num.length; i++) {
            for (int j = 1; j < num.length; j++) {
                if (num[i] == num[j] && i != j && num[i] != 0) { // Check if our List of duplicates already has this entry
                    System.out.println("duplicate");
                    System.exit(0); // Add to list of duplicates
                }
            }
        }
    }

    public int pop() {
        int val = 0;
        if (isEmpty()) {
            System.err.println("Stack is empty");
        } else {
            val = num[top];
            top--;
        }
        return val;
    }

    public String display() {
        String hold = " ";
        if (!isEmpty()) {
            for (int i = 0; i <= top; i++) {
                hold += num[i] + " ";
            }
        } else {
            hold = "Stack is empty";
        }
        return hold;
    }

    public void setCapacity(int capacity) {
        if (!isEmpty()) {
            System.err.println("Stack has values at current");
        } else {
            top = -1;
            this.capacity = capacity;
            num = new int[capacity];
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public int top() {
        return top;
    }

    public int atTop() {
        return num[top];
    }

    public int size() {
        return top + 1;

    }

    public boolean isEmpty() {
        return (top <= -1);
    }

    public boolean isFull() {
        return (top >= (capacity - 1));
    }

    public int first() {
        if (isEmpty()) {
            System.err.println("Stack is empty");
            return -1;
        } else {
            return num[0];
        }
    }

}