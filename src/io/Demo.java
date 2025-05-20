package io;

import java.io.*;

public class Demo {

    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:" + File.separator + "\\Users\\Work\\IdeaProjects\\DWP-Java\\output.txt"));) {

            bw.write("Hello World");

            bw.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (Utils utils = new Utils();) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"));) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
//            JAVA 8 version: br.lines().forEach(line -> System.out.println(line));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
