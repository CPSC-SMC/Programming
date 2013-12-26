Program 2: Your first mash-up

A mash-up in web service programming is a program that combines information from 
multiple web services to create a more interesting or immersive user experience. 
For example, simply asking for a zip code and receiving a city and state is 
useful, but unlikely to cause the user to continue using the program. On the 
other hand, a program that gets constantly updated data about weather and local 
"goings-on" is much more likely to get repeated use.

Design and write a program that uses a user-entered zip code to generate a 
weather and Twitter report for that place. If the zip code in question is for 
your home state, print *** after the city name to let everyone know how excited 
you are! The report should include weather information of your choice for the 
city and tweets that reference the city name. The user should be able to 
continue entering zip codes (without restarting the program) until she wants to 
quit.

Here are some hints: 

1. You'll need an if statement to check if the state of the zip code is your home state.
2. You'll need a big loop that allows all of these items to be repeated.
3. You might want to use your Weather class from Lab 4.
4. Don’t forget you will need to add twitter4j.properties to your project as in Lab 5.

Please see the Design Template in the Assignments->Programs section of Blackboard. 
This will help you write your documentation file.
