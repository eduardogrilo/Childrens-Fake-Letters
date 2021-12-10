# Childrens fake letters
*This code is part of the "Tech Challenge Series – Advent Calendar 2021" advanced by Blip.pt (developed by Devskiller)*

> This year counting down to Christmas will be even funnier and Blip will be by your side the whole time with a variety of small programming puzzles and lots of prizes!


## Task description
Santa has a problem with fake letters. He is receiving multiple letters from the same children. Some children are sending more than one letter pretending to be someone else, so one child can receive more than one gift. This is illegal according to Rovaniemi's legal notice article 51, which states that each child should only receive one and only one gift from Santa.

However, he noticed that these clever kids are signing the extra letters using their name, but just re-arranging the letters around.

For example if two children have the same address and sign their letters with "Ajahni" and "Naijah", Santa gets very suspicious. This is because you can rearrange the name "Ajahni" by just moving the characters around and form "Naijah".

Your task is to write a function that will help Santa to figure out if a pair of names are suspicious or not.

Function signature:

```isSuspicious(String nameA, String nameB) returns boolean```

Examples:
```
isSuspicious("Ajahni", "Naijah") should return true
isSuspicious("Ronaldo", "Orlando") should return true
isSuspicious("Leanora", "Elanora") should return true
isSuspicious("Nina", "Nina") should return true
isSuspicious("", "") should return true

isSuspicious("James", "Johnny") should return false
isSuspicious("Sam", "Bob") should return false
```
Constraints:

Length of nameA and nameB is between 0 and 100
Only characters of the English alphabet are allowed (no spaces, no punctuation marks, no other symbols)
