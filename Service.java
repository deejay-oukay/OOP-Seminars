public interface Service<T1 extends Automat, T2 extends Product> {
    // не вижу необходимости передавать сюда автомат, если метод вызывается из
    // контекста автомата
    public void addProduct2Automat(T1 automat, T2 product);

    // поэтому создал вариант без указания автомата
    public void addProduct2Automat(T2 product);
}
