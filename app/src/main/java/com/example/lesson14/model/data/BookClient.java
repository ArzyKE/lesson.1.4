package com.example.lesson14.model.data;

import com.example.lesson14.model.BookModel;
import com.example.lesson14.model.BookModel;

import java.util.ArrayList;

public class BookClient {
    public static ArrayList<BookModel> list = new ArrayList<>();

    public static ArrayList<BookModel> getBook() {
        list.add(new BookModel("Apзымат", ""));
        list.add(new BookModel("Кара-Балта", ""));
        list.add(new BookModel("Кыргызстан", ""));
        list.add(new BookModel("ММА", ""));
        list.add(new BookModel("Бокс", ""));
        list.add(new BookModel("Джиу-Житцу", ""));
        list.add(new BookModel("Борьба", ""));
        list.add(new BookModel("Каратэ", ""));
        list.add(new BookModel("Самбо", ""));
        list.add(new BookModel("Дзюдо", ""));
        list.add(new BookModel("Грепплинг", ""));
        list.add(new BookModel("ГикТек", ""));
        list.add(new BookModel("Школа", ""));
        list.add(new BookModel("Библиотека", ""));
        list.add(new BookModel("Учебник", ""));
        list.add(new BookModel("Тетрадь", ""));
        list.add(new BookModel("Музыка", ""));
        list.add(new BookModel("Инстаграмм", ""));
        list.add(new BookModel("Ватсап", ""));

        return list;
    }
}