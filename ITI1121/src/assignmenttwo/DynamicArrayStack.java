package assignmenttwo;

public class DynamicArrayStack implements Stack{
	// Instance variables

    private Object[] elems;  // used to store the elements of this ArrayStack
    private int top;         // designates the first free cell

    // Constructor

    public DynamicArrayStack( int capacity ) {
        elems = new Object[ capacity ];
        top = 0;
    }

    // Returns true if this ArrayStack is empty

    public boolean isEmpty() {
        return top == 0;
    }

    // Returns the top element of this ArrayStack without removing it

    public Object peek() {

        // pre-conditions: ! isEmpty()

        return elems[ top-1 ];
    }

    // Removes and returns the top element of this stack

    public Object pop() {

        // pre-conditions: ! isEmpty()
        
        // decrements top, then access the value
        Object saved = elems[ --top ];

        elems[ top ] = null; // scrub the memory!

        return saved;
    }

    // Puts the element onto the top of this stack.

    public void push( Object element ) {

        // pre-condition: the stack is not full

        // stores the element at position top, then increments top

        elems[ top++ ] = element;
    }
    // Empties the Stack.
    public void clear(){
    	//Runs until the Stack is not Empty.
    	while(!isEmpty()){
    		//Pops the stack.
    		pop();
    	}
    }

}


