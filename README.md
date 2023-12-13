**Garland Linked List**

This Java project implements a custom linked list structure called `Garland` designed to store strings in a unique way. The `Garland` class is comprised of nodes, each holding a character and linked to the next node horizontally and to another node vertically. This structure allows for the creation of strings that form a garland-like pattern.

### Key Features:

1. **String to Linked List Conversion:**
   - The project includes methods to convert a regular string into a linked list, maintaining the garland structure.

2. **Linked List to String Conversion:**
   - Provides functionality to convert a garland linked list back into a string.

3. **Garland Construction:**
   - The project includes a constructor that takes an array of strings and creates a garland by linking nodes horizontally and vertically.

4. **Node Access and Removal:**
   - Methods are provided to access and remove nodes from the garland based on index.

5. **String Printing:**
   - Offers methods to print individual strings in the garland and all strings present in the garland.

### Usage:

This project provides a versatile linked list implementation with a unique structure. Users can create, manipulate, and print garlands, making it suitable for scenarios where a linked list with both horizontal and vertical connections is beneficial.

### How to Use:

1. **Create a Garland:**
   - Instantiate the `Garland` class.
   ```java
   Garland myGarland = new Garland();
   ```

2. **Add Strings:**
   - Add strings to the garland.
   ```java
   myGarland.addString("Hello");
   myGarland.addString("World");
   ```

3. **Access and Manipulate:**
   - Access, remove, or print strings in the garland.
   ```java
   myGarland.getString(0);    // Returns the string at index 0
   myGarland.removeString(1); // Removes the string at index 1
   myGarland.printString(0);  // Prints the string at index 0
   ```

4. **Print All Strings:**
   - Print all strings present in the garland.
   ```java
   myGarland.printStrings();
   ```

### Contribution:

Contributions are welcome! If you find a bug or have suggestions for improvement, please open an issue or create a pull request.

### Author:

- **Nikul Halai**
