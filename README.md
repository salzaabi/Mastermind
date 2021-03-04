# Mastermind
 This is an interface designed for a Mastermind type game. The idea of this game is to submit guesses to a mastermind.
 If you get the sequence correctly, the mastermind will let you know that you have won. If not, the mastermind tells you the number of exacts and inexacts in your guess.
 Feel free to use this as practice!
 
 Personally, I still didn't create my solution, so there might be things missing. If so, let me know or make these changes and create a pull-request. I will look it over and approve it, if it is good!
 
## Some Pointers:
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

## Notes on the MVC:
 - Your model should represent the game with its basic features.
 - Your controller should have commands to allow you to play the game, you can do this in whatever way you want. The most basic commands are inserting and submitting.
 - Your view should display your game in whatever way you want. Be creative!

## Idea for Extra Features:
 - Add a reset game feature.
 - Add a undo feature.
 - Add a timer.

## Contribution:
 Feel free to add your solutions to this game by created a directory that contains you full game. If possible, create a README.md file that contains a description of how you implemented your work. Also feel free to do some changes to the main interface; however, these will need to be approved by creating a pull request.
