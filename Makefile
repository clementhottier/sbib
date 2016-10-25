#makefile of the sbib project
JC=javac
JR = java

all : Test

Test : Test.java BibEntry.class
	$(JC) Test.java


BibEntry.class : BibEntry.java 
	$(JC) $^

