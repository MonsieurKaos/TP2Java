import fr.morin.jeucarte.CarteAJouer;

public class Main {
    public static void main(String[] args) {
        CarteAJouer Carte1 = new CarteAJouer("Pique", "DIX");
        CarteAJouer Carte2 = new CarteAJouer("Coeur", "Roi");
        CarteAJouer Carte3 = new CarteAJouer("Carreau", "Dame");
        Carte1.toString();
        Carte2.toString();
        Carte3.toString();

        String s1 = "Toto";
        String s2 = "Toto";
        String s3 = new String("Toto");

        if (s1 == s2){
            System.out.println("C'est la meme chose");
        } else {
            System.out.println("C'est pas la meme chose");
        }

        if (s1 == s3){
            System.out.println("C'est la meme chose");
        } else {
            System.out.println("C'est pas la meme chose");
        }

        if (s1.equals(s3)){
            System.out.println("C'est la meme chose");
        } else {
            System.out.println("C'est pas la meme chose");
        }

    }
}