package ru.package1;

public class Class1 {
    private int fg;

    String a;
    String b;
    String c;
    String d;

    public int getFg() {
        return fg;
    }

    public void setFg(int fg) {
        this.fg = fg;
    }

    Class1 (String b, String c) {

        this.b = b;
        this.c = c;

    }

    Class1 (String a, String b, String c, String d) {

        this(b,c); //!!!! Obraschayetsya k predidyshemy konstructory
        this.a = a;
        this.d = d;

    }
}
