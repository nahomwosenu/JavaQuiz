/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nahom.javaquiz;

/**
 *
 * @author Nahom
 */
import android.content.Context;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DBNAME = "Quiz";
    private static final int VERSION = 1;

    DatabaseHelper(Context con) {
        super(con, DBNAME, null, VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table quiz("
                + "question TEXT,"
                + "choicea TEXT",
                +"choiceb TEXT",
                +"choicec TEXT",
                +"choiced TEXT",
                +"id INTEGER primary key"
                + "level TEXT",
                +"answer text"
                + ")");
        ContentValues values = new ContentValues();
        values.put("question", "what is Java?");
        values.put("choicea", "A. Is an object oriented & interpreted programming language");
        values.put("choiceb", "B. Is just a runtime enviroment");
        values.put("choicec", "C. Is a platform dependent programming language and runtime");
        values.put("choiced", "D. All of the above");
        values.put("answer", "A");
        values.put("type", "simple");
        values.put("id", 1);

        db.insert(DBNAME, null, values);
    }

    String questions[] = new String[30];
    String choices[][] = new String[30][4];
    String answers[] = new String[30];
    String types[] = new String[30];
    String levels[] = {"simple", "medium", "hard"};

    public void prepareQuestions() {
        questions[0] = "Which of the following is not a valid java statement?";
        choices[0][0] = "A. System.out.println(\"hello world\");";
        choices[0][1] = "B. int a=(int)(5+10.4);";
        choices[0][2] = "C. Integer a=5+10;";
        choices[0][3] = "D. boolean b=1;";
        answers[0] = "D";
        types[0] = levels[0];
        questions[1] = "A Java program is compiled into: ";
        choices[1][0] = "A. Excutable machine code";
        choices[1][1] = "B. Recompilable Machine code";
        choices[1][2] = "C. Byte code";
        choices[1][3] = "D. All";
        answers[1] = "C";
        types[0] = levels[0];
        questions[2] = "Which of the following is used to run java programs on diffrent platforms";
        choices[2][0] = "A. The operating System";
        choices[2][1] = "B. JDK (Java Development Kit)";
        choices[2][2] = "C. JVM (Java Virtual machine)";
        choices[2][3] = "D. none";
        answers[2] = "C";
        types[2] = levels[0];
        questions[3] = "Which of the following is not a java native data type ";
        choices[3][0] = "A. double";
        choices[3][1] = "B. String ";
        choices[3][2] = "C. float ";
        choices[3][3] = "D. int ";
        answers[3] = "B";
        types[3] = levels[0];
        questions[4] = "Which of the following is not true about java";
        choices[4][0] = "A. Is Multi-threaded language";
        choices[4][1] = "B. Is Platform Independent language";
        choices[4][2] = "C. Is a programming language and platform";
        choices[4][3] = "D. None";
        answers[4] = "D";
        types[4] = levels[0];
        questions[5] = "Which of the following is the correct form of object instantiation";
        choices[5][0] = "A. String name=\"nahom\";";
        choices[5][1] = "B. String name=new String(\"nahom\");";
        choices[5][2] = "C. String name='nahom'";
        choices[5][3] = "D. A & B";
        answers[5] = "D";
        types[5] = levels[0];
        questions[6] = "What file name extension is used for java source files?";
        choices[6][0] = "A. .txt";
        choices[6][1] = "B. .java";
        choices[6][2] = "C. .class";
        choices[6][3] = "D. .src";
        answers[6] = "B";
        types[6] = levels[0];
        questions[7] = "How to compile a java source from command line";
        choices[7][0] = "A. java className.java";
        choices[7][1] = "B. javac className";
        choices[7][2] = "C. java className";
        choices[7][3] = "D. javac className.java";
        answers[7] = "D";
        types[7] = levels[0];
        questions[8] = "One of the following is an illegal Variable name in java";
        choices[8][0] = "A. int _StudentQuantity";
        choices[8][1] = "B. int $Student_Quantity";
        choices[8][1] = "C. int StudentQuantity1";
        choices[8][3] = "D. int 1StudentQuantity";
        answers[8] = "D";
        types[8] = levels[0];
        questions[9] = "Which of the following is a not a reserved name in java";
        choices[9][0] = "A. final";
        choices[9][1] = "B. const";
        choices[9][2] = "C. static";
        choices[9][3] = "D. virtual";
        answers[9] = "D";
        types[9] = levels[0];
        questions[10] = "Which one of the following is an incorrect way of concatenating strings in java";
        choices[10][0] = "A. String.concat(Stringa,Stringb)";
        choices[10][1] = "B. Stringa + Stringb";
        choices[10][2] = "C. Stringa.Stringb";
        choices[10][3] = "D. none";
        answers[10] = "C";
        types[10] = levels[0];
        questions[11] = "What is the Output of the following code snippet \n"
                + "String a=\"Nahom\";"
                + "String.concat(a,\" Wosenu\");"
                + "System.out.println(a);";
        choices[11][0] = "A. nahom";
        choices[11][1] = "B. nahom Wosenu";
        choices[11][2] = "C. Nahom";
        choices[11][3] = "D. Nahom Wosenu";
        answers[11] = "D";
        types[11] = levels[1];
        questions[12] = "Which of the following literals are incorrectly related";
        choices[12][0] = "A. // Escape";
        choices[12][0] = "B. /t Tab";
        choices[12][0] = "C. /r Carriege Return";
        choices[12][0] = "D. /s Space";
        answers[12] = "A";
        types[12] = levels[1];
        questions[13] = "What is the result of the following code snippet\n"
                + " double a= 9 + 6 - 3 * 6 / 2;";

        choices[13][0] = "A. 36";
        choices[13][1] = "B. 6";
        choices[13][2] = "C. 24";
        choices[13][3] = "D. 0";
        answers[13] = "B";
        types[13] = levels[1];
        questions[14] = "What is the output of the following code"
                + "\nboolean isStudent=true;"
                + "\nint age=21;"
                + "\nif(isStudent){"
                + "\n\tif(age<20){"
                + "\n\t System.out.print(\"Too young!\");"
                + "\n\t}"
                + "\n\telse{"
                + "\n\tSystem.out.print(\"Qualified\");"
                + "\n\t}"
                + "\n}";
        choices[14][0] = "A. Too young!";
        choices[14][1] = "B. Qualified";
        choices[14][2] = "C. Too young! Qualified";
        choices[14][3] = "D. No output";
        answers[14] = "B";
        types[14] = levels[1];
        questions[15] = "What is the output of the following code snippet"
                + "\nint [] numbers = {10, 20, 30, 40, 50};\n"
                + "\n"
                + "      for(int x : numbers ) {\n"
                + "         if( x == 30 ) {\n"
                + "	      break;\n"
                + "         }\n"
                + "         System.out.print( x );";
        choices[15][0] = "A. 10 20 30 40 50";
        choices[15][0] = "B. 10 20 30 40";
        choices[15][0] = "C. 10";
        choices[15][0] = "D. 10 20";
        answers[15] = "D";
        types[15] = levels[1];
        questions[16] = "What is the Error of the following code"
                + "\nPublic void calculate(){\n"
                + "	int x;\n"
                + "	int y;\n"
                + "            System.out.println(x+y);\n"
                + "            }";
        choices[16][0] = "A. variable x not initialized";
        choices[16][1] = "B. variable y not initialized";
        choices[16][2] = "C. method println not defined";
        choices[16][3] = "D. A & B";

        answers[16] = "D";
        types[16] = levels[1];
        questions[17] = "What is the output of the following code"
                + "\npublic class Human{\n"
                + "    	private String name=\"Nahom\";\n"
                + "    	private int age;\n"
                + "    	public void print(){\n"
                + "    		System.out.println(\"My name is: \"+name+\" and I'm \"+age+\" years old\");\n"
                + "    	}\n"
                + "    	public static void main(String args[]){\n"
                + "    		Human human=new Human();\n"
                + "    		human.print();\n"
                + "    	}\n"
                + "    }";
        choices[17][0] = "A. No output";
        choices[17][1] = "B. My name is: nahom";
        choices[17][2] = "C. My name is: nahom and I'm 21 years old";
        choices[17][3] = "D. My name is: nahom and I'm 0 years old";
        answers[17] = "D";
        types[17] = levels[1];
        questions[18] = "Which of the following is an Illegal Casting?";
        choices[18][0] = "A. int x=10;\n"
                + "     double y=x;";
        choices[18][1] = "B. double x=5;\n"
                + "     int y=(int)x;";
        choices[18][2] = "C. int x=(int)10/3;\n"
                + "     float y=x;";
        choices[18][3] = "D. None";
        answers[18]="D";
        types[18]=levels[1];
        
        questions[19]="Which of the following is incorrect about static variables";
        choices[19][0]="A. Initialized When Object created, \n" +
"      Destroy when Object Destroyed ";
        choices[19][1]="B. Shared by all objects of the class";
        choices[19][2]="C. Can be accessed without an Object";
        choices[19][3]=" D. none";
        answers[19]="A";
        types[19]=levels[1];
        
        questions[20]="What is the output of the following code snippet\n" +
"     String name=\"Nahom AlphaGeek \";\n" +
"     String s=name.substring(6,15);\n" +
"     System.out.println(s);";
        choices[20][0]="A. Nahom";
        choices[20][1]="B. AlphaGeek";
        choices[20][2]="C. Geek";
        choices[20][3]="D. Alpha";
        answers[20]="B";
        types[20]=levels[1];
        
        questions[21]="What is the output of the following code snippet\n" +
"     String name=\"Nahom AlphaGeek\";\n" +
"     String mix=String.reverse(name.substring(0,5));\n" +
"     System.out.println(mix);";
        choices[21][0]="A. Nahom AlphaGeek";
        choices[21][1]="B. Nahom";
        choices[21][2]="C. GeekAlpha Nahom";
        choices[21][3]="D. mohaN";
        answers[21]="D";
        types[21]=levels[2];
        
        questions[22]="What is the output of the following code snippet\n" +
"      int x=10;\n" +
"      try{\n" +
"      	x=x/0;\n" +
"      }catch(Exception e){\n" +
"      	System.out.println(\"Input Error\");\n" +
"      }";
        choices[22][0]="A. 0";
        choices[22][1]="B. 10";
        choices[22][2]="C. Undefined";
        choices[22][3]="D. Input Error ";
        answers[22]="D";
        types[22]=levels[2];
        
        questions[23]="";
        choices[23][0]="";
        choices[23][1]="";
        choices[23][2]="";
        choices[23][3]="";
        answers[23]="";
        types[23]=levels[2];
        
        questions[24]="";
        choices[24][0]="";
        choices[24][1]="";
        choices[24][2]="";
        choices[24][3]="";
        answers[24]="";
        types[24]=levels[2];
        
        questions[25]="";
        choices[25][0]="";
        choices[25][1]="";
        choices[25][2]="";
        choices[25][3]="";
        answers[25]="";
        types[25]=levels[2];
        
        questions[26]="";
        choices[26][0]="";
        choices[26][1]="";
        choices[26][2]="";
        choices[26][3]="";
        answers[26]="";
        types[26]=levels[2];
        
        questions[27]="";
        choices[27][0]="";
        choices[27][1]="";
        choices[27][2]="";
        choices[27][3]="";
        answers[27]="";
        types[27]=levels[2];
        
        questions[28]="";
        choices[28][0]="";
        choices[28][1]="";
        choices[28][2]="";
        choices[28][3]="";
        answers[28]="";
        types[28]=levels[2];
        
        questions[29]="";
        choices[29][0]="";
        choices[29][1]="";
        choices[29][2]="";
        choices[29][3]="";
        answers[29]="";
        types[29]=levels[2];
        
        questions[30]="";
        choices[30][0]="";
        choices[30][1]="";
        choices[30][2]="";
        choices[30][3]="";
        answers[30]="";
        types[30]=levels[2];
        
        questions[31]="";
        choices[31][0]="";
        choices[31][1]="";
        choices[31][2]="";
        choices[31][3]="";
        answers[31]="";
        types[31]=levels[2];
        
        questions[32]="";
        choices[32][0]="";
        choices[32][1]="";
        choices[32][2]="";
        choices[32][3]="";
        answers[32]="";
        types[32]=levels[2];
        
        
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
