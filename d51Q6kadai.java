//s23021
//

class d51Q6kadai {
    public static void main(String[] args) {
        Item[] li = { 
            new Item("AA", "魚類"), 
            new Item("BB", "肉類"), 
            new Item("CC", "野菜類") 
        };
        Item[] si = { 
            new Item("A1", "さば"), 
            new Item("A2", "さんま"),
            new Item("B1", "牛肉"), 
            new Item("B2", "鶏肉"),
            new Item("B3", "豚肉"),
            new Item("B4", "加工肉"),
            new Item("C1", "人参"),
            new Item("C2", "じゃがいも")
        };
        
        ItemMaster im = new ItemMaster(li, si);
        
        // コードを引数から取得
        String code = args[0];
        String lcode = code.substring(0, 2);
        String scode = code.substring(2, 4);
        String details = code.substring(4);
        
        // 大分類名と小分類名を取得
        String lname = im.getItemName(im.MAJOR, lcode);
        String sname = im.getItemName(im.MINOR, scode);
        
        // 結果を表示
        System.out.println("商品コード：" + code);
        System.out.println("大分類名：" + lname);
        System.out.println("小分類名：" + sname);
        System.out.println("詳細コード：" + details);
    }
}

class Item {
    private String code;
    private String name;
    
    Item(String code, String name) {
        this.code = code;
        this.name = name;
    }
    
    public String getCode() { return code; }
    public String getName() { return name; }
}

class ItemMaster {
    public int MAJOR = 0;
    public int MINOR = 1;
    private Item[][] items;
    
    ItemMaster(Item[] major, Item[] minor) {
        items = new Item[2][];
        items[MAJOR] = major;
        items[MINOR] = minor;
    }
    
    public String getItemName(int codeLevel, String code) {
        for (int i = 0; i < items[codeLevel].length; i++) {
            if (code.equals(items[codeLevel][i].getCode())) {
                return items[codeLevel][i].getName();
            }
        }
        return "(不明)";
    }
}

