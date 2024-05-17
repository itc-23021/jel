//s23021
//
class Animal {
    public void makeSound() {
        System.out.println("動物の音");
    }
    
    public void test(){
        System.out.println("テスト出力");
    }
}

//継承したサブクラスDOGの定義
class Dog extends Animal {
    public void makeSound() {
        System.out.println("ワンワン");
    }
}

class Cat extends Animal {
    public void makeSound() {
	 System.out.println("にゃー");
    }
}

public class d48Q2kadai {
        public static void main(String[] args) {
                Animal a = new Dog();
		Animal b = new Cat();
                a.makeSound();//どのような処理になるでしょう
                a.test(); //どのような処理になるでしょう 
      		b.makeSound();
    }
}

