
# Problem 1: First Recurring Character in a String

**Company:** Google  
**Difficulty:** Easy  

---

## 📖 Problem Statement
Given a string `s`, return the **first character that appears more than once**, with the earliest second appearance.  
If there is no such character, return `null`.

---

## 🔹 Input Format
- A single string `s` consisting of lowercase and/or uppercase English letters.

## 🔹 Output Format
- Return the first recurring character as a single-character string.
- Return `null` if no character repeats.

---


---

## 💡 Constraints
- `1 <= s.length <= 10^5`
- All characters are ASCII printable characters.

---

## 🚀 Approach
- Use a **HashSet** to store characters while traversing the string.
- The **first character seen again** is the answer.
- If no character repeats, return `null`.

---

## 📝 Solution File
`FirstRecurringCharacter.java`

---

## ⚙️ How to Run
```bash
javac FirstRecurringCharacter.java
java FirstRecurringCharacter
