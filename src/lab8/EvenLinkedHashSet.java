package lab8;

import java.util.LinkedHashSet;

public class EvenLinkedHashSet extends LinkedHashSet<Integer> {
    @Override
    public boolean add(Integer val) {
        if (val % 2 == 0)
            return super.add(val);
        else
            return false;
    }
}
