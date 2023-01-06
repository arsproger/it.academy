package subject.regexp;

public class Task1 {
    public static void main(String[] args) {
        /*
        //d - одна цифра
        //w - одна английская буква
        //w = [a-zA-Z]

        + - 1 или более
        * - 0 или более
        ? - 0 или 1 символов до

        (x|y|z) - одна строка из множества строк

        [abc] = (a|b|c)
        [a-zA-Z] все английские буквы
        [0-9] = //d
        [^abc] - мы хотим все символы кроме [abc]

        . - любой символ

        {2} - 2 символа до (//d{2})
        {2,} - 2 или более символа (//d{2,})
        {2, 4} - от 2 до 4 символа (//d{2,4})

         */

        String a = "-13478458347";
        String b = "13478458347";
        String c = "+13478458347";

        System.out.println(a.matches("(-|\\+)?\\d*"));
        System.out.println(b.matches("(-|\\+)?\\d*"));
        System.out.println(c.matches("(-|\\+)?\\d*"));

        String d = "57jka55dffk77sfj5fkas654782548";
        System.out.println(d.matches("[a-zA-Z57]+\\d+"));

        String e = "helloc";
        System.out.println(e.matches("[^abc]*"));

        String url1 = "http://www.google.com";
        String url2 = "http://www.yandex.ru";
        String url3 = "http://www.yandex.ua";
        System.out.println(url1.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(url2.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(url3.matches("http://www\\..+\\.(com|ru)"));

        String f = "1234567";
        System.out.println(f.matches("\\d{2,}"));
    }
}
