package HW_4;

public class Schitalochka {


    private String o;
    private String d;
    private String t;
    private String c;
    private String p;
    private String text;

    public Schitalochka(String o, String d, String t, String c, String p, String text) {
        this.o = o;
        this.d = d;
        this.t = t;
        this.c = c;
        this.p = p;
        this.text = text;
    }

    public String getO() {
        return o;
    }

    public String getD() {
        return d;
    }

    public String getT() {
        return t;
    }

    public String getC() {
        return c;
    }

    public String getP() {
        return p;
    }

    public String getText() {
        return text;
    }

    public void printOut(){
        System.out.println(o + d + t + c + p + text);
    }

}
