package ueb01;

class CharStackImpl implements CharStack {
    private Element first = null;

    @Override
    public void push(char c) {
        Element neu = new Element(c, first);
        first = neu;
    }

    @Override
    public char pop() {
        Element it = first;
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

