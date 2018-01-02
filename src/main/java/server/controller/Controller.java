package server.controller;

import server.game.HangmanGame;

/**
 * Controller for the server.
 */
public class Controller {
  private HangmanGame game;

  /**
   * @see HangmanGame#Constructor()
   */
  public void newHangmanGame() {
    game = new HangmanGame();
  }

  /**
   * @see HangmanGame#newGameInstance()
   */
  public void startNewGameInstance() {
    game.newGameInstance();
  }

  /**
   * @see HangmanGame#guess(String)
   */
  public String guess(String guess) {
    return game.guess(guess);
  }
}
