function linearSearch(arr, target) {
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] === target) {
            return i;
        }
    }
    return -1;
}
console.log("Sorted Linear Search: ", linearSearch([4,6,10,7,23,15,5,9,3,16], 15))

function binarySearch(arr, target) {
    let low = 0;
    let high = arr.length - 1;

    while (low <= high) {
        const mid = Math.floor((low + high) / 2);

        if (arr[mid] === target) {
            return mid;
        } else if (arr[mid] < target) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    return -1;
}
console.log("Sorted Binary Search: ", binarySearch([2, 5, 8, 12, 16, 23, 38, 56, 72, 91], 23))