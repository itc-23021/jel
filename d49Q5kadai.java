// 23021
// 基数を3つに対応したプログラム
class Q5 {
    public static void main(String[] args) {
        int limit = Integer.parseInt(args[0]);
        int base1 = Integer.parseInt(args[1]);
        int base2 = Integer.parseInt(args[2]);
        int base3 = Integer.parseInt(args[3]);

        int common12 = base1 * base2;
        int common13 = base1 * base3;
        int common23 = base2 * base3;
        int common123 = base1 * base2 * base3;

        for(int i = 1; i <= limit; i++) {
            if (i % common123 == 0) {
                System.out.println(i + ":base1,base2,base3");
                continue;
            }
            if (i % common12 == 0) {
                System.out.println(i + ":base1,base2");
                continue;
            }
            if (i % common13 == 0) {
                System.out.println(i + ":base1,base3");
                continue;
            }
            if (i % common23 == 0) {
                System.out.println(i + ":base2,base3");
                continue;
            }
            if(i % base1 == 0) {
                System.out.println(i + ":base1");
                continue;
            }
            if(i % base2 == 0) {
                System.out.println(i + ":base2");
                continue;
            }
            if(i % base3 == 0) {
                System.out.println(i + ":base3");
                continue;
            }
            System.out.println(i);
        }
    }
}

