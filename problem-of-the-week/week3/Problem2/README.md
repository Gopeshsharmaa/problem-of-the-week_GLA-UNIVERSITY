# ⚖️ Equal Sum Partition

This repository contains a Java implementation to solve the **Equal Sum Partition** problem, asked by **Facebook**.

---

## 📌 Problem Statement

Given a multiset (list that may contain duplicate integers), determine if it can be partitioned into two subsets such that:


---

## 🧾 Input Format

- A list of non-negative integers (can include duplicates)
- The list may contain up to 100 elements

---

## 📤 Output Format

- Return `true` if the set can be partitioned into two subsets with equal sum, else `false`.

---

## ✅ Examples

**Example 1:**


---

## 💡 Constraints

- All numbers are **non-negative integers**
- At least one number exists in the input

---

## 🧠 Approach

- Calculate the total sum of elements.
- If the total sum is **odd**, return `false` immediately.
- Otherwise, use **Dynamic Programming** to check if a subset exists with sum = totalSum / 2.
- This is a variation of the classic **Subset Sum Problem**.

---

## ⏱️ Time Complexity

- **O(N × Sum/2)**, where N is the number of elements and Sum is the total sum of elements.

---
