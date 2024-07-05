class Q5 {
    public static void main(String[] args) {
        int [] num = new int[args.length];

        try {
            for (int i = 0; i < args.length; i++) {
                num[i] = Integer.parseInt(args[i]);  // 構文エラーを修正
            }

            int tmp;
            for (int i = 1 ; i < num.length; i++) {
                for (int j = i - 1; j >= 0 && num[j] > num[j + 1]; j--) {
                    tmp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = tmp;
                }
            }

            for (int val : num) {
                System.out.print(val + " ");
            }
        } catch (NumberFormatException e) {
            System.out.println("有効な整数入力を提供してください。");
        }
    }
}

