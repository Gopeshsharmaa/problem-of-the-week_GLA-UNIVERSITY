
# Smallest Non-Representable Sum

> Amazon Interview Question – Greedy Subset Sum

This repository contains an optimal **Java solution** to find the **smallest positive integer** that cannot be formed by the sum of any subset of a sorted array of positive integers (coin denominations).

---

## 🧩 Problem Statement

Given a sorted list of positive integers (coin denominations), determine the **smallest positive amount of money that cannot be formed** using any subset of these coins.

---

## 🖥️ Input Format

A single line with **space-separated sorted positive integers**:


---

## 💡 Explanation

For `[1, 2, 3, 10]`:
- We can form: 1, 2, 3, 4, 5, 6
- But **7** cannot be formed by any subset sum

---

## 🚀 Greedy Algorithm (O(N) Time)

- Initialize `res = 1` (smallest number we **can't** yet form)
- Iterate through the array:
  - If `coin ≤ res`, we can extend the representable range: `res += coin`
  - If `coin > res`, then we **can't** form `res`, so return it

---

## 📄 File

- ✅ `SmallestNonRepresentableSum.java` – Efficient Greedy implementation

---
