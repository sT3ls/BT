/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sT3ls
 */
public class Tree 
{
    private Tree Right;
    private Tree Left;
    private Double oldIdApex = Math.random();
    private int countapex;
    
    public Tree(double idApex)
    {
        this.oldIdApex=idApex;
    }
    
    public Tree()
    {
        this.oldIdApex=Math.random();
    }
    
    private void AddNewApex(Tree T, double idApex)
    {
        if(T.oldIdApex<idApex)
        {
            if(T.Right!=null) AddNewApex(T.Right,idApex);
            else T.Right = new Tree(idApex);
        }
        else if(T.oldIdApex>idApex)
        {
            if(T.Left!=null) AddNewApex(T.Left,idApex);
            else T.Left = new Tree(idApex);
        }
    }
    
    public void AddChildrens(int countchildren)
    {
        for(int i=0;i<countchildren;i++)
        {
            this.AddNewApex(this, Math.random());
            System.out.println("Added apex number="+(i+1));
        }
    }
    
    private void CountApex(Tree T)
    {
        countapex++;
        if(T.Left!=null)
            CountApex(T.Left);
        if(T.Right!=null)
            CountApex(T.Right);
    }
    
    public int ResultCountApex(Tree T)
    {
        CountApex(T);
        return countapex;
    }
    
}
