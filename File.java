import java.io.BufferedWriter;
import java.io.FileWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.io.*;
import java.util.*;
//will not be an object, static methods to write files and stuff

class File {
  public static void write(String message, String pathway) {
    String s = pathway;
    String m = message;

    try {
      // Connect to the file; create it if necessary
      FileWriter fw = new FileWriter(s);
      // Attach a buffer to the file
      BufferedWriter bw = new BufferedWriter(fw);

      bw.write(m);
      bw.close();
    } catch (Exception e) {

    }
  }

  public static String read(String pathway) {
    String st = pathway;
    String thing = "";
    String s;

    try {
      // Connect to the file; create it if necessary
      FileReader fr = new FileReader(st);
      // Attach a buffer to the file
      BufferedReader br = new BufferedReader(fr);
      while ((s = br.readLine()) != null) {
        thing += s + "\n";

      }
      br.close();
    } catch (Exception e) {

    }

  return thing;
  }

  public static void copy(String file1, String file2) {
      try {

      // This will read the old scoreboard
      BufferedReader br = new BufferedReader(new FileReader(file1));

      // this will write the old scoreboard into a temporary
      BufferedWriter bwt = new BufferedWriter(new FileWriter(file2));

      // creation of a string to read
      String s;

      // will write everything from the original file into the copy
      while ((s = br.readLine()) != null) {
        bwt.write(s + "\n");

      }

      // close reader and writier 
      br.close();
      bwt.close();

    } catch (Exception e) {}
  }
}