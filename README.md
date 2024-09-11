# Inheritance and Delegation

This repository is set up for discussion on relative strengths and weaknesses of 
`inheritance` and `delegation` in 17214 24 fall recitation 03.

The handout can be found at: [https://github.com/CMU-17-214/f2024/blob/main/labs/lab03.md](https://github.com/CMU-17-214/f2024/blob/main/labs/lab03.md)

This is Changyi Yang, andrew ID changyiy. Here is my answers for the lab questions.

**Which is more dependent on the implementation details of the SortedIntList, delegation or inheritance?**

Inheritance. For example, we need to know SortedIntList has used add method for the addAll so that we can only 
overide the add method. For delegation, we just use the SortedIntList instance and do not care about its details.


**If the add method in SortedIntList is significantly modified or its behavior changes, which implementation is more likely to break?**

I think its equally likely, since both implementations call the add method in the SortedIntList.
But maybe the correct answer is inheritance, since its more depends on the implementation detail.

**What issues does using delegation solve that might have been problematic with inheritance?**

Delegation does not care much about the implementation change in parent class.
Delegation can combine multiple classes while inheritance can only inherit one class.

**Based on the provided implementations, when would it be more appropriate to use inheritance and when to use delegation?**

When multiple classes function is needed (has-a relation) or we do not know much about implementation detail of parent class, delegation is preferred.
When the child class is closely and stably related to parent class (such as a is-a relation) and parent's implementation is stable, inheritance is preferred.

