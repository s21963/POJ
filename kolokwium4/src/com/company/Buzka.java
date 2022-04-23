package com.company;

import java.util.Objects;

public class Buzka implements PrzedstawiaEmocje, Skalowalny  {

    char c;

    public Buzka(char c) {
        this.c = c;
    }

    @Override
    public boolean czySieUsmiecha() {
        if(c == ')'){
            return true;
        } else return false;
    }

    @Override
    public void przestanSieUsmiechac() {
        this.c = '(';

    }

    public String toString() {
        return ":-" + this.c;
    }

    public void draw() {
        System.out.println(toString());
    }

    @Override
    public void draw(int times) {
        System.out.print(toString());
        if (times > 1)
            System.out.print(")".repeat(times - 1));
        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Buzka buzka = (Buzka) o;
        return c == buzka.c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(c);
    }
}
