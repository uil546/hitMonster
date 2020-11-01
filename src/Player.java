import java.util.Scanner;
import static java.lang.System.exit;

class Player extends Character{
    public Player() {
        super("",60, 120, 20);
    }

    @Override
    public void beAttacked(int damage) {
        super.beAttacked(damage);
        if (gethp() <= 0 && getexist() == 1){
            System.out.println("你倒下了，没能除掉食人的怪物……");
            setexist(0);
            exit(0);
        }else{
            System.out.println("你剩余的血量为：" + gethp());
        }
    }
    public void treat(int[] t){
        if (t[0] == 0){
            System.out.println("你是否要使用疗伤神药？");
            System.out.println("1.是；2.否 （输入数字以选择）");
            int x,f = 0;
            do{
                hitMonster.falsemessage_(f);
                Scanner input = new Scanner(System.in);
                x = input.nextInt();
                if (x == 1){
                    sethp(120);
                    t[0]++;
                    System.out.println("你的血量回满了！");
                    System.out.println("你现在的血量是：" + gethp());
                }
                f++;
            }while (x != 1 && x != 2);
        }
    }
}
