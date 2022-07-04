public class TaskNine {

    public static void main(String[] args) {
        Book bookOne = new Book("Забвение", 1837,new Author("Алексей","Морошкин"));
        Book bookTwo = new Book("Восхождение", 1957,new Author("Алекс","Морган"));
        System.out.println("bookOne.nameBook = " + bookOne.getNameBook() + " " + bookOne.getYearPublication()+" "+ bookOne.getAuthor().getFirstName()+" "+bookOne.getAuthor().getLastName());
        bookOne.setYearPublication(1844);
        System.out.println("bookTwo.nameBook = " + bookTwo.getNameBook()+" "+bookTwo.getYearPublication()+" "+bookTwo.getAuthor().getFirstName()+" "+bookTwo.getAuthor().getLastName());
        System.out.println("bookOne.getYearPublication() = " + bookOne.getYearPublication());
    }
}
