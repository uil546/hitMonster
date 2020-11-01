import java.util.Scanner;

public class hitMonster {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        int f = 0;

        Player player = new Player();
        System.out.println("请输入你在游戏中的名字：");
        player.setname(input.next());

        System.out.println("你是一位勇者，拥有强悍的体魄，身穿皮甲，手持青铜剑。");
        System.out.println("你的血量：" + player.gethp() + "；你的防御力：" + player.getdefence() + "；你的攻击力：" + player.getdamage());
        System.out.println("你将进入黑暗的洞穴，斩杀食人的怪物。");
        System.out.println("全国最好的医师给了你一瓶疗伤神药，请善用它。");
        int[] treatNumber = new int[1];
        treatNumber[0] = 0;

        System.out.println("在洞口，你遭遇了一只初等怪物。");
        Monster1 monster1 = new Monster1();
        System.out.println("你拔出剑，准备战斗。");
        monster1.setattacker(player);
        player.setattacker(monster1);
        player.attack(monster1);
        System.out.println("恭喜你，这是你冒险生涯中击杀的第一只怪物！");
        System.out.println("村民看到了你的壮举，不仅为你欢呼，他们愿意为你提供一些帮助。");
        System.out.println("1.回复20点血量；2.升级武器（攻击+10）；3.升级护甲（防御+10） （输入数字以选择）");
        do{
            falsemessage_(f);
            select = input.nextInt();
            if (select == 1){
                player.sethp(player.gethp() + 20);
                System.out.println("你的血量回复，你现在的血量是：" + player.gethp());
            }else if (select ==2){
                player.setdamage(player.getdamage() + 10);
                System.out.println("你的武器升级，你现在的攻击力是：" + player.getdamage());
            }else if (select ==3){
                player.setdefence(player.getdefence() + 10);
                System.out.println("你的护甲升级，你现在的防御力是：" + player.getdefence());
            }
            f++;
        }while (select < 1 || select >3);
        f = 0;
        player.treat(treatNumber);
        System.out.println("你大步踏入洞穴，眼睛刚刚适应黑暗，就遭到了不明生物的突袭！");
        Monster2 monster2 = new Monster2();
        player.setattacker(monster2);
        monster2.setattacker(player);
        monster2.attack(player);
        System.out.println("那只生物倒下后，你才认出那是一只巨型螳螂。");
        player.treat(treatNumber);
        System.out.println("你又往前走了几步，捡到一把开山斧。");
        player.setdamage(player.getdamage() + 60);
        System.out.println("你的攻击力提升60，现在为" + player.getdamage());
        System.out.println("你继续前行，砍开挡路的碎石，便看到一个大厅，里面站着一只巨石怪。");
        System.out.println("巨石怪生命力顽强，力量巨大，所幸它的速度并不快。");
        System.out.println("你拔剑准备战斗。");
        Monster3 monster3 = new Monster3();
        player.setattacker(monster3);
        monster3.setattacker(player);
        player.attack(monster3);
        player.treat(treatNumber);
        System.out.println("你环顾四周，发现角落有一个箱子，打开一看，里面有一套精制锁子甲，也不知道是谁扔在这的。");
        player.setdefence(player.getdefence() + 60);
        System.out.println("你的防御力提升60点，现在为" + player.getdefence());
        System.out.println("你沿着甬道继续前行，看到前面有微弱的光。");
        System.out.println("你走过去，发现一个死灵门卫正在守门。");
        System.out.println("他剑术高超，把你打了个措手不及。");
        System.out.println("……");
        System.out.println("由于时间原因，这款游戏还未开发完，开发者还会继续更新（或者断更），敬请期待完整版的到来。");
    }
    public static void falsemessage_(int f){
        if (f != 0){
            System.out.println("输入非法，请重新输入：");
        }
    }
}
