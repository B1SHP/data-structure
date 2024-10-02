public enum UseMode {

    TEXT_TO_TEXT(1),
    MORSE_TO_TEXT(2),
    INSERT(3);

    public int key;

    private UseMode(int key) {
        this.key = key;
    }
    
}
