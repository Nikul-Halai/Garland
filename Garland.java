// Nikul Halai
// COP 3330, Spring 2023
// ni014425

public class Garland
{
    private Node head;
    private int size;  

    // Below is a method which returns the difficulty rating of the assignment
    public static double difficultyRating()
    {
        return 5.0;
    }

    // Below is a method which returns the number of hours spent on the assignment
    public static double hoursSpent()
    {
        return 28.9;
    }

    // Below is a method which converts a string to a linked list
    public static Node stringToLinkedList(String s)
    {
        if (s == null)
        {
            return null;
        }

        if (s.length() == 0)
        {
            return null;
        }

        if (s.length() == 1)
        {
            return new Node(s.charAt(0));
        }

        Node result = new Node(s.charAt(0));
        Node ongoing = result;

        int len = 1;
        while (len < s.length()) 
        {
            ongoing.down = new Node(s.charAt(len));
            ongoing = ongoing.down;

            len++;
        }

        return result;
    }

    // Below is a method which converts a linked list to a string
    public static String linkedListToString(Node head)
    {
        if (head == null)
        {
            return "";
        }

        String result = "";
        Node ongoing = head;

        while (ongoing != null)
        {
            result = result.concat(Character.toString(ongoing.data));
            ongoing = ongoing.down;
        }

        return result;
    }

    // Below is a method which returns the string of the garland
    Garland()
    {
        head = null;
    }

    // Below is a constructor which takes an array of strings and creates a garland
    Garland(String[] strings)
    {
        if (strings == null || strings.length == 0)
        {
            return;
        }

        Node result = new Node(strings[0].charAt(0));
        Node ongoing1 = result;

        int len = 1;
        while (len < strings[0].length()) 
        {
            ongoing1.down = new Node(strings[0].charAt(len));
            ongoing1 = ongoing1.down;

            len++;
        }

        head = result;

        size++;
        Node ongoing = head;

        len = 1;
        while (len < strings.length)
        {
            if (strings[len] == null || strings[len].length() == 0)
            {
                continue;
            }

            Node result2 = new Node(strings[len].charAt(0));
            Node ongoing2 = result2;

            int len2 = 1;
            while (len2 < strings[len].length()) 
            {
                ongoing2.down = new Node(strings[len].charAt(len2));
                ongoing2 = ongoing2.down;

                len2++;
            }

            ongoing.next = result2;
            ongoing = ongoing.next;

            size++;
            len++;
        }
    }
    
    // Below is a method which returns garland
    public Node head() 
    {
        return head;
    }

    // Below is a method which returns the size of the garland
    public int size()
    {
        return size;
    }

    // Below is a method which adds a string to the end of the garland
    public void addString(String s)
    {
        if (s == null || s.length() == 0)
        {
            return;
        }

        Node result = new Node(s.charAt(0));
        Node ongoing1 = result;

        int len = 1;
        while (len < s.length()) 
        {
            ongoing1.down = new Node(s.charAt(len));
            ongoing1 = ongoing1.down;

            len++;
        }

        if (head == null)
        {
            head = result;
            size++;
            return;
        }

        Node ongoing = head;
        while (ongoing.next != null)
        {
            ongoing = ongoing.next;
        }

        ongoing.next = result;

        size++;
    }

    // Below is a method which returns the node that is requested
    public Node getNode(int index)
    {
        if (index < 0)
        {
            return null;
        }

        if (index >= size())
        {
            return null;
        }

        if (head == null)
        {
            return null;
        }

        Node ongoing = head;
        int len = 0;
        while (ongoing != null)
        {
            if (len == index)
            {
                return ongoing;
            }

            len++;
            ongoing = ongoing.next;
        }

        return null;
    }

    // Below is a method which returns the string that is requested
    public String getString(int index)
    {
        if (index < 0)
        {
            return null;
        }

        if (index >= size())
        {
            return null;
        }

        if (head == null)
        {
            return null;
        }

        Node ongoing = head;
        int len = 0;
        while (ongoing != null)
        {
            if (len == index)
            {
                return Garland.linkedListToString(ongoing);
            }

            len++;
            ongoing = ongoing.next;
        }

        return null;
    }

    // Below is a method which removes the string that is requested
    public boolean removeString(int index)
    {
        if (index < 0)
        {
            return false;
        }

        if (index >= size())
        {
            return false;
        }

        if (head == null)
        {
            return false;
        }

        if (index == 0)
        {
            head = head.next;
            size--;
            return true;
        }

        Node ongoing = head;
        int len = 0;
        while (ongoing != null)
        {
            if (len == index - 1)
            {
                ongoing.next = ongoing.next.next;
                size--;
                return true;
            }

            len++;
            ongoing = ongoing.next;
        }

        return false;
    }

    // Below is a method which prints the string that is requested
    public boolean printString(int index) 
    {
        if (index < 0)
        {
            System.out.println("(invalid index)");
            return false;
        }

        if (index >= size())
        {
            System.out.println("(invalid index)");
            return false;
        }

        if (head == null)
        {
            System.out.println("(empty list)");
            return false;
        }

        Node ongoing = head;
        int len = 0;
        while (ongoing != null)
        {
            if (len == index)
            {
                Node ongoing2 = ongoing;
                while (ongoing2 != null)
                {
                    System.out.print(ongoing2.data);
                    ongoing2 = ongoing2.down;
                }

                System.out.println();

                return true;
            }

            len++;
            ongoing = ongoing.next;
        }

        return false;
    }

    // Below is a method which prints all the strings in the garland
    public void printStrings()
    {
        if (head == null)
        {
            System.out.println("(empty list)");
            return;
        }

        Node ongoing = head;
        while (ongoing != null)
        {
            Node ongoing2 = ongoing;
            while (ongoing2 != null)
            {
                System.out.print(ongoing2.data);
                ongoing2 = ongoing2.down;
            }
            System.out.println();

            ongoing = ongoing.next;
        }
    }
}