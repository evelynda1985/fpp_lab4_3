# fpp_lab4_3
Binary Search

Programming Assignment 4-3
For this exercise, you will create a recursive search routine that behaves as follows:
Given a String s in which characters occur in ascending order, and given a character c, it
returns true if c occurs in s, false otherwise.
Implement the following strategy: Given String s and char c: Let len denote the length
of s.
• Let m = len /2 and let ch be the character at position m in s.
• If ch == c, return true
• Else if c < ch, return true if c is in the left half of s, false otherwise
• Else if c > ch, return true if c is in the right half of s, false otherwise
Name your class BinSearch and your recursive search method search.
Create a JUnit test to test your code. Create one test in which the input character is one of
the characters in the input string, Create a second test in which the input character is not
in the input string.
