
## Sliding Window

### Find Maximum in Sliding Window

#### Statement
Given a list, find the maximum values in. all the contiguous subarrays of size k

#### Examples
Input = (-4, 2, -5, 3, 6)
windowSize = 3
output = (2, 3, 6)

Input = (-4, 5, 4, -4, 4, 6, 7, 20)
windowSize = 2
output = (5, 5, 4, 4, 6, 7, 20)

Input = (-4, 5, 4, -4, 4, 6, 7)
windowSize = 10
output = (7)
Explanation: Since the window size is greater than the size of the array we take the size of the array as the window size within which 7 is the max window

Input = (3, 3, 3, 3, 3, 3)
windowSize = 3
output = (3, 3, 3, 3)

Input = (1, 2, 3, 1, 4, 5, 2, 3, 6)
windowSize = 3
output = (3, 3, 4, 5, 5, 5, 6)

#### Solution Area
1. I think we can use the queue data structure for processing the window.
2. This way we can remove and add elements easily from the window
3. Although ArrayList would be a tad bit simplier.
4. I'll start with the ArrayList implementation first.
5. Okay, I think a Queue would be better as sorting the arraylist would be pointless.
6. I think Priority Queue fits this purpose as we can remove the max element in constant time but inserting becomes O(logn)