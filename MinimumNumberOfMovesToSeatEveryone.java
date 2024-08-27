import java.util.Arrays;

public class MinimumNumberOfMovesToSeatEveryone {
    public static void main(String[] args) {
        int[] seats = { 4, 1, 5, 9 };
        int[] students = { 1, 3, 2, 6 };
        minMovesToSeat(seats, students);
    }

    public static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int ans = 0;
        for (int i = 0; i < seats.length; i++) {
            System.out.println(seats[i] + " " + students[i]);
            ans += Math.abs(seats[i] - students[i]);
            System.out.println(ans);
        }
        return ans;
    }
}
