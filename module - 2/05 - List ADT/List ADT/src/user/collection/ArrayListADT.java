    package user.collection;

    public class ArrayListADT<E> {
        private E[] obj;
        private int size;
        public ArrayListADT() {
            obj = (E[]) new Object[10];
            this.size = 0;
        }

        public ArrayListADT(int size) {
            obj = (E[]) new Object[size];
            this.size = 0;
        }

        public boolean add(E e) {
            if (size == obj.length) {
                return false;
            } else {
                obj[size] = e;
                size += 1;
                return true;
            }
        }

        public boolean add(int index, E e) {
            if (size == obj.length) {
                return false;
            } else {
                System.arraycopy(obj, index, obj, index + 1, size - index);
                obj[index] = e;
                size += 1;
                return true;
            }
        }

        public E remove() {
            if (size == 0) {
                throw new ArrayIndexOutOfBoundsException();
            } else {
                E removed = obj[size - 1];
                obj[--size] = null;
                return removed;
            }
        }

        public E remove(int i) {
            if (size == 0) {
                throw new ArrayIndexOutOfBoundsException();
            }
            E removed = obj[i];
            for (int j = i + 1; j < size; j++) {
                obj[j - 1] = obj[j];
            }
            obj[size - 1] = null;
            size -= 1;
            return removed;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        public void display() {
            if (size == 0 ) {
                System.out.println("List is empty");
            } else {
                System.out.print("[ ");
                for (int i = 0; i < size - 1; i++) {
                    System.out.print(obj[i] + ", ");
                }
                System.out.println(obj[size - 1] + " ]");
            }
        }

        public E getFirst() {
            if (size == 0) {
                throw new ArrayIndexOutOfBoundsException();
            } else {
                return obj[0];
            }
        }

        public E getLast() {
            if (size == 0) {
                throw new ArrayIndexOutOfBoundsException();
            } else {
                return obj[size - 1];
            }
        }

        public void clear() {
            for (int i = 0; i < size; i++) {
                obj[i] = null;
            }
            size = 0;
        }


        public String getSimpleClassName() {
            return "UserDefined: ListADT";
        }

        public <T> T[] toArray() {
            @SuppressWarnings("unchecked")
            T[] array = (T[]) new Object[size];
            if (size > 0) {
                System.arraycopy(obj, 0, array, 0, size);
            }
            return array;
        }


        public boolean contains(Object o) {
            for (int i = 0; i < size; i++) {
                if (obj[i].equals(o)) {
                    return true;
                }
            }
            return false;
        }

    }
