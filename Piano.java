public class Piano extends MusicalInstrument implements Playable{
    public Piano(String name,String brand, double price) {
    super(name, brand, price);
    }
    public void play(){
        System.out.println("Piano is playing.");
    }

}
