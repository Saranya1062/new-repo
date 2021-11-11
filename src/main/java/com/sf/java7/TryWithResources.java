package com.sf.java7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

        public static void main(String[] args)
        {
            try (BufferedReader br = new BufferedReader(new FileReader("F:\\Git-Demo\\demo\\src\\main\\java\\com\\sf\\java7\\try.txt")))
            {
                String input;
                while ((input = br.readLine()) != null)
                {
                    System.out.println(input);
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
}
