package test;

import algorithms.maze3D.*;


public class RunMaze3DGenerator {
    public static void main(String[] args) {
        testMazeGenerator(new MyMaze3DGenerator());
    }
    private static void testMazeGenerator(IMaze3DGenerator mazeGenerator) {
        // prints the time it takes the algorithm to run
        System.out.println(String.format("Maze generation time(ms): %s", mazeGenerator.measureAlgorithmTimeMillis(50/*depth*/,50/*rows*/, 50/*columns*/)));
        // generate another maze
        Maze3D maze = mazeGenerator.generate(6/*Depth*/,6/*rows*/, 6/*columns*/);

        // prints the maze
        maze.print();

        // get the maze entrance
        Position3D startPosition = maze.getStartPosition();

        // print the position
        System.out.println(String.format("Start Position: %s", startPosition)); // format "{depth,row,column}"

        // prints the maze exit position
        System.out.println(String.format("Goal Position: %s", maze.getGoalPosition()));
    }

}
