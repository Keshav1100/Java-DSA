public class SplitArraySum {
    /*
    ex. nums = [7,2,5,10,8], k = 2
    question asks us to:
        i. divide the array into "k" contiguous sub arrays
        -> Each sub array will have a sum
        -> Out of "k" sub arrays, the largest of them will have a sum , so we need to split in such a way that the largest sub array's sum is minimized
ex.:->
[7,2,5] nad [10,8] => 14, 18
[7,2,5,10] and [8] => 24, 8
... and soo on,
so above in case 1 the largest sub array's sum is 14, which is minimized as no other combinations/ sets of combinations will have such a largest sub array which will have any smaller sum and so we need to return the maximum sum of any 2 of that combination, i.e, 18 here.




     */
    public static void main(String[] args) {

    }
}
