package basicJavaSyntax;
/*
Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a.
 */
public class Step22_3 {
    public static void main(String[] args) {
        System.out.println(charExpression(32));
    }
    public static char charExpression(int a) {
        return (char)('\\' + a);
    }
}
