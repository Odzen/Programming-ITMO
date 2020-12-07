javac -d out -classpath Libs/* -sourcepath src src/startBattle/StartBattle.java
jar cfm StartBattle.jar manifest.mf -C out/ . 
 
