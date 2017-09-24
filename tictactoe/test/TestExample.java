import org.junit.Test;
import static org.junit.Assert.*;

/**
 * An example test class, which merely shows how to write JUnit tests.
 */
public class TestExample {
    @Test
    public void testNewGame() {
        TicTacToe game = new TicTacToe();
        assertEquals (1, game.player);
        assertEquals (9, game.movesLeft);
    }
}
