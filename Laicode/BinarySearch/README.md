# 14. Classical Binary Search

Given a target integer T and an integer array A sorted in ascending order, find the index i such that A[i] == T or return -1 if there is no such index.

**Assumptions**
There can be duplicate elements in the array, and you can return any of the indices i such that A[i] == T.

**Examples**
A = {1, 2, 3, 4, 5}, T = 3, return 2
A = {1, 2, 3, 4, 5}, T = 6, return -1
A = {1, 2, 2, 2, 3, 4}, T = 2, return 1 or 2 or 3

**Corner Cases**
What if A is null or A is of zero length? We should return -1 in this case.

**Note**
Classical binary search problem. Given a sorted array A[0...N], we have for any given index i, 0 <= i <= N, A[j] >= A[i] for all i <= j <= N and A[k] <= A[i] for all 0 <= k <= i.

So to search the target in any given range left, right(inclusive), we can compare the target to the A[mid] where mid = left + (right - left) / 2 (why? value overflow), if target > A[mid], we know its index target_index should be mid < target_index <= right. Samely, target < A[mid] => left <= target_index < mid. target = A[mid] means we find target number at index mid.

**Complexity**
Time: log(n) where n = array.length. In each iteration, we reduce the search range to 1/2 so O(logn) time complexity.

Space: O(1). No additional space needed.
