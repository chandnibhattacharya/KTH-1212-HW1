package common;

/**
 * Defines different message types.
 */
public enum MsgType {
  /**
   * Starts a new game.
   */
  START,
  /**
   * The server response of a hangman guess.
   */
  GUESS_RESPONSE,
  /**
   * A client guess of a hangman word.
   */
  GUESS,
  /**
   * The client is about to disconnect.
   */
  DISCONNECT
}
