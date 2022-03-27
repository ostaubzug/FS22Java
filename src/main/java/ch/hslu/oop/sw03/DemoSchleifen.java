/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.oop.sw03;

/**
 *
 * @author ostau
 */

/**
 * Beschreiben Sie hier die Klasse DemoSchleifen.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class DemoSchleifen
{
    public void printOneToTenForLoop()
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }
    }
    
    public void printOneToTenWhileLoop()
    {
        int i = 1;
        while (i <= 10)
        {
            System.out.println(i);
            i++;
        }
    }
    
    public void printOneToTenDoWhileLoop()
    {
        int i = 1;
        do{
            System.out.println(i);
            i++;            
        }while(i <= 10);
    }
    //Ich glaube float ist zu wenig genau für diese Aufgabe weil es nur etwa 7 relevante Stellen gibt.
    public void WhileLoopFloat()
    {
        float f = 0.9f;
        int counter = 0;
        while(f <= 1.0)
        {
            System.out.println(f);
            f += 0.000025f;
            counter++;
        }
        System.out.println(counter);
    }
    public void ForLoopFloat()
    {
        float f = 0.9f;
        for (int i = 0; i < 4000; i++)
        {
            System.out.println(f);
            f += 0.000025;
        }       
    }
    
    public void printBox(final int height, final int width)
    {
        System.out.println(getFullLine(width));
        for (int i = 0 ; i < height -2; i++)
        {
            System.out.println(getMiddleLine(width));
        }
        System.out.println(getFullLine(width));
    }
    private String getFullLine(final int width)
    {
        String output = "";
        for(int i = 0;i < width;i++)
        {
            output += "#";
        }
        return output;
    }
    private String getMiddleLine(final int width)
    {
        String placeHolder = "";
        for (int i = 0; i < width -2; i++)
        {
            placeHolder += " ";
        }
        return "#" + placeHolder + "#";
    }
}

