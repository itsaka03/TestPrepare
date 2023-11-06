
public class Main {
    public static void main(String[] args) {
        try {
            Guitar g = new Guitar("g", "s", 20.22);
            MusicShop ms = new MusicShop();
            Drum d = new Drum("d", "u", 25.33);
            Piano p = new Piano("p", "k", 30.78);

            ms.demo(g);
            ms.demo(p);
            ms.demo(d);

        }catch(NotPlayableException e){
            System.out.println(e.getMessage());
        }
        }
    }
