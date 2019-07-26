package kadicha;

public class Main {

    public static void main(String[] args) {
        String names[] = new String[3];
        names[0] = "Masha";
        names[1] = "Somi";
        names[2] = "Nurai";

        for (String i : names) {

            switch (i) {
                case "Masha":
                    System.out.println("Доброе утро " + "," + i + "!");
                    break;
                case "Somi":
                    System.out.println("Добрый день" + "," + i + "!");
                    break;
                case "Nurai":
                    System.out.println("Добпый вечер " + "," + i + "!");
                    break;
            }
        }
    }
}
