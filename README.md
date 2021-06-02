# Android_Pattern_Lock_Generator_GUI
Java Android Pattern Lock Generator GUI is a short project carried out to provide you with 2 lakh combinations of various lock patterns for your phone. Android phones have various locking mechanisms to support the privacy of the user. One of the very famous locking mechanisms is to generate a pattern lock. Android pattern lock is a 3x3 matrix pattern which 9 distinct dots on your screen. Now to generate a successful pattern, the user need to follow 3 simple rules:-

1. The smallest pattern should at least connect 4 distinct dots. 
2. The largest pattern has a combination of 9 distinct dots. 
3. While creating the pattern, the user cannot visit the visited dot again for pattern generation. 

We have used the basic concept of random number generator to solve this pattern problem because the pattern to be generated has to be random. Now, while creating the pattern, we also have to check whether the number generated is not repeated, and with 9 numbers generated it adds to the complexity of the code. So to reduce the complexity of the code and think of the worst-case scenario, we divided 9 numbers into packs of three each from the nascent phase of number generation and check whether the number is repeated or not parallel.

Now the pattern generated was passed as x and y coordinates in a 3x3 matrix and we used the thread.sleep method to generate the animation of the connecting lines.

For a more detailed description of the project, check the readme file  
[readme.pdf](https://github.com/pratvi0511/Android_Pattern_Lock_Generator_GUI/blob/main/readme.pdf)
