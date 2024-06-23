package LeetCode.Medium.Pr341;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NestedIterator implements Iterator<Integer> {
    private List<Integer> list;
    private int index;

    public NestedIterator(List<NestedInteger> nestedList) {
        list = new ArrayList<>();
        index = 0;
        flatten(nestedList);
    }

    public void flatten(List<NestedInteger> nestedList) {
        for (NestedInteger ni : nestedList) {
            if (ni.isInteger()) {
                list.add(ni.getInteger());
            } else {
                flatten(ni.getList());
            }
        }
    }
    @Override
    public Integer next() {
        if (hasNext()) {
            return list.get(index++);
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }
}

