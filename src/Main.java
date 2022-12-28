import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Unit a = new Unit();
        Unit b = new Unit();

        System.out.println("[안내] TRPG 스타크래프트 시작합니다.");
        System.out.println("[안내] 자신의 유닛 정보를 입력해 주세요.");
        data(a);
        System.out.println("[안내] 상대 유닛 정보를 입력해 주세요.");
        data(b);

        while(a.hp > 0 && b.hp > 0) {
            b.BeAttacked(a.name, a.power);
            a.BeAttacked(b.name, b.power);
        }
        System.out.println("[안내] 더 이상 공격할 수 없습니다. ");

        if(a.hp < 0) {
            System.out.println("[안내] 자신의 유닛이 제거 되었습니다. ");
        }else {
            System.out.println("[안내] 상대 유닛이 제거되었습니다.");
        }


    }
    public static void data(Unit user) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("[시스템] 유닛 [이름] 을 입력해 주세요 : ");
        user.name = scanner.nextLine();
        System.out.print("[시스템] 유닛 [공격력] 을 입력해 주세요 : (Ex 50) ");
        user.power = scanner.nextInt();
        System.out.print("[시스템] 유닛 [방어력] 을 입력해 주세요 : (EX1) ");
        user.defense = scanner.nextInt();
        System.out.print("[시스템] 유닛 [체력] 을 입력해 주세요 : (EX100) ");
        user.hp = scanner.nextInt();
        System.out.println("");
        System.out.println("[안내] 생성된 유닛 정보는 다음과 같습니다.");
        System.out.printf("[안내] %s 유닛이 게임에 참여하였습니다. \n",user.name);
        System.out.println("[공격력] : " + user.power);
        System.out.println("[방어력] : " + user.defense);
        System.out.println("[체력] : " + user.hp);
        System.out.println("===================================");

    }
}

class Unit {
    public String name;
    public int power;
    public int defense;
    public int hp;

    public void BeAttacked (String user, int power) {
        System.out.printf("[안내] [%s]유닛이 [공격] 하였습니다. \n", user );
        this.hp = this.hp - power;
        System.out.printf("[안내] 상대 유닛의 남은 [체력]은 %d 입니다. \n", this.hp);
        System.out.println("===================================");

    }

}