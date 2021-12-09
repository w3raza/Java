class BoxGeneric<T> {
    T obj;
    BoxGeneric(T x) { obj = x; }
    T get() { return obj; }
    String objType() { return obj.getClass().getName(); }
    }
    