package ru.netology.manager;

import ru.netology.domain.PosterItem;

public class MovieManager {
    private PosterItem[] items = new PosterItem[0];
    private int maxLimit = 10;

    public MovieManager() { // конструктор по умолчанию
    }

    public MovieManager(int maxLimit) { // конструктор для указания максимального лимита отображения
        this.maxLimit = maxLimit;
    }

    public void add(PosterItem item) {
        PosterItem[] tmp = new PosterItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public PosterItem[] findAll() {
        return items;
    }

    public PosterItem[] findLast() {

        int resultLength = items.length;
        if (resultLength > this.maxLimit) {
            resultLength = maxLimit;
        }

        PosterItem[] result = new PosterItem[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}
