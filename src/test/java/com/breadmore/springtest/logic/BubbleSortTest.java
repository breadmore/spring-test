package com.breadmore.springtest.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @DisplayName("bubble sort - input list then print result")
    @Test
    void test(){
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        List<Integer> actual = bubbleSort.sort(List.of(3,2,4,5,1));

        assertEquals(List.of(1,2,3,4,5),actual);
    }

}