
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