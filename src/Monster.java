abstract public class Monster extends Character {
    public Monster (String name,int damage,int hp,int defence){
        super(name,damage,hp,defence);
    }

    @Override
    public void beAttacked(int damage){
        super.beAttacked(damage);
        if (gethp() <= 0 && getexist() == 1){
            System.out.println(getname() + "被你击杀了。");
            setexist(0);
        }
    }
}
