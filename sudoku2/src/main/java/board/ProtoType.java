package board;

public class ProtoType<T> implements Cloneable{
    @Override
    protected T clone() throws CloneNotSupportedException {
        return (T)super.clone();
    }
}
