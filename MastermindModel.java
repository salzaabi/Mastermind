import java.util.List;

/**
 * The model for playing a game of Mastermind: this maintains the state and enforces rules of
 * gameplay. The mastermind game can be created in various ways. One implementation can use colors
 * while another can use Integer or even Strings. Find the most suitable representation of the game
 * and use that to implement it. You should store the submission of the user to calculate a score.
 *
 * @param <K> the type of game object this model uses.
 *
 * @author Sultan Alzaabi the creator of this interface.
 */
public interface MastermindModel<K> {

  /**
   * This method starts the game of mastermind. The game is designed using the four parameters.
   * <p>
   * A game of mastermind can be of varying lengths, as long as this length is not less than or
   * equal to 0. The game can also have a set number of guesses, or unlimited guesses. A game of
   * mastermind has a resource pool to create the correct sequence. The correct sequence can have
   * duplicates, if duplicates are turned on. The number of allowed guess must be not negative. If
   * duplicates are allowed, the length of the correct sequence must not be greater than the length
   * of available resources.
   * <p>
   * Everytime a new game is started, a random sequence should be created.
   *
   * @param duplicates if {@code false}, {@code length} must not be greater than the length of
   *                   {@code resources}. If {@code true} game objects from {@code resources} can be
   *                   reused.
   * @param length     the length of the correct sequence
   * @param guesses    the amount of guesses allowed
   * @param resources  the game objects to be used to create the correct sequence and to use in
   *                   playing the game.
   * @throws IllegalArgumentException if the resources is null, the length is less than or equal to
   *                                  zero, the number of guesses is non-positive, the length of the
   *                                  correct sequence is greater than the resources available when
   *                                  duplicates are allowed.
   */
  void startGame(boolean duplicates, int length, int guesses, List<K> resources)
      throws IllegalArgumentException;

  /**
   * Executes an insert move, using the specified guess and position. If the position is already
   * filled with an element, change the element.
   *
   * @param pos   the position to add the guess, the sequences should be zero-indexed.
   * @param guess the guess to be added
   * @throws IllegalArgumentException if the position is greater than the length of the correct
   *                                  sequence, if the position less than zero, if the guess is
   *                                  invalid (the guess is of a different type or null).
   * @throws IllegalStateException    if the game has not started yet.
   */
  void insert(int pos, K guess) throws IllegalArgumentException, IllegalStateException;

  /**
   * Executes an insert move, using the specified list of guesses.
   *
   * @param guesses a valid list of guesses.
   * @throws IllegalArgumentException if the guesses are null, if the guesses are not the length of
   *                                  the sequence, if the guesses are empty.
   * @throws IllegalStateException    if the game has not started yet.
   */
  void insert(List<K> guesses) throws IllegalArgumentException, IllegalStateException;

  /**
   * Submits a guess if it is filled.
   *
   * @throws IllegalStateException if the game has not started yet, or if the guess is incomplete.
   */
  void submit() throws IllegalStateException;

  /**
   * Return the number of elements that are in the correct sequence and at the correct spot, or -1
   * to indicate that the user has not submit a guess yet for that round. For example, if the user
   * has guessed 3 times so far, using 0 as the index will give the exacts of first submission.
   *
   * @param round the index at which to check for exacts. Rounds are zero-indexed.
   * @return the number of exacts or -1.
   * @throws IllegalArgumentException if the round is less than 0 or greater than the number of
   *                                  allowed guesses.
   * @throws IllegalStateException    if the game has not started yet.
   */
  int exacts(int round) throws IllegalArgumentException, IllegalStateException;

  /**
   * Returns the number of elements that are in the correct sequence, but the wrong spot, or -1 to
   * indicate that the user has not submit a guess yet for that round.
   *
   * @param round the index at which to check for inexacts. Rounds are zero-indexed.
   * @return the number of inexacts or -1.
   * @throws IllegalArgumentException if the round is less than 0 or greater than the number of
   *                                  allowed guesses.
   * @throws IllegalStateException    if the game has not started yet.
   */
  int inExacts(int round) throws IllegalStateException;

  /**
   * Returns the number of guesses left for the user.
   *
   * @return the number of guesses left
   */
  int getNumGuessesLeft();

  /**
   * Return the sequence at the specified round, zero-indexed. The list could be empty, but must be
   * the size of the allowed guess.
   *
   * @param round the index to check for a sequence.
   * @return the sequence
   * @throws IllegalArgumentException if the round is less that 0 or greater than the number of
   *                                  allowed guesses.
   * @throws IllegalStateException if the game has not started yet.
   */
  List<K> getSequence(int round) throws IllegalStateException, IllegalArgumentException;

  /**
   * Returns the current score of the game. Refers to the number of times the user has guessed. For
   * example, if the user has not guessed yet, it will return 0. If the user has guessed, it will
   * return the number of times the user has guessed.
   *
   * @return the score.
   * @throws IllegalStateException if the game has not started yet.
   */
  int getScore() throws IllegalStateException;

  /**
   * Returns the current resources used to play the game.
   *
   * @return the resources.
   * @throws IllegalStateException if the game has not started yet.
   */
  List<K> getResources() throws IllegalStateException;

  /**
   * Return true if the user has ran out of guesses, or has guessed the correct sequence, false
   * otherwise.
   *
   * @return if the game is over
   * @throws IllegalStateException if the game has not started yet.
   */
  boolean isGameOver() throws IllegalStateException;

}
