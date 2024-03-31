public class JavaOperators {

    public static void main(String[] args) {
        int q = 100;
        int w = 5;
        int e = q + w;
        //Арифметические операторы
        System.out.println("### +: " + e);
        e = q - w;
        System.out.println("### -: " + e);
        e = q * w;
        System.out.println("### *: " + e);
        e = q / w;
        System.out.println("### /: " + e);
        e = q % w;
        System.out.println("### %: " + e);

        //Операторы сравнения
        boolean r = q == w;
        System.out.println("### ==: " + r);
        r = q != w;
        System.out.println("### !=: " + r);
        r = q > w;
        System.out.println("### >: " + r);
        r = q < w;
        System.out.println("### <: " + r);
        r = q <= w * 20;
        System.out.println("### <=: " + r);
        r = q >= w;
        System.out.println("### >=: " + r);

        int t = (q >= w * 20)
                ?1
                :0;
        System.out.println("### ter: " + t);

        //Переполнение
        float g = 0.2222229999999F;
        double h = 0.2222229999999;
        System.out.println("float: " + g);
        System.out.println("double: " + h);

        int b = 2147483647;
        System.out.println("Full: " + (b+1));
    }
}
