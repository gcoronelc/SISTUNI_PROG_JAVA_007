package appdemo01;

public class Test04 {

    public static void main(String[] args) {
        // switch
        double x = 10;
        double y = 3;
        double res = 0;
        char op = '/';
        switch (op) {
            case '+':
                res = x + y;
                break;
            case '-':
                res = x - y;
                break;
            case 'x':
                res = x * y;
                break;
            case '/':
                res = x / y;
                break;
        }
        System.out.println("Resultado es :" + res);
    }

}
