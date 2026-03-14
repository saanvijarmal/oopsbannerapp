public class BannerUC6 {

    // Helper method for O pattern
    public static String[] buildO() {
        return new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        };
    }

    // Helper method for P pattern
    public static String[] buildP() {
        return new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        };
    }

    // Helper method for S pattern
    public static String[] buildS() {
        return new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        };
    }

    public static void main(String[] args) {

        // Call helper methods
        String[] O = buildO();
        String[] P = buildP();
        String[] S = buildS();

        // Banner lines created during array initialization
        String[] banner = {
                String.join("  ", O[0], O[0], P[0], S[0]),
                String.join("  ", O[1], O[1], P[1], S[1]),
                String.join("  ", O[2], O[2], P[2], S[2]),
                String.join("  ", O[3], O[3], P[3], S[3]),
                String.join("  ", O[4], O[4], P[4], S[4]),
                String.join("  ", O[5], O[5], P[5], S[5]),
                String.join("  ", O[6], O[6], P[6], S[6])
        };

        // Print banner using enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}