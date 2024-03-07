package in.dev.gmsk.tia;

public class UpdateStockNewLogic {


    public static void stockUpdatingCalculation(int actualProjectsQty, int actualMinimumQty, int poReceivedQty, int poUpdatedQty) {

        if (actualProjectsQty >= poUpdatedQty) {

            int remainingProjectQty = actualProjectsQty - poUpdatedQty;
            int updatingProjectQty;

            System.out.println( "remainingProjectQty = " + remainingProjectQty );

            if (remainingProjectQty >= poReceivedQty) {

                updatingProjectQty = poReceivedQty;
                System.out.println( "updatingProjectQty = " + updatingProjectQty );
            } else {

                updatingProjectQty = poReceivedQty - remainingProjectQty;
                poReceivedQty = poReceivedQty - updatingProjectQty;
            }
        }

        if (poReceivedQty != 0) {
            int remainingMinmiumQty = actualProjectsQty + actualMinimumQty - poUpdatedQty;

            System.out.println( "remainingMinmiumQty = " + remainingMinmiumQty );
        }
    }
}
