class MinHeap {
    constructor(compare = (a, b) => a - b) {
        this.data = [];
        this.compare = compare;
    }

    peek() {
        return this.data[0];
    }

    push(value) {
        this.data.push(value);
        this.#bubbleUp(this.data.length - 1);
    }

    pop() {
        if (this.data.length === 0) return undefined;

        const top = this.data[0];
        const last = this.data.pop();

        if (this.data.length > 0) {
            this.data[0] = last;
            this.#bubbleDown(0);
        }

        return top;
    }

    pushPop(value) {
        if (this.data.length === 0) return value;

        if (this.compare(this.data[0], value) < 0) {
            const top = this.data[0];
            this.data[0] = value;
            this.#bubbleDown(0);
            return top;
        }

        return value;
    }

    heapify(arr) {
            this.data = arr.slice();
            for (let i = Math.floor(this.data.length / 2) - 1; i >= 0; i--) {
            this.#bubbleDown(i);
        }
    }

    #bubbleUp(i) {
        while (i > 0) {
            const p = Math.floor((i - 1) / 2);
            if (this.compare(this.data[i], this.data[p]) >= 0) break;
            [this.data[i], this.data[p]] = [this.data[p], this.data[i]];
            i = p;
        }
    }

    #bubbleDown(i) {
        const n = this.data.length;

        while (true) {
            let smallest = i;
            const l = 2 * i + 1;
            const r = 2 * i + 2;

            if (l < n && this.compare(this.data[l], this.data[smallest]) < 0)
                smallest = l;
            if (r < n && this.compare(this.data[r], this.data[smallest]) < 0)
                smallest = r;

            if (smallest === i) break;

            [this.data[i], this.data[smallest]] = [this.data[smallest], this.data[i]];
            i = smallest;
        }
    }
}

const myHeap = new MinHeap();

// To add elements to the heap, you would call push().
myHeap.push(9);

// To get the element with the highest priority 
myHeap.pop();

// pushPop() combines both operations into one call. 
// This is more efficient than calling them in a sequence separately, especially when the heap is 
// large, since it only performs one reordering operation:
myHeap.pushPop(15);

// If you already have an array and you want to transform it into a heap, you could call heapify():
myHeap.heapify([9, 2, 7, 1]);


const myHeap = new MinHeap((a, b) => a[0] - b[0]);
myHeap.push([3, "A"]);
myHeap.push([2, "B"]);
myHeap.push([1, "C"]);


let counter = 0;
const myHeap = new MinHeap((a, b) => (a[0] - b[0]) || (a[1] - b[1]));
myHeap.push([3, counter++, "A"]);
myHeap.push([2, counter++, "B"]);
myHeap.push([2, counter++, "C"]);
