
# Longest Common Subsequence of Three Strings

This repository contains two Java implementations to solve the **Longest Common Subsequence (LCS)** problem for **three input strings**.

---

## 📌 Problem Statement

Given **three strings**, compute the **length** of the **Longest Common Subsequence (LCS)** that is present in all three.

A **subsequence** is a sequence that appears in the same relative order but not necessarily contiguous.

---

## 🧠 Use Case

Used in:
- 📦 Version Control (like Git)
- 🧬 DNA/Genome Sequence Matching
- 🔍 Spell Checking
- 🔐 Plagiarism Detection

---

## 🧾 Input Format

Each of the three strings is taken as input (one per line).

**Constraints:**
- 1 ≤ |S1|, |S2|, |S3| ≤ 100
- Only uppercase/lowercase English letters

---





**Explanation:**  
The LCS is `"eieio"` — length `5`.

---

## 🚀 Solutions

### ✅ 1. Efficient Solution – `LCSOfThreeDP.java`

- Uses **3D Dynamic Programming**
- **Time Complexity:** `O(n1 * n2 * n3)`
- **Space Complexity:** `O(n1 * n2 * n3)`
- Suitable for all inputs within constraints

📄 File: [`LCSOfThreeDP.java`](./LCSOfThreeDP.java)

---

### 🐌 2. Brute Force Solution – `LCSOfThreeBruteForce.java`

- Generates all subsequences of the first string and checks for presence in the other two
- **Time Complexity:** `O(2^n1 * n2 * n3)`  
- Only usable when input string lengths ≤ 10

📄 File: [`LCSOfThreeBruteForce.java`](./LCSOfThreeBruteForce.java)

---

## 🧪 How to Run

```bash
javac LCSOfThreeDP.java
java LCSOfThreeDP
