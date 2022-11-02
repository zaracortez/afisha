package ru.netology.afisha;

public class Manager {

    private String[] movies = new String[0];
    private int limit;

    public Manager() {
        limit = 10;
    }

    public Manager(int limit) {
        this.limit = limit;
    }

    public void add(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];

        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultSize;
        if (limit < movies.length) {
            resultSize = limit;
        } else {
            resultSize = movies.length;
        }
        String[] result = new String[resultSize];
        for (int i = 0; i < resultSize; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;

    }
}