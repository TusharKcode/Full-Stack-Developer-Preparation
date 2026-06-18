// function climbStairsRecursive(n) {
//   // Base cases: 1 way for 1 step, 2 ways for 2 steps
//     if (n <= 2) {
//         return n;
//     }

//     // Recursive rule: to reach step n, you can come from step (n-1) or step (n-2)
//     return console.log(climbStairsRecursive(n - 1) + climbStairsRecursive(n - 2));
// }

// console.log("Climbing Stairs: " ,climbStairsRecursive(30));

function climbStairsMemo(n, memo = {}, depth = 0) {
    // Create an indentation string based on how deep we are in the recursion
    const indent = "  ".repeat(depth);
    console.log(`${indent}➔ Entering climbStairsMemo(${n})`);

    // If already calculated, return cached value
    if (memo[n] !== undefined) {
        console.log(`${indent}  ✨ [CACHE HIT] Already know steps for ${n}. Returning saved value: ${memo[n]}`);
        return memo[n];
    }

    // Base cases: 1 way for 1 step, 2 ways for 2 steps
    if (n <= 2) {
        console.log(`${indent}  🛑 [BASE CASE] Reached step ${n}. Returning: ${n}`);
        return n;
    }

    console.log(`${indent}  Calculating for ${n}: Needs climbStairsMemo(${n - 1}) + climbStairsMemo(${n - 2})`);

    // Calculate once and store in memo for future use
    memo[n] =
        climbStairsMemo(n - 1, memo, depth + 1) +
        climbStairsMemo(n - 2, memo, depth + 1);
    console.log(`${indent}  💾 [SAVING TO CACHE] Total ways for step ${n} is ${memo[n]}`);
    return memo[n];
}
// Testing with a small number (4) so the log output is clean and easy to read
console.log("\n--- Starting Calculation ---");
const result = climbStairsMemo(4);
console.log("----------------------------");
console.log("Climbing Stairs Total Ways: ", result);


function climbStairsTabulation(n) {
    if (n <= 2) {
        return n;
    }

    // Create an array to store solutions from 0 to n
    const dp = new Array(n + 1).fill(0);

    // Base cases
    dp[1] = 1; // 1 way to reach step 1
    dp[2] = 2; // 2 ways to reach step 2

    console.log("Initial DP Array (Base Cases):", dp);
    console.log("-----------------------------------------");

    // Build up the solution iteratively
    for (let i = 3; i <= n; i++) {
        // Ways to reach step i = ways to reach (i-1) + ways to reach (i-2)
        dp[i] = dp[i - 1] + dp[i - 2];
        
        // Simple log showing the addition and the current state of the table
        console.log(`Step ${i}: dp[${i - 1}] (${dp[i - 1]}) + dp[${i - 2}] (${dp[i - 2]}) = ${dp[i]}`);
        console.log("Current DP Array:", dp);
        console.log("-----------------------------------------");
    }
    return dp[n];
}
// Testing with 5 steps so the output is short and clear
console.log("Final Result for 5 steps:", climbStairsTabulation(5));