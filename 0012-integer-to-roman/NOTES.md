# Here, the code array represents Roman numerals, and the value array represents their corresponding integer values.

# Example
Let's convert the number 1987 to its Roman numeral equivalent.

Initialization:

num = 1987
ss = "" (An empty string to build the Roman numeral.)
Iteration through the code array:

Start with the first element in the array:

i = 0, value[i] = 1000, code[i] = "M"

Since num >= value[i] (1987 >= 1000), append "M" to ss and subtract 1000 from num.
Now, num = 987, ss = "M".
Move to the next element:

i = 1, value[i] = 900, code[i] = "CM"

Since num >= value[i] (987 >= 900), append "CM" to ss and subtract 900 from num.
Now, num = 87, ss = "MCM".
Continue:

i = 2, value[i] = 500, code[i] = "D"

Since num < value[i] (87 < 500), skip this iteration.
i = 3, value[i] = 400, code[i] = "CD"

Since num < value[i] (87 < 400), skip this iteration.
i = 4, value[i] = 100, code[i] = "C"

Since num < value[i] (87 < 100), skip this iteration.
i = 5, value[i] = 90, code[i] = "XC"

Since num < value[i] (87 < 90), skip this iteration.
i = 6, value[i] = 50, code[i] = "L"

Since num >= value[i] (87 >= 50), append "L" to ss and subtract 50 from num.
Now, num = 37, ss = "MCML".
i = 7, value[i] = 40, code[i] = "XL"

Since num < value[i] (37 < 40), skip this iteration.
i = 8, value[i] = 10, code[i] = "X"

Since num >= value[i] (37 >= 10), append "X" to ss and subtract 10 from num.

Now, num = 27, ss = "MCMLX".

Again, since num >= value[i] (27 >= 10), append "X" to ss and subtract 10 from num.

Now, num = 17, ss = "MCMLXX".

Again, since num >= value[i] (17 >= 10), append "X" to ss and subtract 10 from num.

Now, num = 7, ss = "MCMLXXX".

i = 9, value[i] = 9, code[i] = "IX"

Since num < value[i] (7 < 9), skip this iteration.
i = 10, value[i] = 5, code[i] = "V"

Since num >= value[i] (7 >= 5), append "V" to ss and subtract 5 from num.
Now, num = 2, ss = "MCMLXXXV".
i = 11, value[i] = 4, code[i] = "IV"

Since num < value[i] (2 < 4), skip this iteration.
i = 12, value[i] = 1, code[i] = "I"

Since num >= value[i] (2 >= 1), append "I" to ss and subtract 1 from num.

Now, num = 1, ss = "MCMLXXXVI".

Again, since num >= value[i] (1 >= 1), append "I" to ss and subtract 1 from num.

Now, num = 0, ss = "MCMLXXXVII".

Result:

The final value of ss is "MCMLXXXVII", which is the Roman numeral representation of 1987.​
