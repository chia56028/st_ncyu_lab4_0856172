import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


class GameTest {
    Game game = new Game();

    public static Stream<Arguments> allPlayer1WinCase() {
        return Stream.of(
                Arguments.of("rock", "scissors"),
                Arguments.of("paper", "rock"),
                Arguments.of("scissors", "paper")
        );
    }

    @ParameterizedTest
    @MethodSource("allPlayer1WinCase")
    public void allPlayer1WinCaseTests(String player1, String player2){
        assertEquals("Player 1 win!", game.judge(player1, player2));
    }

    public static Stream<Arguments> allPlayer2WinCase() {
        return Stream.of(
                Arguments.of("rock", "paper"),
                Arguments.of("paper", "scissors"),
                Arguments.of("scissors", "rock")
        );
    }

    @ParameterizedTest
    @MethodSource("allPlayer2WinCase")
    public void allPlayer2WinCaseTests(String player1, String player2){
        assertEquals("Player 2 win!", game.judge(player1, player2));
    }

    public static Stream<Arguments> allPlayer1LoseCase() {
        return Stream.of(
                Arguments.of("rock", "paper"),
                Arguments.of("paper", "scissors"),
                Arguments.of("scissors", "rock")
        );
    }

    @ParameterizedTest
    @MethodSource("allPlayer1LoseCase")
    public void allPlayer1LoseCaseTests(String player1, String player2){
        assertEquals("Player 2 win!", game.judge(player1, player2));
    }

    public static Stream<Arguments> allPlayer2LoseCase() {
        return Stream.of(
                Arguments.of("rock", "scissors"),
                Arguments.of("paper", "rock"),
                Arguments.of("scissors", "paper")
        );
    }

    @ParameterizedTest
    @MethodSource("allPlayer2LoseCase")
    public void allPlayer2LoseCaseTests(String player1, String player2){
        assertEquals("Player 1 win!", game.judge(player1, player2));
    }

    public static Stream<Arguments> allDrawCase() {
        return Stream.of(
                Arguments.of("rock", "rock"),
                Arguments.of("paper", "paper"),
                Arguments.of("scissors", "scissors")
        );
    }

    @ParameterizedTest
    @MethodSource("allDrawCase")
    public void allDrawCaseTests(String player1, String player2){
        assertEquals("Draw!", game.judge(player1, player2));
    }

    public static Stream<Arguments> allValidInput(){
        return Stream.of(
                Arguments.of("rock"),
                Arguments.of("paper"),
                Arguments.of("scissors")
        );
    }

    @ParameterizedTest
    @MethodSource("allValidInput")
    public void allValidInputTests(String choice){
        assertDoesNotThrow(()->{
            game.validation(choice);
        });
    }

    public static Stream<Arguments> someInvalidInput(){
        return Stream.of(
                Arguments.of("Rock"),
                Arguments.of("peper"),
                Arguments.of("scisors")
        );
    }

    @ParameterizedTest
    @MethodSource("someInvalidInput")
    public void someInvalidInputTests(String choice){
        assertThrows(IllegalArgumentException.class, ()->{
            game.validation(choice);
        });
    }
}