import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        fillTenEl(list);
        changeList(list);
        System.out.println(list);
    }

    public static void fillTenEl(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
    }

    public static void changeList(List<Integer> list) {
        list.remove(0);
        list.remove(0);
        list.remove(list.size() - 1);
    }
}
