package animal;

public class Animal {
    // フィールド
    private String name;// 名前
    private int age;// 年齢
    
    //コンストラクタ
    public Animal() {
    }
    
    //引数ありコンストラクタ
    public Animal(String name, int age) {
        
        this.setName(name);
        this.setAge(age);
        
    }
    
    //名前と年齢を発言するメソッド
    public void say() {
        
        System.out.println(name + "です。" + age + "歳です。");
    
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
