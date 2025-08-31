---

### 📘 `Problem2/README.md`
```markdown
# Problem 2: Search in a Sorted List Without Multiplication, Division, or Bit-Shifts

**Company:** Netflix  
**Difficulty:** Medium  

---

## 📖 Problem Statement
You are given a sorted list of integers `arr` and a target value `x`.  
Return **true** if `x` exists in the list, otherwise return **false**.  

⚠️ You cannot use:
- Multiplication (`*`)  
- Division (`/`)  
- Bit shifting (`<<`, `>>`)  

---

## 🔹 Input Format
1. Integer `N` – size of the list.  
2. A sorted list of `N` integers.  
3. Integer `x` – the target value.  

## 🔹 Output Format
- `true` if `x` exists in the list, otherwise `false`.

---


---

## 💡 Constraints
- Time Complexity: `O(log N)`  
- No `*`, `/`, `<<`, `>>` operators allowed.  

---

## 🚀 Approach
- Use **Binary Search**.
- Replace `(low + high) / 2` with a **custom divide by 2 function** using subtraction.
- Continue until target is found or search space is empty.

---

## 📝 Solution File
`SearchSortedList.java`

---

## ⚙️ How to Run
```bash
javac SearchSortedList.java
java SearchSortedList
