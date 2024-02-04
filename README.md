# STEM-Algorithms
This is a project to help teach students in elementary school the basics of problem-solving.

### Relevance to STEM
Computer science is about solving problems, some important topics are optimization and counting possibilities. 
One of the most common ways to solve complex problems is through reduction.
Reduction is when we take in input of the problem and rewrite it so that we can plug it into another already solved problem. 
We commonly reduce optimization and counting problems to a problem to a form of special graph, and a maze can be thought of as a restricted graph. 
In a way, teaching kids about mazes is an introduction to solving some of these complex problems.
A common problem is to give the instructions on how to get from point A to point B in a maze. 
To solve this we need to create an algorithm to search all possibilities in a maze. 
When creating an algorithm, the logic has to be determined before trying to solve the maze. 
So our challenge to the kids is to give us a list of instructions to move a dot through a maze.

![MazeGame1](https://github.com/CSE-Club-ISU/STEM-Algorithms/assets/7538725/03e102ba-80a2-475a-a29d-aafb5ac64442)

### Todo:
* Create better maze algorithms
* Improve the UI
* Migrate to android studio?
* Create other algorithm games:
  * Higher or lower?

Notes on compiling to jar file from intellij:
* Add a .manifest.txt file to src and write :Main-Class: src/Frame" inside
* cd to STEM-Algorithms outside of src and run the "jar cfm STEM-Algorithms.jar src/manifest.txt *" in the terminal
* A jar file named STEM-Algorithms should now be created
