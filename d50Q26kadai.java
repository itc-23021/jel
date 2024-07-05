// s23021
// 列挙型の課題
enum Condition {
    ROAD, MUD, SNOW
}

class Q26 {
    public static void main(String[] args) {
        Condition[] conditions = Condition.values();

        for (int i = 0; i < conditions.length; i++) {
            System.out.println("Condition: " + conditions[i]);
        }
    }
}

