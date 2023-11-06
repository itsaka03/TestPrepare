class MusicShop {
    public void demo(MusicalInstrument instrument){
        if(instrument instanceof Playable){
            ((Playable) instrument).play();
        }else {
            throw new NotPlayableException("This instrument cant be played!");
        }
    }
}
