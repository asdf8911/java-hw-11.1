package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterItem;
import ru.netology.manager.MovieManager;

public class MovieManagerTest {
    MovieManager manager = new MovieManager();

    PosterItem one = new PosterItem("Бладшот", "боевик");
    PosterItem two = new PosterItem("Вперёд", "мультфильм");
    PosterItem three = new PosterItem("Отель Белград", "комедия");
    PosterItem four = new PosterItem("Джентельмены", "боевик");
    PosterItem five = new PosterItem("Человек-невидимка", "ужасы");

    @Test
    public void myTest() {
        MovieManager manager = new MovieManager();

        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);

        PosterItem[] actual = manager.findAll();
        PosterItem[] expected = {one, two, three, four, five};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void myTest2() {
        MovieManager manager = new MovieManager();

        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);

        PosterItem[] actual = manager.findLast();
        PosterItem[] expected = {five, four, three, two, one};

        Assertions.assertArrayEquals(expected, actual);
    }


}
