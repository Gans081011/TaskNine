public class TaskNine {
    public static void main(String[] args) {
        Book bookOne = new Book("Забвение", 1837, new Author("Алексей", "Морошкин"));
        Book bookTwo = new Book("Восхождение", 1957, new Author("Алекс", "Морган"));
        System.out.println(bookOne.toString());
        System.out.println(bookTwo.toString());
        bookOne.setYearPublication(1844);
        System.out.println("Измененная дата публикации " + bookOne.getYearPublication());
        if (bookOne.equals(bookOne)&&bookOne.hashCode()==bookOne.hashCode()){
            System.out.println("объекты точно равны");

        }else if (bookOne.hashCode()!=bookTwo.hashCode()){
            System.out.println("объекты разные");

        }
        }
    }

