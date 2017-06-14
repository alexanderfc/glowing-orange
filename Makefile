clean:
	rm -rf *.class

compile:
	javac -d . src/test/java/*.java

test:
	java TestsClass