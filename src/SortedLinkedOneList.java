public class SortedLinkedOneList <T>{
    public static class Element<T> {
        private T data;
        private Element next;

        public Element(T data, Element<T> next) {
            this.data = data;
            this.next = next;
        }

        public Element(T data) {
            this.data = data;
            this.next = null;
        }
        public Element getNext(){
            return this.next;
        }
        public T getData(){
            return this.data;
        }
    }
    private Element <T> head;
    public Boolean isEmpty(){
        return head == null;
    }
    public void addElement (T data) {
        Element<T> Element;
        if(isEmpty()){
            head = new Element<>(data);
            return;
        }
        if(data.hashCode() < head.data.hashCode()) {
            Element = head;
            head = new Element<>(data,Element);
            return;
        }
        if (head.next == null) {
            if (data.hashCode() > head.data.hashCode()) {
                head.next = new Element<>(data);
            } else if(data.hashCode() > head.data.hashCode()){
                Element = head;
                head = new Element<>(data, Element);
            }
        } else {
            Element<T> currentElement = head;
            while (currentElement.next != null && data.hashCode() >= currentElement.next.data.hashCode()) {
                currentElement = currentElement.next;
            }
            if(!currentElement.data.equals(data)) {
                Element<T> nextElement = currentElement.next;
                currentElement.next = new Element<T>(data, nextElement);
            }
        }
    }

    public Element getHead(){
        return this.head;
    }

    @Override
    public String toString() {
        Element currentElement = head;
        StringBuilder str = new StringBuilder(head.getData() + " ");
        while(currentElement.next != null) {
            str.append(currentElement.next.getData()).append(" ");
            currentElement = currentElement.next;
        }
        return str.toString();
    }
}
