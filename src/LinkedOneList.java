public class LinkedOneList<T> {
    public static class ListElement<T> {
        private final T data;
        private ListElement<T> next;

        public ListElement(T data, ListElement<T> next) {
            this.data = data;
            this.next = next;
        }

        public ListElement(T data) {
            this.data = data;
            this.next = null;
        }

        public T getData() {
            return data;
        }

    }

    private ListElement<T> head;

    public void addToHead(T data) {
        this.head = new ListElement<>(data, head);
    }

    public void addToTail(T data) {
        if (head == null) {
            head = new ListElement<>(data);
            return;
        }

        ListElement<T> iterator = head;
        while (iterator.next != null) {
            iterator = iterator.next;
        }
        iterator.next = new ListElement<>(data);
    }

    public T get(int index) throws IndexOutOfBoundsException {
        ListElement<T> iterator = head;
        int i = 0;
        while (i < index && iterator != null) {
            iterator = iterator.next;
            i++;
        }
        if (iterator != null)
            return iterator.data;
        else if(index == i){
            return  null;
        }
        throw new IndexOutOfBoundsException();
    }

    public void deleteByValue(T data) {
        if (data == null)
            throw new IllegalArgumentException();

        boolean removed = false;
        //найти значение и удалить
        for (ListElement<T> x = head, prev = null; x != null; prev = x, x = x.next) {
            if (x.getData() != null && data.equals(x.getData())) {
                removed = true;
                ListElement<T> nextAfter = x.next;
                if (prev != null)
                    prev.next = nextAfter;
                else
                    head = nextAfter;
            }
        }
        if (!removed)
            throw new IllegalArgumentException();

    }

    public void deleteByIndex(int index) {
        boolean removed = false;
        int i = 0;
        //найти значение и удалить
        for (ListElement<T> x = head, prev = null; x != null; prev = x, x = x.next, i++) {
            if (i == index) {
                removed = true;
                ListElement<T> nextAfter = x.next;
                if (prev != null)
                    prev.next = nextAfter;
                else
                    head = nextAfter;
            }
        }
        if (!removed) //i<index
            throw new IndexOutOfBoundsException();
    }

    public boolean isEmpty() {
        return head == null;
    }
}
