package case2;

public class APlayerImpl implements Aplayer {
    @Override
    public void play(String filename) {
        System.out.println("(A) " + filename);
    }

    @Override
    public void stop() {

    }
}
