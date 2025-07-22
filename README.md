# 🔍 Java DSA Concepts

This repository contains my Java implementations of core DSA topics like Arrays, Strings, and Binary Search.

### 📚 Topics Covered

- ✅ Arrays
- ✅ Strings
- ✅ Binary Search

### 🚀 About Me

I'm a BTech CSE student, learning Java & DSA to build strong foundations and contribute to open source through programs like **GSSoC**.

---

### 📁 Sample Code

#### Binary Search

```java
public class BinarySearch {
    public static int search(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}
