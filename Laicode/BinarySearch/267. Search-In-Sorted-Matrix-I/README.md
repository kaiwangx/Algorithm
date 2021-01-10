# 267. Search In Sorted Matrix I

Given a 2D matrix that contains integers only, which each row is sorted in an ascending order. The first element of next row is larger than (or equal to) the last element of previous row.

Given a target number, returning the position that the target locates within the matrix. If the target number does not exist in the matrix, return {-1, -1}.

## Assumptions:

The given matrix is not null, and has size of N \* M, where N >= 0 and M >= 0.

## Examples:

matrix = { {1, 2, 3}, {4, 5, 7}, {8, 9, 10} }

target = 7, return {1, 2}

target = 6, return {-1, -1} to represent the target number does not exist in the matrix.

## Note

It's still a binary search problem except in a matrix form. The matrix can be transform into a sorted array: Matrix[x][y] => Array[x * width + y]. The rest is the same.

## Complexity

Time: O(logn); Space: O(1). Same as classical binary search
