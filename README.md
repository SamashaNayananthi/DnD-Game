# DnD-Game
The problem is about a game called Dungeons and Dragons design by Gary Gygax and Dave Arneson. This is the first role-playing game (RPG).

In DnD1.java I have read in 7 variables(Str,Dex,Con,Int,Wis,Cha and Level) from the console. Basically I have to prompt these variables from the user. After read in the variables then the program should calculate the bonus as follows. Bonus should be 0 at 10, cumulative +1 for each even number above 10 and -1 for each odd number below 10. And then Hit Points should be calculated using following equation. Hit Points = level * level * (Math.random () * 1000 % 6 + 1). If the bonus is a positive number display + before the number, if the number is a negative number display – before the number and no sign if the bonus is 0.
If the level is less than or equal 0 display an error message and ask the user to re-enter the level value. And also if the other variables values are less than 0 displays an error message and ask the user to re-enter the specific value.
At last I have to display the output.

In DnD2 I only prompt the level from the users. If the level value is less than or equal to 0 or level is greater than 20 display an error message and prompt for the level again. After read in level from the console next I have to roll a 3d6 dice and get values for the other variables (Str, Dex, Con, Int, Wis, Cha). After roll all the stats then I have to calculate bonus for the each stat and display them.  Bonus should be calculated as the previous workshop. 0 at 10, cumulative +1 for each even number above 10 and -1 for each odd number below 10. 
Hitpoints should be now calculated as 1d6 + Con bonus value per level.
After rolled and displayed the user should have the option to accept those values or should have a chance to re-roll their stats. I can generate a random number 1 to 6 using (Math.random()*1000 %6+1). 
At last I have to display the output.

Like in the DnD2p I have to read in only the level from the console and if the level value is less than or equal to 0 or level is greater than 20 display an error message and prompt for the level again. Now I have to roll a 4d6 dice and drop the lowest die and get the values for the other 6 variables(Str, Dex, Con, Int, Wis, and Cha). 
Hitpoints should calculate as previous workshop 1d6 + Con bonus per level.
 I have to roll all these stats  as one block and then display them. 
After rolled and displayed the outputs the user should have the chance to accept or re-roll their stats. The output print as indicated previously.



