package Examples9;

public class Car <T> implements GenericInterface<T>{
    private T model ;

    @Override
    public T carModel() {
        return model;
    }
}
