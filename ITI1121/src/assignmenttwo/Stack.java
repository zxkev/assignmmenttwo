package assignmenttwo;

public interface Stack {
	public abstract boolean isEmpty();  
    public abstract Object peek();  
    public abstract Object pop();  
    public abstract void push( Object element );  
    public abstract void clear();
}
