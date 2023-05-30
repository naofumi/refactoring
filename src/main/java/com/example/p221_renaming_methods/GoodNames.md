# Good Names

An important part of the code style I am advocating is small methods to factor complex
processes. Done badly, this can lead you on a merry dance to find out what all the little methods do. The key to avoiding this merry dance is naming the methods. Methods should be named in a way that communicates their intention. A good way to do this is to think what the comment for the method would be and turn that comment into the name of the method.

*Martin Fowler "Refactoring"*



*From "Clean Code, Bob Martin"*

## Use intention revealing names

```
The name of a variable, function, or class, should answer all the big questions. It should tell you why it exists, what it does, and how it is used. If a name requires a comment, then the name does not reveal its intent.
```

Bad
```
int d; // elapsed time in days
```

Good
```
in elapsedTimeInDays
```

## Avoid Disinformation

```
Do not refer to a grouping of accounts as an accountList unless it’s actually a List. The word list means something specific to programmers. If the container holding the accounts is not actually a List, it may lead to false conclusions.1 So accountGroup or bunchOfAccounts or just plain accounts would be better.

C., Martin Robert. Clean Code (p.76). Pearson Education. Kindle 版. 
```

## Make Meaningful Distinctions

```
Number-series naming (a1, a2, .. aN) is the opposite of intentional naming.
```

```
In the absence of specific conventions, the variable moneyAmount is indistinguishable from money, customerInfo is indistinguishable from customer, accountData is indistinguishable from account, and theMessage is indistinguishable from message. Distinguish names in such a way that the reader knows what the differences offer.
```

## Use Pronouncable Names

```
If you can’t pronounce it, you can’t discuss it without sounding like an idiot. “Well, over here on the bee cee arr three cee enn tee we have a pee ess zee kyew int, see?” This matters because programming is a social activity.
```

## Use Searchable Names

```
Likewise, the name e is a poor choice for any variable for which a programmer might need to search. It is the most common letter in the English language and likely to show up in every passage of text in every program. In this regard, longer names trump shorter names, and any searchable name trumps a constant in code.
```

```
My personal preference is that single-letter names can ONLY be used as local variables inside short methods. The length of a name should correspond to the size of its scope [N5]. If a variable or constant might be seen or used in multiple places in a body of code, it is imperative to give it a search-friendly name.
```

## Class Names

```
Classes and objects should have noun or noun phrase names like Customer, WikiPage, Account, and AddressParser. Avoid words like Manager, Processor, Data, or Info in the name of a class. A class name should not be a verb.
```

## Method Names

```
Methods should have verb or verb phrase names like postPayment, deletePage, or save. Accessors, mutators, and predicates should be named for their value and prefixed with get, set, and is according to the javabean standard.4
```

Note: 
Different languages have different standards for naming getters and setters.

For example, comparing Java and Ruby...

Getters
```
Java: getPost()
Ruby: post
```

Setters
```
Java: setPost(arg)
Ruby: post = arg
```

In Ruby, the method definition will look like this
```
def post=(arg)
  self.post = arg
end
```

Predicates
```
Java: isLoggedIn()
Ruby: logged_in?
```

## Pick One Word per Concept

```
it. For instance, it’s confusing to have fetch, retrieve, and get as equivalent methods of different classes.
```

## Final Words

```
The hardest thing about choosing good names is that it requires good descriptive skills and a shared cultural background. This is a teaching issue rather than a technical, business, or management issue. As a result many people in this field don’t learn to do it very well. People are also afraid of renaming things for fear that some other developers will object. We do not share that fear and find that we are actually grateful when names change (for the better).
```

## Naofumi notes

1. Naming is hard. Expect to spend a lot of time thinking about names and changing them.
2. Embrace a culture where changing names does not offend the person who initially wrote them.
3. Java has great IDEs that can change names effortlessly. Use them but also be aware of their limitations (They may not change the stuff in the struts.xml file, for example). Get used to how the refactoring tools in your IDE work.