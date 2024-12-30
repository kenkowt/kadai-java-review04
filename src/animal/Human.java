package animal;

public class Human extends Animal implements Thinkable{

    //フィールド
    private String hobby;//趣味
    
    //コンストラクタ
    public Human() {
        
    }
    
    //引数ありコンストラクタ
    public Human(String name, int age, String hobby) {
        
        super.setName(name);
        super.setAge(age);
        this.hobby = hobby;
        
    }

    //趣味を発言するメソッド
    @Override
    public void think() {
        System.out.println("私は" + hobby + "について考えています。");
    }
    
    public String getHobby() {
        return hobby;
    }

}
