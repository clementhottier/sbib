#makefile of the sbib project
JC=javac
JR = java

all : SBib

Test : BibEntry.class Test.java 
	$(JC) Test.java

SBib : BibEntry.class SBib.java
	$(JC) SBib.java

BibEntry.class : BibEntry.java 
	$(JC) $^

run : SBib 
	$(JR) $^
