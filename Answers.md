1) They all are of complexity O(n).

2)If the array wasnt sorted then binnary search wouldnt work because it only works if values lower than mid are actually lower than mid and same for values higher.

3)The purpose of constructor argument checking is to make sure the constructor for making a team is working correctly so it checks to make sure if one is null it outputs error.
4)the point of using final with variables and arguments is so their value doesn't change no matter what happens in the program, so final int blank = 1 would always stay as 1.
5) Instead of using Optional you can just use regular objects however you would have to write your own method for it and you would have to check if it is null. But Optional gives you a safe way to null because it can be returned as a null so no errors or exceptions. Also it already as .ifPresent and .get which are very helpful.
