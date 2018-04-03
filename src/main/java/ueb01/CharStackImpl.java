package ueb01;

import java.util.NoSuchElementException;

class CharStackImpl implements CharStack {
    private Element first = null;

    @Override
    public void push(char c) {
        Element neu = new Element(c, first);
        first = neu;
    }

    @Override
    public char pop() throws NoSuchElementException {
        Element it = first;
        if (it == null) {
            throw new NoSuchElementException();
        }
        it.back = first;
        return first.value;
    }

    @Override
    public int size() {
        Element it = first;
        int len = 0;
            while (it != null) {
                it = it.back;
                len++;
            }
            return len;
        }
    }

