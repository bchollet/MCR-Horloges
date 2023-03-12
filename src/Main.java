import ui.ProgramUI;

public class Main {
    public static void main(String[] args) {
        int param;

        try {
            param = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Veuillez entrer un entier en paramètre");
        }

        if (args.length != 1 || param < 1 || param > 9) {
            throw new RuntimeException("Veuillez indiquer en paramètre un entier entre 1 et 9");
        }

        new ProgramUI(param);
    }
}
