package com.sf.java7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOSample {

    public static void main(String[] args)
    {
        BufferedReader br = null;
        String sCurrentLine = null;
        try
        {
            br = new BufferedReader(
                    new FileReader("F:\\Git-Demo\\demo\\src\\main\\java\\com\\sf\\java7\\try.txt"));
            while ((sCurrentLine = br.readLine()) != null)
            {
                System.out.println(sCurrentLine);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                if (br != null)
                    br.close();
            } catch (IOException ex)
            {
                ex.printStackTrace();
            }
        }
    }
}
