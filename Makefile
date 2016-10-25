#makefile of the sbib project
JC=javac
JR = java

all : Test

Test : BibEntry.class


BibEntry.class : BibEntry.java 
	$(JC) $^

