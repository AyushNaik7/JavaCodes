public class HanoiTower {
   

    public static void TowerOFHanoi(int n, String Src, String Helper, String Dest) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + Src + " to " + Dest);
            return;
        }

        TowerOFHanoi(n - 1, Src, Dest, Helper);
        System.out.println("Transfer disk " + n + " from " + Src + " to " + Dest);
        TowerOFHanoi(n - 1, Helper, Src, Dest);
    }

    public static void main(String[] args) {
        int n = 3;
        TowerOFHanoi(n, "S", "H", "D");
    }
}


