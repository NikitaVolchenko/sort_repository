package main;

class Pair implements Comparable<Pair>
{
    public final String first;       // первое поле пары
    public final Integer second;      // второе поле пары

    // Создает новую пару с указанными значениями
    private Pair(String first, Integer second) {
        this.first = first;
        this.second = second;
    }

    @Override
    // Вычисляет хеш-код для объекта для поддержки хеш-таблиц
    public int hashCode()
    {
        // используем хеш-коды базовых объектов
        return 31 * first.hashCode() + second.hashCode();
    }

    @Override
    public java.lang.String toString() {
        return "(" + first + ", " + second + ")";
    }


    @Override
    public int compareTo(Pair o) {
        return second.compareTo(o.second);
    }
}
