install: Prism.g4
	java -jar ~/Dev/tools/antlr4.jar Prism.g4 && javac PrismBaseListener.java PrismLexer.java PrismListener.java PrismParser.java
