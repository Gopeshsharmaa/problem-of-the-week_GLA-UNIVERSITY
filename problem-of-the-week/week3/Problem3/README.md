
# 🌳 Count Unival Subtrees

This repository contains a Java implementation to solve the **Count Unival Subtrees** problem, asked by **Google**.

---

## 📌 Problem Statement

Given the root of a binary tree, count the number of **unival subtrees** present.

- A **unival subtree** is a subtree where all nodes have the **same value**.
- A single node is trivially a unival subtree.

---

## 🧾 Input Format

- The root of a binary tree where each node contains:
  - An integer value (can be positive or negative)
  - Left and right child nodes

---

## 📤 Output Format

- Print a single integer representing the number of unival subtrees in the tree.

---

## ✅ Example

     0
    / \
   1   0
      / \
     1   0
    / \
   1   1



**Output:** `5`

**Explanation:**
- Left leaf node with value 1
- Rightmost leaf node with value 0
- Two leaf nodes with value 1 under the left child of right subtree
- The subtree rooted at that 1 node (both children are 1)
- Total 5 unival subtrees

---

## 💡 Approach

- Use **post-order traversal** (left, right, root).
- Recursively check if left and right subtrees are unival.
- Current subtree is unival if:
  - Both left and right subtrees are unival.
  - Node's value matches its children's values (if children exist).
- Maintain a global counter to track the number of unival subtrees.

---

## ⏱️ Time Complexity

- **O(N)**, where N is the number of nodes in the tree.

---

## 💻 Java Code

```java
// See CountUnivalSubtrees.java in this repo for full code
