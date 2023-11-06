 class Guitar extends MusicalInstrument implements Playable{

     public Guitar(String name, String brand, double price) {
         super(name, brand, price);
     }

     @Override
     public void play() {
         System.out.println("Guitar is playing");
     }
 }
