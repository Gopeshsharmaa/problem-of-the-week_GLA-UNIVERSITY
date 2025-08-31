---
### 📘 `Problem3/README.md`
```markdown
# Problem 3: Count Friend Groups

**Company:** Twitter  
**Difficulty:** Medium  

---

## 📖 Problem Statement
We are given a classroom of `N` students. Friendships are mutual and represented as an adjacency list.  
A **friend group** is a set of students connected directly or indirectly.  
We need to count the total number of friend groups.  

---

## 🔹 Input Format
1. Integer `N` – total number of students (`0` to `N-1`).  
2. Dictionary `friendship` where:  
   - Key = student ID  
   - Value = list of friend student IDs  

## 🔹 Output Format
- An integer: total number of friend groups.  

---


---

## 💡 Constraints
- Friendship is mutual (undirected graph).  
- Solve using **DFS or BFS** traversal.  

---

## 🚀 Approach
- Treat the problem as finding **connected components** in a graph.  
- Keep a `visited` set.  
- For each unvisited student, run **DFS** and count a new group.  

---

## 📝 Solution File
`CountFriendGroups.java`

---

## ⚙️ How to Run
```bash
javac CountFriendGroups.java
java CountFriendGroups

