package io.smallrye.mutiny.tuples;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

public class Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9> extends Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> implements Tuple {

    final T9 item9;

    Tuple9(T1 a, T2 b, T3 c, T4 d, T5 e, T6 f, T7 g, T8 h, T9 i) {
        super(a, b, c, d, e, f, g, h);
        this.item9 = i;
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9> of(T1 a, T2 b, T3 c, T4 d,
            T5 e, T6 f, T7 g, T8 h, T9 i) {
        return new Tuple9<>(a, b, c, d, e, f, g, h, i);
    }

    public T9 getItem9() {
        return item9;
    }

    @Override
    public <T> Tuple9<T, T2, T3, T4, T5, T6, T7, T8, T9> mapItem1(Function<T1, T> mapper) {
        return Tuple9.of(mapper.apply(item1), item2, item3, item4, item5, item6, item7, item8, item9);
    }

    @Override
    public <T> Tuple9<T1, T, T3, T4, T5, T6, T7, T8, T9> mapItem2(Function<T2, T> mapper) {
        return Tuple9.of(item1, mapper.apply(item2), item3, item4, item5, item6, item7, item8, item9);
    }

    @Override
    public <T> Tuple9<T1, T2, T, T4, T5, T6, T7, T8, T9> mapItem3(Function<T3, T> mapper) {
        return Tuple9.of(item1, item2, mapper.apply(item3), item4, item5, item6, item7, item8, item9);
    }

    @Override
    public <T> Tuple9<T1, T2, T3, T, T5, T6, T7, T8, T9> mapItem4(Function<T4, T> mapper) {
        return Tuple9.of(item1, item2, item3, mapper.apply(item4), item5, item6, item7, item8, item9);
    }

    @Override
    public <T> Tuple9<T1, T2, T3, T4, T, T6, T7, T8, T9> mapItem5(Function<T5, T> mapper) {
        return Tuple9.of(item1, item2, item3, item4, mapper.apply(item5), item6, item7, item8, item9);
    }

    @Override
    public <T> Tuple9<T1, T2, T3, T4, T5, T, T7, T8, T9> mapItem6(Function<T6, T> mapper) {
        return Tuple9.of(item1, item2, item3, item4, item5, mapper.apply(item6), item7, item8, item9);
    }

    @Override
    public <T> Tuple9<T1, T2, T3, T4, T5, T6, T, T8, T9> mapItem7(Function<T7, T> mapper) {
        return Tuple9.of(item1, item2, item3, item4, item5, item6, mapper.apply(item7), item8, item9);
    }

    @Override
    public <T> Tuple9<T1, T2, T3, T4, T5, T6, T7, T, T9> mapItem8(Function<T8, T> mapper) {
        return Tuple9.of(item1, item2, item3, item4, item5, item6, item7, mapper.apply(item8), item9);
    }

    public <T> Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T> mapItem9(Function<T9, T> mapper) {
        return Tuple9.of(item1, item2, item3, item4, item5, item6, item7, item8, mapper.apply(item9));
    }

    @Override
    public Object nth(int index) {
        assertIndexInBounds(index);

        switch (index) {
            case 0:
                return item1;
            case 1:
                return item2;
            case 2:
                return item3;
            case 3:
                return item4;
            case 4:
                return item5;
            case 5:
                return item6;
            case 6:
                return item7;
            case 7:
                return item8;
            case 8:
                return item9;
            default:
                throw new IllegalArgumentException("invalid index " + index);
        }
    }

    @Override
    public List<Object> asList() {
        return Arrays.asList(item1, item2, item3, item4, item5, item6, item7, item8, item9);
    }

    @Override
    public int size() {
        return 9;
    }

    @Override
    public String toString() {
        return "Tuple{" +
                "item1=" + item1 +
                ",item2=" + item2 +
                ",item3=" + item3 +
                ",item4=" + item4 +
                ",item5=" + item5 +
                ",item6=" + item6 +
                ",item7=" + item7 +
                ",item8=" + item8 +
                ",item9=" + item9 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Tuple9<?, ?, ?, ?, ?, ?, ?, ?, ?> tuple = (Tuple9<?, ?, ?, ?, ?, ?, ?, ?, ?>) o;
        return Objects.equals(item9, tuple.item9);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), item9);
    }
}
