public class TapeDeskTest {
    public static void main(String[] args) {
        TapeDesk tape = new TapeDesk();

        tape.canRecord = true;
        tape.playTape();

        if (tape.canRecord == true){
            tape.playTape();
        }

        }
    }