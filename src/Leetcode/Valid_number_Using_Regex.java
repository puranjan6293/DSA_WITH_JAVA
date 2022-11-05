package Leetcode;
/*
Explaination

Little regular expression remainder

\\d matches any digit
\\. matches a dot (be careful, . matches any character)
[chars] matches one of the characters between the square brackets. For example, [acgt] matches a or c or g or t
expr1|expr2 matches either expr1 or expr2
expr? matches expr zero or one time. For example, a? matches the empty string or a. It is used to represent optional parts
expr* matches expr zero or one or several times. For example, a* matches the empty string or a or aa or aaa, etc.
expr+ matches expr one or several times. For example, a+ matches a or aa or aaa, etc. It means "at least once"
(expr) represents a group. It is used to separate expressions. For example, (a|b)c matches ac or bc while a|bc matches a or bc
Number

A number can be broken into three parts:

a sign (optional)
a value (mandatory)
an exponential part (optional)
The sign

This is given by [+-]?
The ? indicate that the sign can be present once or not.

The value

There are four possible forms

An integer, like 123
A decimal with a fractional part, like 123.456
A decimal without fractional part, like 123.
A decimal with only a fractional part, like .456
The first three forms can be expressed as one expression, \\d+(\\.\\d*)?
This means, one or more digits, optionally followed by a dot and zero or more digits

The last form can be expressed as \\.\\d+
This means, a dot followed by one or more digits

Put together, this gives (\\.\\d+|\\d+(\\.\\d*)?) or (\\d+(\\.\\d*)?|\\.\\d+) (the order is does not matter).

The exponent

The exponential part is optional. It consists of the letter e, followed by an optional sign (+ or -), followed by one or more digits.
This gives (e[+-]?\\d+)?
 */
import java.util.regex.*;
public class Valid_number_Using_Regex {
    private static Pattern NUMBER = Pattern.compile("[+-]?(\\.\\d+|\\d+(\\.\\d*)?)(e[+-]?\\d+|E[+-]?\\d+)?");
    public boolean isNumber(String s) {
		return NUMBER.matcher(s.trim()).matches();
	}
}
