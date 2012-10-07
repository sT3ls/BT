/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sT3ls
 */
public class MainClass 
{
    public static void main(String[] args)
    {
        Tree T = new Tree();
        T.AddChildrens(2);
        System.out.println(T.ResultCountApex(T));
        
    }
    
}
