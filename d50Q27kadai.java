//s23021 
// コマンドラインから与えられた整数を指定する

enum Condition {
    ROAD, MUD, SNOW
}

public class d50Q27kadai {
    public static void main(String[] args) {
        Condition[] conditions = Condition.values();

        for (int i = 0; i < conditions.length; i++) {
            System.out.println("Condition: " + conditions[i]);
        }

        int control = 0;
        if (args.length > 0) {
            try {
                control = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("引数は整数である必要があります。");
                return;
            }
        } else {
            System.out.println("引数が指定されていません。");
            return;
        }

        String mode;
        switch (control) {
            case 1:
                mode = "Warm";
                break;
            case 2:
                mode = "Cool";
                break;
            default:
                mode = "Wind";
                break;
        }
        System.out.print("Mode: " + mode);
    }
}

