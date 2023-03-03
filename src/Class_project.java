
import javax.swing.JFrame;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;

/**
 *
 * @author Bruce Elea
 */
public class Class_project {

    public double Fillet_O_Fish;
    public double ChickenBurger;
    public double ChickenLegend;
    public double ChickenBurgerM;
    public double CheeseBurger;
    public double BaconCheeseBurger;
    
    public double HotMilk;
    public double MilkShake;
    public double VanillaCone;
    public double ClassicVanilla;
    public double VanillaMilkShake;
    public double ChocolateMilkShake;
    
    public double Meals;
    public double Drinks;
    public double TotalofMD;
    
     public double AllTotalofMD;
    
    public double GetAmount(){
        
    Meals = Fillet_O_Fish + ChickenBurger + ChickenLegend + ChickenBurgerM + CheeseBurger + BaconCheeseBurger ;
    
    Drinks = HotMilk + MilkShake + VanillaCone + ClassicVanilla + VanillaMilkShake + ChocolateMilkShake ;
    
    TotalofMD = Meals + Drinks;
    
    AllTotalofMD = TotalofMD;
    
    return AllTotalofMD;
    }
 
    private JFrame frame;
    
    public void iExitSystem()
    {
        frame = new JFrame("Exit");
        
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","RED STAR RESTO", 
                JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
            
    }
//================================Price===================================
    
    public double pFillet_O_Fish = 4;
    public double pChickenBurger = 2.50;
    public double pChickenLegend = 3;
    public double pChickenBurgerM = 3;
    public double pCheeseBurger = 2.50;
    public double pBaconCheeseBurger =  5;
    
    public double pHotMilk = 2;
    public double pMilkShake = 2;
    public double pVanillaCone = 1;
    public double pClassicVanilla =3;
    public double pVanillaMilkShake =3.50;
    public double pChocolateMilkShake =3.50;
    
//========================================================================
    
    public double mcTax = 0.3;
    
    public Double cFindTax(double cAmount){
        double FindTax = cAmount *  mcTax;
        return  FindTax;
    }
    
//========================================================================
}
