package ru.netology.object;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void shoudAddFilm() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Скрытая угроза");
        manager.addFilm("Война клонов");
        manager.addFilm("Месть ситхов");

        String[] expected = {"Скрытая угроза", "Война клонов", "Месть ситхов"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shoudAddFilm0() {
        FilmManager manager = new FilmManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shoudfindLastFilm5() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Скрытая угроза");
        manager.addFilm("Война клонов");
        manager.addFilm("Месть ситхов");
        manager.addFilm("Новая надежда");
        manager.addFilm("Империя наносит ответный удар");

        String[] expected = {"Империя наносит ответный удар", "Новая надежда", "Месть ситхов", "Война клонов", "Скрытая угроза"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shoudfindLastFilmLess5() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Скрытая угроза");
        manager.addFilm("Война клонов");
        manager.addFilm("Месть ситхов");

        String[] expected = {"Месть ситхов", "Война клонов", "Скрытая угроза"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shoudfindLastFilmLess5on1() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Скрытая угроза");
        manager.addFilm("Война клонов");
        manager.addFilm("Месть ситхов");
        manager.addFilm("Новая надежда");


        String[] expected = {"Новая надежда", "Месть ситхов", "Война клонов", "Скрытая угроза"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shoudfindLastFilmMore5on1() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Скрытая угроза");
        manager.addFilm("Война клонов");
        manager.addFilm("Месть ситхов");
        manager.addFilm("Новая надежда");
        manager.addFilm("Империя наносит ответный удар");
        manager.addFilm("Пробуждение силы");

        String[] expected = {"Пробуждение силы", "Империя наносит ответный удар", "Новая надежда", "Месть ситхов", "Война клонов"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shoudfindLastFilmMore5() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Скрытая угроза");
        manager.addFilm("Война клонов");
        manager.addFilm("Месть ситхов");
        manager.addFilm("Новая надежда");
        manager.addFilm("Империя наносит ответный удар");
        manager.addFilm("Пробуждение силы");
        manager.addFilm("Последние джедаи");

        String[] expected = {"Последние джедаи", "Пробуждение силы", "Империя наносит ответный удар", "Новая надежда", "Месть ситхов"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }


}

