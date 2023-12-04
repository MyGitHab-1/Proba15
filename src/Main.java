public class Main {
    /*public static void main(String[] args) {   //ПРИМЕР c double; Можно с INT !
        double num1 = 1.2;
        double num2 = 9.8;
        sum(num1, num2);

    }
    public static double sum(double x, double y) {
        double result = x + y;
        System.out.println(result);
        return 0;
    }*/



    /*public static void main(String[] args) {   //РЕТУРН

        System.out.println(sum(1,2));
    }
    public static double sum(double x, double y){
        double result = x + y;
        return result;
    }*/




    /*public static void main(String[] args) {   //РЕТУРН
        double x = sum(1,2);
        System.out.println(x);

    }

    public static double sum(double x, double y) {
        double result = x + y;
        return result;
    }*/




    public static void main(String[] args) {   //Программа: Утро-День-Вечер-Ночь

        System.out.println(day(14));

    }


    public static String day(int time) {
        if (time > 24 || time < 0) return "Error";
        else if (time > 0 && time < 5) return "Ночь";
        else if (time > 5 && time < 11) return "Утро";
        else if (time > 11 && time < 15) return "День";
        else if (time > 15 && time < 19) return "Вечер";
        else if (time > 19) return "Глубокий вечер";
        return "";
    }

}
