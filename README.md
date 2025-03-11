# Java Assignment 4
## Objective: 
**Write a menu-driven Java Program for the following:**

**1. There are 52 cards in a deck, each of which belongs to one of four suits and one of 13 ranks. Represent a deck of cards as an array of Objects (You may use the Vector class)**

**2. Use integers to encode the ranks and suits.**

**3. Have suitable default & parameterized constructors.**

**4. All data members to have private access. The class' Card' to have the following methods: createDeck(), printCard(), printDeck (),sameCard(),compareCard(), sortCard(), findCard() which searches through an array or vector of Cards to see whether it contains a specific card, dealCards() function: to print 5 random cards from the existing deck.**

### Main Class 
Methods:
- `main(String[] args)`: This method creates a Deck object, populates it with a standard deck of 52 playing cards using the `createDeck()` method, and then displays a menu for the user to interact with the deck of cards using the `displayMenu()` method.
### Deck Class
This class represents a deck of cards with methods to manipulate and interact with the deck.
Fields:
- `Deck`: A Vector of `Card` objects representing the deck of cards.
Constructor:
- `Deck()`: Constructs a `Deck` object with a capacity of 52 cards.
Methods:
- `createDeck()`: Creates a standard deck of 52 playing cards.
- `displayMenu()`: Displays a menu for the user to interact with the deck of cards.
- `printDeck()`: Prints all the cards in the deck.
- `shuffleDeck()`: Shuffles the cards in the deck.
- `drawCard()`: Removes and returns the last card in the deck.
- `emptyDeck()`: Removes all cards from the deck.
- `printCard()`: Prints a card at a specified index in the deck.
- `compareCard()`: Compares two cards in the deck based on their indices. The user is asked to input the indices of the two cards they want to compare.
- `sameCard()`: Checks if two cards in the deck are the same based on their indices. The user is asked to input the indices of the two cards they want to check.
- `findCard()`: Finds a card in the deck based on its rank and suit. The user is asked to input the rank and suit of the card they want to find.
- `dealHand()`: Deals a hand of five cards from the deck. If there are fewer than five cards in the deck, it informs the user that there are not enough cards to deal a hand.
- `sortCards()`: Sorts the cards in the deck. The sorting order is determined by the `compareTo()` method in the `Card` class.
### Card Class
This class represents a card with fields for rank and suit. It includes getter methods for these fields.
Fields:
- `rank`: An integer representing the rank of a card.
- `suit`: A string representing the suit of a card.
Methods:
- `Card(int rank, String suit)`: Constructs a Card object with the specified rank and suit.
- `getRank()`: Returns the rank of the card.
- `getSuit()`: Returns the suit of the card.
- `toString()`: Returns a string representation of the card, in the format “rank of suit”.
- `compareTo(Card other)`: Compares this card with another card. The comparison is primarily based on the rank, but if the ranks are equal, it will compare based on the suit.
- `equals(Object obj)`: Checks if this card is equal to another object. The cards are considered equal if they have the same rank and suit.

This class also implements the `Comparable<Card>` interface, which means that an array or list of `Card` objects can be sorted using the `Collections.sort()` method in Java. The `compareTo()` method defines the natural ordering of `Card` objects.
