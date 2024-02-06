package ru.netology;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Post post = new Post();
        post.name = "Ivan";
        post.phone = "+7-(909)-987-78-56";
        post.passport = "4444 №44444444";
        post.patronymic = "Ivanivich";
        post.surname = "Ivanov";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;

    }
}