# Mastermind
 This is an interface designed for a Mastermind type game. The idea of this game is to submit guesses to a mastermind.
 If you get the sequence correctly, the mastermind will let you know that you have won. If not, the mastermind tells you the number of exacts and inexacts in your guess.
 Feel free to use this as practice!
 
# Some Pointers:
 - A mastermind game should have a specific length for all sequences. This length should be greater than 0.
 - A mastermind game can have duplicates. If duplicates are disabled, the length of the sequences cannot be larger than the length of the resources.
 - The resources are the elements used to play the game. The resources will be used to generate the correct sequence and for the player to guess. You are free to choose how to represent the game. For example, you can use Integers as your representation!
 - The sequences generated at the start of the game must be random.
 - While designing the game, you should make a Model, View, and Controller, and remember the SOLID principles.
 - If you want to add features to the game, that are not found in this given interface, do so without changing the main interface.
 - When the game is over, it should display if the player has won or lost and also show the correct sequence.
 - Every time the user guesses, it should display the number of exacts and inexacts that the user has had in their guessed sequence.
 - The exacts are calculated as any element that is in the correct sequence and in the correct position.
 - The inexacts are calculated as any element that is in the correct sequence but not in the correct position.
 - Watch out about how to handle exacts and inexacts for duplicates.

# Idea for Extra Features:
 - Add a reset game feature.
 - Add a undo feature.
 - Add 
