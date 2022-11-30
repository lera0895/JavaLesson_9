public class Main {
    public static void main(String[] args)
    {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (926)- 820-54-55";
        post.surname = "Иванов";
        post.subscription = true;


        post.birthday = new FormDate();

        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;
    }
}