package stankevich.patterns.behavioral.iterator;

public class Document implements DocumentCollection {
    private int type;
    private String[] params;

    public Document(int type, String[] params) {
        this.type = type;
        this.params = params;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String[] getParams() {
        return params;
    }

    public void setParams(String[] params) {
        this.params = params;
    }

    @Override
    public Iterator getIterator() {
        return new ParamsIterator();
    }

    private class ParamsIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < params.length;
        }

        @Override
        public Object next() {
            return params[index++];
        }
    }
}
