
# Step Words Finder

> Pivotal Interview Problem – Character Frequency & Anagram Logic

This project contains a Java solution to find **valid step words** that can be formed by adding **exactly one character** to a given word and anagramming the result to form a valid dictionary word.

---

## 📄 Problem Statement

In a word game, a **step word** is created by:
1. Adding **exactly one character** to the base word
2. Anagramming the result to match a **valid dictionary word**

---

## 📥 Input Format


- First line: A lowercase word (W)
- Second line: Integer N (number of words in dictionary)
- Next N lines: N valid lowercase dictionary words

---

## 📤 Output Format


Print all valid **step words** (one per line), in **lexicographical order**.

---

## ✅ Example Explanation

**Input Word:** `apple`

**Step Words:**
- ✅ `appeal`: apple + a → appeal ✔️
- ✅ `papple`: apple + p → papple ✔️
- ❌ `apply`: missing `e`
- ❌ `pepla`: not just one letter added
- ❌ `apples`: not a valid anagram from apple + one letter

---

## 🚀 Approach (Greedy + Frequency Count)

1. Convert `baseWord` into a frequency array (size 26).
2. For each dictionary word:
   - If length ≠ base length + 1 → skip.
   - Convert it to a frequency array.
   - Check if it has exactly one more character.

---

## 📂 File

- `StepWordsFinder.java`: Complete efficient solution

---

## ▶️ How to Run

```bash
javac StepWordsFinder.java
java StepWordsFinder

