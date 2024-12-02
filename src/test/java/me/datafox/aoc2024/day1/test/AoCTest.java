package me.datafox.aoc2024.day1.test;

import me.datafox.aoc2024.*;
import org.junit.jupiter.api.Test;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * "Tests" for Advent of Code 2024 solutions. They just print the solution to console, asserting that nothing is thrown.
 *
 * @author datafox
 */
public class AoCTest {
    @Test
    public void day1part1() {
        System.out.println(assertDoesNotThrow(() -> Day1.solve1(res(1))));
    }

    @Test
    public void day1part2() {
        System.out.println(assertDoesNotThrow(() -> Day1.solve2(res(1))));
    }

    @Test
    public void day2part1() {
        System.out.println(assertDoesNotThrow(() -> Day2.solve1(res(2))));
    }

    @Test
    public void day2part2() {
        System.out.println(assertDoesNotThrow(() -> Day2.solve2(res(2))));
    }

    @Test
    public void day3part1() {
        System.out.println(assertDoesNotThrow(() -> Day3.solve1(res(3))));
    }

    @Test
    public void day3part2() {
        System.out.println(assertDoesNotThrow(() -> Day3.solve2(res(3))));
    }

    @Test
    public void day2part2efficient() {
        System.out.println(assertDoesNotThrow(() -> Day2.solve2efficient(res(2))));
    }

    private URL res(int day) {
        return getClass().getResource(String.format("/day%s.txt", day));
    }
}
