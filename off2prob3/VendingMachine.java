
//context
package off2prob3;

public class VendingMachine {
  private   State hasMoney;
     private State noMoney;
    private State stockOut;
    private State releaseProduct;
    private State state=stockOut;


    int count;
    int currentMoney;
    public VendingMachine(int numOfProducts)
    {
        count=numOfProducts;
        hasMoney=new HasMoneyState(this);
        noMoney= new NoMoneyState(this);
        stockOut=new StockOutState(this);
        releaseProduct=new ReleaseProductState(this);
        this.count=numOfProducts;
        if(count>0)
            state=noMoney;
    }
//   public void checkState()
//   {   while(state!=stockOut) {
//       if (state == noMoney)
//           new NoMoneyState(this);
//       else if (state == hasMoney) {
//           new HasMoneyState(this, 14);
//          // System.out.println("here");
//       }
//   }
//
//   }


    public void setState(State s)
    {
        this.state=s;
    }

    public State getHasMoney() {
        return hasMoney;
    }

    public State getNoMoney() {
        return noMoney;
    }

    public State getStockOut() {
        return stockOut;
    }

    public State getReleaseProduct() {
        return releaseProduct;
    }
    public State getCurrentState(){return this.state;}

    public void start()
    {
     state.machinePrompt();
    }
}
