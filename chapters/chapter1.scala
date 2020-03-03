// Scala for the Impatient
// Cay S Horstmann

// Chapter 1 Review

/*

In this chapter, the book highlights using the REPL, so a lot of work will be done in the command line.  
I installed scala using homebrew (`brew install scala`), but in the future I'll be using IntelliJ IDEA CE

After brew install, the following were printed out, which I might need to revisit if things
don't work the way they should

==> openjdk (java)
For the system Java wrappers to find this JDK, symlink it with
sudo ln -sfn /usr/local/opt/openjdk/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk.jdk

openjdk is keg-only, which means it was not symlinked into /usr/local,
because it shadows the macOS `java` wrapper.

If you need to have openjdk first in your PATH run:
echo 'export PATH="/usr/local/opt/openjdk/bin:$PATH"' >> ~/.zshrc

For compilers to find openjdk you may need to set:
export CPPFLAGS="-I/usr/local/opt/openjdk/include"

==> scala
To use with IntelliJ, set the Scala home to:
  /usr/local/opt/scala/idea 

*/

Int_result = 8*5+2                      // type is Int
Double_result = 0.5 * Int_result        // type is Double
string_result = "Hello" + Double_result // type is java.lang.string (my repl just says String?)

// The following operations can be found for strings using tab complete in the REPL
string_result.toUpperCase
string_result.toLowerCase
string_result.toString
// and many many others

/* 
The to- operators are not necessarily easily reversible.
For example, saying res1 = "Hello" and res1.toCharArray leads to
res4: Array[Char] = Array(H,e,l,l,o)
but taking res4.toString leads to
res6: String = [C@54f373d4
I'm guessing there might be other options I'm missing to enable this
*/

/*
Declaring values and variables
- values cannot be reassigned
- variables can be reassigned
*/

val answer = 8 * 5 + 2
var counter = 0
// var can be reassigned to 1,2,3..etc but val must always be 42


