abstract class Character implements BeAttacked{
    private int damage,hp,defence,exist = 1;
    private String name;
    private BeAttacked attacker;
    public Character(String name,int damage,int hp,int defence){
        this.name = name;
        this.damage = damage;
        this.hp = hp;
        this.defence = defence;
    }
    public String getname(){
        return name;
    }
    public int getdamage(){
        return damage;
    }
    public int gethp(){
        return hp;
    }
    public int getdefence(){
        return defence;
    }
    public int getexist(){
        return exist;
    }
    public void setname(String x){
        name = x;
    }
    public void sethp(int x){
        hp = x;
    }
    public void setdamage(int x){
        damage = x;
    }
    public void setdefence(int x){
        defence = x;
    }
    public void setexist(int x){
        exist = x;
    }
    public void setattacker(BeAttacked attacker){
        this.attacker = attacker;
    }
    public void attack(BeAttacked victim){
        System.out.print(name + "对");
        victim.beAttacked(damage);
    }
    @Override
    public void beAttacked(int damage){
        hp -= damage - defence;
        System.out.println(name + "造成" + (damage - defence) + "点伤害，" + name + "剩余" + hp + "点血量");
        if (hp > 0){
            attack(attacker);
        }else{
            System.out.println(name + "战败被杀。");
        }
    }
}
